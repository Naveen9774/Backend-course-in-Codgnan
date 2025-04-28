package Com.destination.JFS.Encapsulationday20;
	//Shadowing problems:It is a scenario where the compiler is under the confusion in different
//						b/w local variable and instance variable.

	class Tiger {
		 String name;
		 String country;
		 int age;
		
		//generic setter method-2
			void SetData2(String name,String country,int age) {
				name=name;
				country=country;
				age=age;
	}
			//generic getter method
			void getData() {
				System.out.println(name);
				System.out.println(country);
				System.out.println(age);
				
			}
	}
	 class Launch6 {
	public static void main(String[] args) {
		Tiger t=new Tiger();
		t.SetData2("Ramu", "India", 5);
		t.getData();
		}
	

}
