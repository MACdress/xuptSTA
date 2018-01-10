import java.io.*;
import java.net.*;
public class exp_5_3{
    public static void main(String args[]) throws IOException{
        Socket cs = null;
        DataOutputStream os = null;   
        DataInputStream is = null;     
        try{//建立socket连接
            cs = new Socket("localhost", 8000);//发出连接请求
            is = new DataInputStream(cs.getInputStream());        
            os = new DataOutputStream(cs.getOutputStream());    
        }catch(UnknownHostException e){
            System.err.println("不可识别的主机");
            System.exit(0);
        }catch(IOException e){
            System.err.println("无法链接到服务器的8000端口");
            System.exit(0);
        }
        DataInputStream stdIn = new DataInputStream(System.in);
        System.out.print("请输入你的用户名：");
        String username = stdIn.readLine();
        String fromServer, fromUser;
        while((fromServer = is.readUTF()) != null){          
            System.out.println("Server:" + fromServer);
            if(fromServer.equals("bye")) break;
            System.out.print("Client:");
            fromUser = stdIn.readLine();
            os.writeUTF(username + "#" +fromUser);   
            os.flush();
        }
        os.close();    
        is.close();
        stdIn.close();   
        cs.close();    
    }
}