package Com.destination.JFS.Polymorphrismday25;

class Airport{
	void permit(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
		}
	}
	    public class condensedPolymorporphism{
	    public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();
		FighterPlane fp=new FighterPlane();
		PassengerPlane pp=new PassengerPlane();
		Airport a = new Airport();
		
		System.out.println("Cargo Plane Data :");
		a.permit(cp);
		cp.carrygoods();//we cannot have parent type refeance to the specialized method to child class
		
		System.out.println("==============================");
		System.out.println("Passenger Plane Data :");
		a.permit(pp);
		pp.carryHumans();
		System.out.println("====================================");
		System.out.println("Fighter Plane Data :");
		a.permit(fp);
		fp.carryweapons();
		System.out.println("===================================");
		
	}
	
}






