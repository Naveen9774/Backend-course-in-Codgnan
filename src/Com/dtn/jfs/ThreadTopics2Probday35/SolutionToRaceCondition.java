package Com.dtn.jfs.ThreadTopics2Probday35;

 class msoffice1 extends Thread{
	public void run() {
		if(Thread.currentThread().getName().equals("typeing")) {
			typeing();
		}else if(Thread.currentThread().getName().equals("spellcheck")) {
			spellcheck();
		
		}else {
			saving();
		}
	}
	void typeing(){
		
		try {
			
			for(int i=1;i<=5;i++) {
				System.out.println("typeing");
				Thread.sleep(3000);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	void spellcheck(){
			
			try {
				
				for(;;) {
					System.out.println("spellcheck");
					Thread.sleep(3000);
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			}
			void saving(){
				
				try {
					
					for(;;) {
						System.out.println("saving");
						Thread.sleep(3000);
					}
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			public class daemon{
				public static void main(String[] args) {
					msoffice1 ms1=new msoffice1();
					ms1.setName("typeing");
					msoffice1 ms2=new msoffice1();
					ms2.setName("spellcheck");
					msoffice1 ms3=new msoffice1();
					ms3.setName("saving");
					
					ms2.setPriority(8);
					ms3.setPriority(9);
					
					
					ms2.setDaemon(true);
					ms3.setDaemon(true);
					ms1.start();
					ms2.start();
					ms3.start();		
				}
			}	
 }
	
	

	
