package Com.destination.JFS.Encapsulationday20;

public class Launchdog {
		private String name;
		private String color;
		private String breed;
		private int age;
		private int cost;
		
		//generic setter method-1
		void SetData1() {
			name="Rocky";
			color="Black";
			breed="Pug";
			age=5;
			cost=5000;
		
		}
		//generic setter method-2
			void SetData2(String s1,String s2,String s3,int i1,int i2) {
				name="s1";
				color="s2";
				breed="s3";
				age=i1;
				cost=i2;
	}
			//generic getter method
			void getData() {
				System.out.println(name);
				System.out.println(color);
				System.out.println(breed);
				System.out.println(age);
				System.out.println(cost);
				
			}
	}
    class Launch5 {
	public static void main(String[] args) {
		//Launchdog d=new Launchdog();
 //  	d.name="tommy"; //cannot acces the private member.
//		d.color="Brown"; //cannot acces the private member.
//		d.breed="Pug"; //cannot acces the private member.
//		d.age=4; //cannot acces the private member.
//		d.cost=5000; //cannot acces the private member.
//		System.out.println(d.name); //cannot acces the private member.
//		System.out.println(d.color); //cannot acces the private member.
//		System.out.println(d.breed); //cannot acces the private member.
//		System.out.println(d.age); //cannot acces the private member.
//		System.out.println(d.cost); //cannot acces the private member.
		Launchdog d1=new Launchdog();
		d1.SetData1();
		d1.getData();
		System.out.println("===============");
		Launchdog d2=new Launchdog();
		d2.SetData2("jimmy", "Gold Brown", "GR", 4, 5000);
		d2.getData();	
	}
	

}
