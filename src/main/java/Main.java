import com.xinguang.msgprotocol.client.transfer.*;
import com.xinguang.tubobo.msgprotocol.transfer.CommandPB;
import com.xinguang.tubobo.msgprotocol.transfer.RequestTaskListPB;
import okhttp3.*;
import okio.ByteString;

import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by mark on 17-6-22.
 */
public class Main {

    private static final String APP_CLIENT_ID = "tubobo-rider";
    private static final String PLATFORM_ID = "tubobo";
    private static final String CLIENT_SN = "FA69L0318063";
    private static final String TOKEN = "4b2b08658f6c4e2c9ecf75d3af41c2cc";

    private static final double LATITUDE = 30.231174;
    private static final double LONGITUDE = 120.195844;
    /**
     * 开发环境
     */
    private static final String TBB_WS_URL_DEV = "ws://172.16.1.181:2001/ws";

    /**
     * 测试环境
     */
    private static final String TBB_WS_URL_DEBUG = "ws://172.16.1.180:2001/ws";

    /**
     * 测试环境（外网）
     */
    private static final String TBB_WS_URL_RELEASE_TEST = "ws://101.68.67.180:2001/ws";

    /**
     * 预发环境
     */
    private static final String TBB_WS_URL_PRE = "ws://106.15.131.47:80/ws";


    /**
     * 生产环境
     */
    private static final String TBB_WS_URL_RELEASE_PRODUCT = "ws://orderlinks.yiqiguang.com:80/ws";

    private static final String TWS = "ws://172.16.14.115:20000/webSocket";
    WebSocket mWebSocket;

    public static void main(String[] args) {
        try {
            new Main().run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    void run() throws Exception {
        OkHttpClient client = new OkHttpClient.Builder()
                .pingInterval(5, TimeUnit.SECONDS)
                .build();

        Request request = new Request.Builder()
                .url(TBB_WS_URL_PRE)
                .build();

        CountDownLatch latch = new CountDownLatch(1);


        client.newWebSocket(request, new WebSocketListener() {
            @Override
            public void onOpen(WebSocket webSocket, Response response) {
                super.onOpen(webSocket, response);
                System.out.println("on open");
                mWebSocket = webSocket;

                byte[] bytes = buildGeoMessage(LATITUDE, LONGITUDE).toByteArray();
                ByteString byteString = ByteString.of(bytes, 0, bytes.length);
                mWebSocket.send(byteString);

//                mWebSocket.send(ByteString.)
                ByteBuffer byteBuffer = ByteBuffer.wrap(createRequestList().toByteArray());
                mWebSocket.send(ByteString.of(byteBuffer));
            }

            @Override
            public void onMessage(WebSocket webSocket, String text) {
                super.onMessage(webSocket, text);
                System.out.println("one message text");
            }

            @Override
            public void onMessage(WebSocket webSocket, ByteString bytes) {
                super.onMessage(webSocket, bytes);
                System.out.println("on message binary");
                try {
                    MCProtocolPB.MCProtocol mcProtocol = MCProtocolPB.MCProtocol.parseFrom(bytes.toByteArray());
                    int command = mcProtocol.getCommand();
                    System.out.println("command " + command);
                    System.out.println(mcProtocol.toString());
                    switch (command) {
                    }

                } catch (Exception e) {
                    System.out.println("on pong");
                }
            }

            @Override
            public void onClosing(WebSocket webSocket, int code, String reason) {
                super.onClosing(webSocket, code, reason);
                System.out.println("closing");
            }

            @Override
            public void onClosed(WebSocket webSocket, int code, String reason) {
                super.onClosed(webSocket, code, reason);
                System.out.println("close");
            }

            @Override
            public void onFailure(WebSocket webSocket, Throwable t, Response response) {
                super.onFailure(webSocket, t, response);
                System.out.println("fail");
            }
        });

        latch.await();
    }


    /**
     * 构造经纬度的消息 body
     */
    private GeoPB.Geo fetchGeo(double latitude, double longitude) {
        return GeoPB.Geo.newBuilder()
                .setUserType(UserTypePB.UserType.RIDER)
                .setLatitude(latitude)
                .setLongitude(longitude)
                .build();
    }

    /**
     * 构造地理经纬度的消息主体
     */
    private MCProtocolPB.MCProtocol buildGeoMessage(double latitude, double longitude) {
        byte[] bytes = fetchGeo(latitude, longitude).toByteArray();
        return MCProtocolPB.MCProtocol.newBuilder()
                .setToken(TOKEN)
                .setReqID(String.valueOf(System.currentTimeMillis()))
                .setType(MsgTypePB.MsgType.GPS_REPORT)
                .setClientSN(CLIENT_SN)
                .setPlatformID(PLATFORM_ID)
                .setAppClientID(APP_CLIENT_ID)
                .setBody(com.google.protobuf.ByteString.copyFrom(bytes))
                .build();
    }

    /**
     * 构造请求列表
     * @return
     */
    public MCProtocolPB.MCProtocol createRequestList() {
        RequestTaskListPB.RequestTaskList list = RequestTaskListPB.RequestTaskList.newBuilder()
                .setLongitude(LONGITUDE)
                .setLatitude(LATITUDE)
                .build();

        System.out.println("create request list " + LONGITUDE + " " + LATITUDE);

        MCProtocolPB.MCProtocol mcProtocol = MCProtocolPB.MCProtocol.newBuilder()
                .setClientSN(CLIENT_SN)
                .setAppClientID(APP_CLIENT_ID)
                .setPlatformID(PLATFORM_ID)
                .setToken(TOKEN)
                .setDirection(DirectionPB.Direction.REQUEST)
                .setCommand(CommandPB.Command.REQUEST_TASK_LIST_VALUE)
                .setType(MsgTypePB.MsgType.BUSINESS_API)
                .setBody(list.toByteString())
                .build();
        return mcProtocol;
    }
}
