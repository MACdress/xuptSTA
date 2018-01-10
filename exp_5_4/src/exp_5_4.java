import java.io.*;
import java.net.*;
public class exp_5_4{//TCPͨ�ţ���Ϊ������
    public static void main(String [] args) throws IOException{
        ServerSocket ss = null; 
        try{
            ss = new ServerSocket(8000); 
            System.out.println("��������ʼ����8000�˿ڵ���������");
        }catch(IOException e){
            System.err.println("8000�˿ڲ���ʹ��");
            System.exit(1);
        }
        Socket cs= null;
        try{
            cs = ss.accept(); 
        }catch(IOException e){
            System.err.println("���տͻ���������ʧ��");
            System.exit(1);
        }
        DataOutputStream os = new DataOutputStream(cs.getOutputStream());
        DataInputStream is = new DataInputStream(cs.getInputStream());
        String inputStr, outputStr;
        //�������
        os.writeUTF("Welcome to My Chat Server");
        os.flush();//���������ݴ���������ύ�����緢��
        DataInputStream stdIn =  new DataInputStream(cs.getInputStream()); //��ü���������
        //�������
        while((inputStr= is.readLine())!= null){ //������������
            System.out.println("Customer:" + inputStr); 
            System.out.print("Server:");
            outputStr = stdIn.readLine();  //���ܼ�������
            os.writeUTF(outputStr); //�����緢������
            os.flush();
            if(outputStr.equals("bye")) break;
        }
        os.close();//���ر�
        is.close();
        cs.close();//�׽��ֹر�
        ss.close();
    }
}
