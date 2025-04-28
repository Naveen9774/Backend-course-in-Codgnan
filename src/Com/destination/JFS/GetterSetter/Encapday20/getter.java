package Com.destination.JFS.GetterSetter.Encapday20;
	class Dog{
		
		private String name;
		private String colour;
		private String breed;
		private int age;
		private int cost; 
		
//		SETTING THE SPECFIC SETTER 
		
		void setname(String name) {
			this.name = name;
		}
		void setcolour(String colour) {
			this.colour = colour;
		}
		void setbreed(String breed) {
			this.breed = breed;
		}
		void setage(int age) {
			this.age = age;
		}
		void setcost(int cost) {
			this.cost = cost;
		}
		
//		SPECFIC GETTER
		
		String getname() {
			return name;
		}
		String getcolour() {
			return colour;
		}
		String getbreed() {
			return breed;
		}
		int getage() {
			return age;
		}
		int getcost() {
			return cost;
		}
		
//		GENERIC SETTER METHODS 1
		void setData1(String name, String color, int age, int cost, String breed) {
			setname(name);
			setcolour(colour);
			setcost(cost);
			setbreed(breed);
			setage(age);
			
		}
//		GENERIC SETTER METHODS 2
		void setData2(String name, String color, int age, int cost, String breed) {
			this.setname(name);
			this.setcolour(colour);
			this.setcost(cost);
			this.setbreed(breed);
			this.setage(age);
		
	}
//		GENERIC GETTER METHODS 1
		
		void getData1() {
			System.out.println(getname());
			System.out.println(getcolour());
			System.out.println(getbreed());
			System.out.println(getage());
			System.out.println(getcost());
		}
//		GENERIC GETTER METHODS2
		
		void getData2() {
			System.out.println(name);
			System.out.println(colour);
			System.out.println(breed);
			System.out.println(age);
			System.out.println(cost);
		}
	public class SpecificSetterAndGetter {
		public static void main(String[] args) {
			Dog d1 = new Dog();
			d1.setname("Jimmy");
			d1.setcolour("Brown");
			d1.setbreed("pug");
			d1.setage(4);
			d1.setcost(5000);
			
			System.out.println(d1.getname());
			System.out.println(d1.getcolour());
			System.out.println(d1.getbreed());
			System.out.println(d1.getage());
			System.out.println(d1.getcost());
			
			System.out.println("==============");
			Dog d2 = new Dog();
			d2.setData1("Rocky", "white", 7000, 4, "GR");
			d2.getData1();
			
			System.out.println("============");
			Dog d3 = new Dog();
			d3.setname("Jimmy");
			d3.setcolour("Red");
			d3.setbreed("Any");
			d3.setage(2);
			d3.setcost(10000);
			
			System.out.println(d2.getname());
			System.out.println(d2.getcolour());
			System.out.println(d2.getbreed());
			System.out.println(d2.getage());
			System.out.println(d2.getcost());
			
			System.out.println("==============");
			System.out.println(d3.getname());
			System.out.println(d3.getcolour());
			System.out.println(d3.getbreed());
			System.out.println(d3.getage());
			System.out.println(d3.getcost());
			
			
			
		}
	}

	}


