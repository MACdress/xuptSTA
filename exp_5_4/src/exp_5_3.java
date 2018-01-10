import java.io.*;
import java.net.*;
public class exp_5_3{
    public static void main(String args[]) throws IOException{
        Socket cs = null;
        DataOutputStream os = null;   
        DataInputStream is = null;     
        try{//����socket����
            cs = new Socket("localhost", 8000);//������������
            is = new DataInputStream(cs.getInputStream());        
            os = new DataOutputStream(cs.getOutputStream());    
        }catch(UnknownHostException e){
            System.err.println("����ʶ�������");
            System.exit(0);
        }catch(IOException e){
            System.err.println("�޷����ӵ���������8000�˿�");
            System.exit(0);
        }
        DataInputStream stdIn = new DataInputStream(System.in);
        System.out.print("����������û�����");
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