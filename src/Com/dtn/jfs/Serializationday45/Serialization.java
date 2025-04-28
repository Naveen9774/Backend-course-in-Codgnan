package Com.dtn.jfs.Serializationday45;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {
	public static void main(String[] args) throws Exception {
		Cricketer c1 = new Cricketer("Rohith", "India", 200, 180, 13000);
		System.out.println(c1);
		
		String path = "C:\\Users\\Naveen\\Downloads\\myapp\\myapp\\src\\Components\\Cricketer.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(c1);
		
		System.out.println("Object is stored in the permanent storage");
	}

}
