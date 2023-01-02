import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/**
 * @author bkunzh
 * @date 2022/11/23
 */
public class PortClientTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        for (int i = 0; i < 200; i++) {
            Socket socket = new Socket("127.0.0.1", 10808);
            System.out.println("作为客户端连接");
            //OutputStream outputStream = socket.getOutputStream();
            //System.out.println("写");
            //for (int j = 0; j < 100; j++) {
            //    outputStream.write(j);
            //}
            //InputStream inputStream = socket.getInputStream();
            //System.out.println("开始读：");
            //List<Integer> list = new ArrayList<>();
            //int b = -1;
            //while ((b = inputStream.read()) != -1) {
            //    list.add(-1);
            //}
            //System.out.println(list);


            TimeUnit.SECONDS.sleep(1);
        }


    }
}
