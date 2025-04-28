package Com.dtn.jfs.ThreadTopics2Probday35;

public class RaceCondition {
	class MSoffice extends Thread{
		//Override
		public void run() {
			if(Thread.currentThread().getName().equals("add")) {
				typing();
			}else if(Thread.currentThread().getName().equals("multiplication")) {
				spellCheck();
			
			}else {
				saving();
			}
		}
public void typing() {
	try {
		for(int i=1;i<=5;i++) {
			System.out.println("Typing.......");
			Thread.sleep(3000);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}

}
public void spellCheck() {
	try {
		for(int i=1;i<=5;i++) {
			System.out.println("spellCheck.......");
			Thread.sleep(3000);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}

}
public void saving() {
	try {
		for(int i=1;i<=5;i++) {
			System.out.println("saving.......");
			Thread.sleep(3000);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}

}
		
	}

}
 class ThreadCode5{
	public static void main(String[] args) {
		MSoffice ms1=new MSoffice();
		ms1.setName("typing");
		MSoffice ms2=new MSoffice();
		ms2.setName("typing");
		MSoffice ms3=new MSoffice();
		ms3.setName("typing");
		
		ms1.start();
		ms2.start();
		ms3.start();
		}
}
