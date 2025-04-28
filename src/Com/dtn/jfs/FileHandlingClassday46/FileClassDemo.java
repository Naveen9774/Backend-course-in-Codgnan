package Com.dtn.jfs.FileHandlingClassday46;

import java.io.File;

public class FileClassDemo {
	public static void main(String[] args) throws Exception {
		boolean res;
		File f = new File("C:\\Users\\Naveen\\Downloads\\myapp\\myapp\\src\\Components\\Data.txt");
		if(f.exists()!=true) {
			res  = f.createNewFile();
			System.out.println("File is created");
		}
		else {
			System.out.println("File already exits");
		}
		System.out.println("----------------");

		res = f.canExecute();
		if(res==true) {
			System.out.println("File has execution permissions");
		}
		else {
			System.out.println("File does not have execution permissions");

		}
		System.out.println("----------------");


		res = f.canWrite();
		if(res==true) {
			System.out.println("File has write permissions");
		}
		else {
			System.out.println("File does not have write permissions");

		}
		System.out.println("----------------");

		//		res = f.delete();
		//		if(res==true) {
		//			System.out.println("File has been deleted");
		//		}
		//		else {
		//			System.out.println("File has not been deleted");
		//			
		//		}
		//		System.out.println("----------------");

		f.deleteOnExit();


		//		res = f.canWrite();
		//		if(res==true) {
		//			System.out.println("File has write permissions");
		//		}
		//		else {
		//			System.out.println("File does not have write permissions");
		//			
		//		}
		//		System.out.println("----------------");

		System.out.println(f.getAbsolutePath());
		res = f.isAbsolute();
		if(res==true) {
			System.out.println("File path is absolute");
		}
		else {
			System.out.println("File path is not absolute");

		}
		System.out.println("----------------");
		File f1 = f.getAbsoluteFile();
		System.out.println(f1);

		System.out.println(f.getCanonicalPath());
		System.out.println("----------------");
		File f2 = f.getAbsoluteFile();
		System.out.println(f2);
		System.out.println("----------------");

		System.out.println(f.getClass());

		System.out.println("----------------");

		long l = f.getFreeSpace();
		System.out.println("The avaiable free space is ="+l);

		System.out.println("----------------");
		String name = f.getName();
		System.out.println("The file name is  ="+name);
		
		System.out.println("----------------");
		String parent = f.getParent();
		System.out.println("The file name is  ="+parent);
		
		System.out.println("----------------");
		String path = f.getPath();
		System.out.println(path);
		
		System.out.println("----------------");
		long totalSpace = f.getTotalSpace();
		System.out.println("The total allocated space = "+totalSpace);
		
		System.out.println("----------------");
		long usableSpace = f.getUsableSpace();
		System.out.println("The total usable space = "+usableSpace);

		System.out.println("----------------");
		res = f.isDirectory();
		if(res==true) {
			System.out.println("The path contains directory");
		}
		else {
			System.out.println("The path does not lead to  directory");

		}
		System.out.println("----------------");
		res = f.isFile();
		if(res==true) {
			System.out.println("The path contains file");
		}
		else {
			System.out.println("The path does not contains file");

		}
		System.out.println("----------------");




	}
}


