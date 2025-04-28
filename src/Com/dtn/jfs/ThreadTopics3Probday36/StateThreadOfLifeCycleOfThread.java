package Com.dtn.jfs.ThreadTopics3Probday36;

class Warrior extends Thread{
	String res1="Ak47";
	String res2="Snipper";
	String res3="Pistol";
	 @Override
public void run() {
		if(Thread.currentThread().getName().equals("rama")) {
				ramaAcq();
			}else {
				ravanaAcq();
			}
		}
public void ramaAcq() {
			try {
				synchronized (res1) {
					System.out.println("rama has acquired " + res1);
					Thread.sleep(3000);
					synchronized (res2) {
						System.out.println("rama has acquired " + res2);
						Thread.sleep(3000);
						synchronized (res3) {
							System.out.println("rama has acquired " + res3);
							Thread.sleep(3000);

						}

					}
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

			public void ravanaAcq() {
				try {
					synchronized (res1) {
						System.out.println("Ravana has acquired " + res1);
						Thread.sleep(3000);
						synchronized (res2) {
							System.out.println("Ravana has acquired " + res2);
							Thread.sleep(3000);
							synchronized (res3) {
								System.out.println("Ravana has acquired " + res3);
								Thread.sleep(3000);

							}

						}
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		public class StateThreadOfLifeCycleOfThread {
			public static void main(String[] args) {
				Warrior w1 = new Warrior();
				w1.setName("Rama");
				Warrior w2 = new Warrior();
				w2.setName("Ravana");
				w1.start();
				w2.start();
			}
		}

