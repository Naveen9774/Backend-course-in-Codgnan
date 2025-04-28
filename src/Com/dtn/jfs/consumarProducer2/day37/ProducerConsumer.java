package Com.dtn.jfs.consumarProducer2.day37;


	class Producer extends Thread{
		Queue a;
		public Producer(Queue q) {
			a=q;
		}
		//Override
		public void run() {
			int i=1;
			while(true) {
				a.produce(i++);
			}
		}	
	}

class Consumer extends Thread{
	Queue b;
	public Consumer(Queue q) {
		b=q;
	}
	//Override
	public void run() {
		while(true) {
			b.consume();
		}
	}
}
class Queue{
	int x;
	public void produce(int i) {
		x=i;
		System.err.println("Producer has produced the data "+i+"into x. ");
	}
	public void consume() {
		System.err.println("Consume has consumed the data "+x+" fromx.");
	}
}
class LaunchProConsumer{
	public static void main(String[] args) {
		Queue q=new Queue();
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);
		p.start();
		c.start();
	}
}
