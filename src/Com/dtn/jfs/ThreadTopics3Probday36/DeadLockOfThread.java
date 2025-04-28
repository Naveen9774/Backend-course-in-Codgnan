package Com.dtn.jfs.ThreadTopics3Probday36;
class Warrior1 extends Thread{	
	String res1 = "Ak47";
	String res2 = "sniper";
	String res3 = "gun";
		@Override
public void run() {
	       if(Thread.currentThread().getName().equals("Rama")) {
				ramaAcq();
			}
			else {
				ravanaAcq();
			}
		}
public void ravanaAcq() {
	try {
		synchronized (res1) {
			System.out.println("Ravana has acquired "+res1);
			   Thread.sleep(3000);
		       synchronized (res2) {
		    	   System.out.println("Ravana has acquired "+res2);
						Thread.sleep(3000);
						synchronized (res3) {
							System.out.println("Ravana has acquired "+res3);
							Thread.sleep(3000);
				            }	
				      }
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
public void ramaAcq() {
		try {
			synchronized (res3) {
				System.out.println("Rama has acquired "+res3);
				Thread.sleep(3000);
				synchronized (res2) {
					System.out.println("Rama has acquired "+res2);
					Thread.sleep(3000);
					synchronized (res1) {
						System.out.println("Rama has acquired "+res1);
						Thread.sleep(3000);
			           }	
			      }
			  }
			}catch (Exception e) {
			   e.printStackTrace();
		     }	
		}
	}
public class DeadLockOfThread {
	public static void main(String[] args) {
			Warrior1 w1=new Warrior1();
			w1.setName("Ravana");
			Warrior1 w2=new Warrior1();
			w2.setName("Rama");
			w1.start();
			w2.start();
		}
	}


