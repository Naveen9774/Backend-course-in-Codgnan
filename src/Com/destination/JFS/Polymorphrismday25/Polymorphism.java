package Com.destination.JFS.Polymorphrismday25;

   class Plane {
		void takeOff() {
			System.out.println("Plane Took Off");
		}
		void fly() {
			System.out.println("Plane is Flying");
		}
		void land() {
			System.out.println("Plane is landed");
		}

	}
	class CargoPlane extends Plane{
		@Override
		void fly() {
			System.out.println("CargoPlane fly at low heights");
		}
		void carrygoods() {
			System.out.println("CargoPlane carry goods");
		}
		
	}
	class FighterPlane extends Plane{
		@Override
		void fly() {
			System.out.println("FighterPlane fly at great heights");
		}
		void carryweapons() {
			System.out.println("FighterPlane carryweapons");//specializiation
		}
	}
	class PassengerPlane extends Plane{
		@Override
		void fly() {
			System.out.println("PassengerPlane fly at great heights");
		}
		void carryHumans() {
			System.out.println("PassengerPlane carryHumans");
		}
	   class LaunchPlane{
		public static void main(String[] args) {
			CargoPlane cp=new CargoPlane();
			FighterPlane fp=new FighterPlane();
			PassengerPlane pp=new PassengerPlane();
			 Plane ref;//parent handle
			
			System.out.println("Cargo Plane Data :");
			ref=cp;
			ref.takeOff();
			ref.fly();
			ref.land();
			cp.carrygoods();//we cannot have parent type refeance to the specialized method to child class
			
			System.out.println("==============================");
			System.out.println("Passenger Plane Data :");
			ref=pp;
			ref.takeOff();
			ref.fly();
			ref.land();
			pp.carryHumans();
			System.out.println("====================================");
			System.out.println("Fighter Plane Data :");
			ref=fp;
			ref.takeOff();
			ref.fly();
			ref.land();
			fp.carryweapons();
			System.out.println("===================================");
			
		}
		
	}
	
	

}
