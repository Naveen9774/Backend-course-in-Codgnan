package Com.destination.JFS.Abstractionday26;

abstract class Plane {
	void TakeOff() {
		System.out.println("Plane Took Off");
	}
	abstract void fly();
	abstract void land();
}
class cargoPlane extends Plane{
	@Override
	void fly() {
		System.out.println("CargoPlane fly at low heights");
	}
	void land() {
		System.out.println("CargoPlane takes long runway to land");
	}
	
}
class PassengerPlane extends Plane{
	@Override
	void fly() {
		System.out.println("PassengerPlane fly at medium heights");
	}
	void land() {
		System.out.println("PassengerPlane takes up a runeay which is little shorter to land");
	}
}
class FighterPlane extends Plane{
		@Override
		void fly() {
			System.out.println("FighterPlane fly at great heights");
		}
		void land() {
			System.out.println("FighterPlane takes up a runway which is short to land");
		}
	}
class Airport{
		void permit(Plane ref) {
			ref.TakeOff();
			ref.fly();
			ref.land();
		}
	}
	
class abstractLaunchPlane{
public static void main(String[] args) {
	//plane p=new plane();//we cannot instantiate the class plane as it is abstract.
		cargoPlane cp=new cargoPlane();
		FighterPlane fp=new FighterPlane();
		PassengerPlane pp=new PassengerPlane();
		 Airport a = new Airport();
		System.out.println("===================");
		a.permit(cp);
		System.out.println("===================");
		a.permit(pp);
		System.out.println("===================");
		a.permit(fp);
		System.out.println("===================");
		
	}

}








