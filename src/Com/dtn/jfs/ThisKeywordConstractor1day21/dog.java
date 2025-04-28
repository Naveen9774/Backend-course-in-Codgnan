package Com.dtn.jfs.ThisKeywordConstractor1day21;
	class Dog{
		private String name;
		private String color;
		private int cost;
		private int age;
		private String breed;
		
		//specific setters
		void setName(String name) {
			this.name=name;
		}
		void setColor(String color) {
			this.color=color;
		}
		void setCost(int cost) {
			this.cost=cost;
		}
		void setAge(int age) {
			this.age=age;
		}
		void setBreed(String breed) {
			this.breed=breed;
		}
		
		//specific getters
		String getName() {
			return name;
		}
		String getColor() {
			return color;
		}
		int getCost() {
			return cost;
		}
		int getAge() {
			return age;
		}
		String getBreed() {
			return breed;
		}
		


	//Generic setters
	void setData1(String name,String color,int age,int cost,String breed) {
		setName(name);
		setColor(color);
		setCost(cost);
		setBreed(breed);
		setAge(age);
		
	}
	void setData2(String name,String color,int age,int cost,String breed) {
		this.name=name;
		this.color=color;
		this.breed=breed;
		this.cost=cost;
		this.age=age;
		
	}

	void getData1() {
		System.out.println(getName());
		System.out.println(getColor());
		System.out.println(getBreed());
		System.out.println(getAge());
		System.out.println(getCost());
	}
	void getData2() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(cost);
		System.out.println(age);
	}
	}

	 class code1 {
	   public static void main(String[] args) {
		Dog d1=new Dog();
		d1.setName("jimmy");
		d1.setColor("Brown");
		d1.setBreed("Pug");
		d1.setAge(4);
		d1.setCost(5000);
		
		System.out.println(d1.getName());
		System.out.println(d1.getColor());
		System.out.println(d1.getBreed());
		System.out.println(d1.getAge());
		System.out.println(d1.getCost());
		
		
		System.out.println("=================");
		Dog d2=new Dog();
		d2.setData1("Rocky", "White", 6, 7000, "GR");
		d2.getData1();
		
		//Specific  method
		System.out.println("=================");
		Dog d3=new Dog();
		d3.setName("Jimmy");
		d3.setCost(6000);
		
		System.out.println(d2.getName());
		System.out.println(d2.getColor());
		System.out.println(d2.getBreed());
		System.out.println(d2.getAge());
		System.out.println(d2.getCost());
		
		System.out.println("=================");
		System.out.println(d3.getName());
		System.out.println(d3.getColor());
		System.out.println(d3.getBreed());
		System.out.println(d3.getAge());
		System.out.println(d3.getCost());		
	}
}
