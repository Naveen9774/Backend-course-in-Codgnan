package Com.dtn.jfs.TpesOfExceptionHandling3day33;

import Com.dtn.jfs.TpesOfExceptionHandling3day33.customerException.Customer;
import Com.dtn.jfs.TpesOfExceptionHandling3day33.customerException.InvalidAccountNoExeption;
import Com.dtn.jfs.TpesOfExceptionHandling3day33.customerException.InvalidPasswordExeption;

public class NetBanking {
		void verify(Customer c) {
			try {
				c.collectionData();
				c.validate();	
			}
			catch (InvalidAccountNoExeption | InvalidPasswordExeption e1) {
				try {
					c.collectionData();
					c.validate();
				}
				catch (InvalidAccountNoExeption | InvalidPasswordExeption e2) {
					try {
						c.collectionData();
						c.validate();
					}
					catch (InvalidAccountNoExeption | InvalidPasswordExeption e3) {
						System.out.println("User is Blocked");
						System.exit(0);
						}
					
					}
				
			}
		}

		public void verify(Com.dtn.jfs.TpesOfExceptionHandling3day33.Customer c1) {
			// TODO Auto-generated method stub
			
		}
}


