import java.net.*;                               //引用输入与输出类库
import java.io.*;                     //引用网络类库
public class exp_1_1{
    public static void main(String [] args){
        String hostName = "www.xupt.edu.cn";
        int port = 80;
        Socket cs = null;
        try{
            cs = new Socket(hostName, port);
            System.out.println("连接"+hostName+"的端口"+port+"成功");
            System.out.println("对方主机" + cs.getInetAddress() + "：对方端口" + cs.getPort());
            System.out.println("本地主机" + cs.getLocalAddress() + "：本地端口" + cs.getLocalPort());
            cs.close();
        }catch(Exception e){
            System.err.println("无法连接指定服务");
        }
    }
}

