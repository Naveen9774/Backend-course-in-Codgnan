package Com.dtn.jfs.Serializationday45;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String[] args) throws Exception{
		String path = "C:\\Users\\Naveen\\Downloads\\myapp\\myapp\\src\\Components\\Cricketer.txt";
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Cricketer c1 = (Cricketer) ois.readObject();
		
		System.out.println(c1);
		
	}
	
}
