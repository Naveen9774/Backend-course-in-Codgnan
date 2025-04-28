package Com.destination.JFS.GetterSetter.Encapday20;
	class Dog1 {
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
				name=s1;
				color=s2;
				breed=s3;
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


class genericsettergetter {

		public static void main(String[] args) {
			//Dog1 d=new Dog1();
//			d.name="tommy"; //cannot access the private member.
//			d.color="Brown"; //cannot access the private member.
//			d.breed="Pug"; //cannot access the private member.
//			d.age=4; //cannot access the private member.
//			d.cost=5000; //cannot access the private member.
//			System.out.println(d.name); //cannot access the private member.
//			System.out.println(d.color); //cannot access the private member.
//			System.out.println(d.breed); //cannot access the private member.
//			System.out.println(d.age); //cannot access the private member.
//			System.out.println(d.cost); //cannot access the private member.
			Dog1 d1=new Dog1();
			d1.SetData1();
			d1.getData();
			System.out.println("===============");
			Dog1 d2=new Dog1();
			d2.SetData2("jimmy", "Gold Brown", "GR", 4, 5000);
			d2.getData();	
		}
		}


