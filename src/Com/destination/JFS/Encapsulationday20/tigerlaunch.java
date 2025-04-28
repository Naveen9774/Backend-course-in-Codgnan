package Com.destination.JFS.Encapsulationday20;

public class tigerlaunch {
	//Solution to Shadowing problems is provided using "this" keyword.
	//"this" keyword point to the instance variables of the class.
		 String name;
		 String country;
		 int age;
		
		//generic setter method-2
			void SetData2(String name,String country,int age) {
				this.name=name;
				this.country=country;
				this.age=age;
	}
			//generic getter method
			void getData() {
				System.out.println(name);
				System.out.println(country);
				System.out.println(age);
				
			}
	}



	class Launch7 {
	public static void main(String[] args) {
		tigerlaunch t=new tigerlaunch();
		t.SetData2("Ramu", "India", 5);
		t.getData();
	}
	

}
