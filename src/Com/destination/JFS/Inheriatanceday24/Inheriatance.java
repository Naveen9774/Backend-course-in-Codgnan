package Com.destination.JFS.Inheriatanceday24;

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
		System.out.println("FighterPlane carryweapons");
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
 public class LaunchPlane{
	public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();
		FighterPlane fp=new FighterPlane();
		PassengerPlane pp=new PassengerPlane();
		
		System.out.println("Cargo Plane Data :");
		cp.takeOff();
		cp.fly();
		cp.land();
		cp.carrygoods();
		
		System.out.println("==============================");
		System.out.println("Passenger Plane Data :");
		pp.takeOff();
		pp.fly();
		pp.land();
		pp.carryHumans();
		System.out.println("====================================");
		System.out.println("Fighter Plane Data :");
		fp.takeOff();
		fp.fly();
		fp.land();
		fp.carryweapons();
		System.out.println("===================================");
		
	}
	
}
}

