import java.net.*;                               //����������������
import java.io.*;                     //�����������
public class exp_1_1{
    public static void main(String [] args){
        String hostName = "www.xupt.edu.cn";
        int port = 80;
        Socket cs = null;
        try{
            cs = new Socket(hostName, port);
            System.out.println("����"+hostName+"�Ķ˿�"+port+"�ɹ�");
            System.out.println("�Է�����" + cs.getInetAddress() + "���Է��˿�" + cs.getPort());
            System.out.println("��������" + cs.getLocalAddress() + "�����ض˿�" + cs.getLocalPort());
            cs.close();
        }catch(Exception e){
            System.err.println("�޷�����ָ������");
        }
    }
}

