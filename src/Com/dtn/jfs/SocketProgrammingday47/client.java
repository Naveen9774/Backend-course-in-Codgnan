package Com.dtn.jfs.SocketProgrammingday47;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {
	public static void main(String[] args) throws Exception{
		Socket csoc=new Socket("192.168.52.10",6000);
		OutputStream os=csoc.getOutputStream();
		DataOutputStream dos=new DataOutputStream(os);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Message");
		String message=sc.nextLine();
		dos.writeUTF(message);
		
		
	}

}