package Com.dtn.jfs.consumarProducerday37;	
class producer extends Thread{
	queue a;
	public producer (queue q) {
		a=q;
		
	}
	@Override
	public void run() {
		int i=1;
		while(true) {
			a.produce(i++);
		}
	}
}
class consumer extends Thread{
	queue b;
	public consumer (queue q) {
		b=q;
		
	}
	@Override
	public void run() {
		int i=1;
		while(true) {
			b.consume();
		}
	}
	
}

//class Queue{
//	int x ;
//	public void produce(int i) {
//		x=i;
//		System.out.println("Producer has Produced the data "+i+" into x.");
//	}
//	public void consume() {
//	
//		System.out.println("Consumer has consumed the data "+x+" into x.");
//	}
//	
//}

//modify to the program LaunchProdConsumer1
class queue{
	int x ;
	boolean value_of_x=false;

	synchronized public void produce(int i) {
		try{
			if(value_of_x==false) {
				x=i;
				System.out.println("Producer has Produced the data "+i+" into x.");
				value_of_x=true;
				notify();
			}else {
				wait();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	synchronized public void consume() {
		try{
			if(value_of_x==true) {
				System.out.println("Consumer has consumed the data "+x+" into x.");
				value_of_x=false;
				notify();
			}else {
				wait();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
}
public class SolutionForProCon {
	public static void main(String[] args) {
		queue q= new queue();
		producer p= new producer(q);
		consumer c= new consumer(q);
		p.start();
		c.start();
		
	}

}