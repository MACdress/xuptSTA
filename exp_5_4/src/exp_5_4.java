import java.io.*;
import java.net.*;
public class exp_5_4{//TCP通信，作为服务器
    public static void main(String [] args) throws IOException{
        ServerSocket ss = null; 
        try{
            ss = new ServerSocket(8000); 
            System.out.println("服务器开始监听8000端口的连接请求");
        }catch(IOException e){
            System.err.println("8000端口不能使用");
            System.exit(1);
        }
        Socket cs= null;
        try{
            cs = ss.accept(); 
        }catch(IOException e){
            System.err.println("接收客户机端连接失败");
            System.exit(1);
        }
        DataOutputStream os = new DataOutputStream(cs.getOutputStream());
        DataInputStream is = new DataInputStream(cs.getInputStream());
        String inputStr, outputStr;
        //输出操作
        os.writeUTF("Welcome to My Chat Server");
        os.flush();//立即将数据从输出缓存提交给网络发送
        DataInputStream stdIn =  new DataInputStream(cs.getInputStream()); //获得键盘输入流
        //输入操作
        while((inputStr= is.readLine())!= null){ //接受网络数据
            System.out.println("Customer:" + inputStr); 
            System.out.print("Server:");
            outputStr = stdIn.readLine();  //接受键盘输入
            os.writeUTF(outputStr); //向网络发送数据
            os.flush();
            if(outputStr.equals("bye")) break;
        }
        os.close();//流关闭
        is.close();
        cs.close();//套接字关闭
        ss.close();
    }
}
