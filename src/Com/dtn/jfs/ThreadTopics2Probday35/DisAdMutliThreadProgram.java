package Com.dtn.jfs.ThreadTopics2Probday35;

public class DisAdMutliThreadProgram {
	class Human extends Thread{
		@Override
		public void run(){
			try {
			System.out.println(Thread.currentThread().getName()+" has entered the bathroom");
		    Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" has entered the bathroom");
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getName()+" has entered the bathroom");
			Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
class Threadcode6{
	public static void main(String[] args) {
		Human h1=new Human();
		h1.setName("body");
		Human h2=new Human();
		h1.setName("girls");
		Human h3=new Human();
		h1.setName("others");
		
		h1.start();
		h2.start();
		h3.start();
		
		
	}
	
}
			



