package Com.destination.JFSday27;

public class HasARelationship {
	double version;
	String name;
	public HasARelationship(double version,String name) {
		super();
		this.version=version;
		this.name=name;
	}
	public double getVersion() {
		return version;
	}
	public String getName() {
		return name;
		
	}

}
class charger{
	String company;
	int volts;
	public charger(String company,int volts) {
		super();
		this.company=company;
		this.volts=volts;
	}
	public String getcompany() {
		return company;
	}
	public int getsvolts() {
		return volts;
	}
}
class Mobile{
	HasARelationship os=new HasARelationship(7.8,"Rainbow");
	void hascharger(charger c) {
		System.out.println(c.getcompany());
		System.out.println(c.getsvolts());
	}
}
class launch1{
	public static void main(String[] args) {
		charger cg=new charger("Samsung",10);
		Mobile m=new Mobile();
		
		System.out.println("Details of OS :");
		System.out.println(m.os.getName());
		System.out.println(m.os. getVersion());
		System.out.println("Details of Charger");
		m.hascharger(cg);
		//killing the mobile
		m=null;
		System.out.println("Details of Charger");
		System.out.println(m.os.getName());
		System.out.println(m.os. getVersion());
		
		System.out.println("Details of OS :");
		System.out.println(m.os.getName());
		System.out.println(m.os. getVersion());
		System.out.println("Details of Charger");
		m.hascharger(cg);
	}

}
