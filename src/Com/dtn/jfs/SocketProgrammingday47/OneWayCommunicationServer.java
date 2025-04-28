package Com.dtn.jfs.SocketProgrammingday47;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class OneWayCommunicationServer {
	public class server{
		public static void main(String[] args) throws Exception {
			ServerSocket listerner=new ServerSocket(4000);
			System.out.println("Server is Ready.");
			Socket ssoc=listerner.accept();
			InputStream is=ssoc.getInputStream();
			DataInputStream dis=new DataInputStream(is);
			String message =dis.readUTF();
			System.out.println(message);
			
			OutputStream os=ssoc.getOutputStream();
			DataOutputStream dos=new DataOutputStream(os);
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter the message of Stream :");
			 message=sc.nextLine();
			dos.writeUTF(message);
		}
	}

}
