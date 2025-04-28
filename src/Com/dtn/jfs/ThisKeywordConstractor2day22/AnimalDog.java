package Com.dtn.jfs.ThisKeywordConstractor2day22;
class AnimalDog extends Object {
	private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;
	
	//one parameterized constructor
	public AnimalDog(String name) {
		this("jimmy","GR");
		this.name=name;
	}
	//two parameterized constructor
		public AnimalDog(String name,String breed) {
			this("Rocky","pug","Brown");
			
			this.name=name;
			this.breed=breed;
			System.out.println("contents after Execution of two parameterized constructors");
			System.out.println(this.name);
			System.out.println(this.color);
			System.out.println(this.breed);
			System.out.println(this.age);
			System.out.println(this.cost);
			System.out.println("======================");
	}
		//three parameterized constructor
		public AnimalDog(String name,String breed,String color) {
			this("Harry","Lab","Black",4);
			
			this.name=name;
			this.breed=breed;
			this.color=color;

			System.out.println("contents after Execution of three parameterized constructors");
			System.out.println(this.name);
			System.out.println(this.color);
			System.out.println(this.breed);
			System.out.println(this.age);
			System.out.println(this.cost);
			System.out.println("======================");
		}
		//Four parameterized constructor
				public AnimalDog(String name,String breed,String color,int age) {
					this("Shilly","White","Shitzu",1,8000);
					this.name=name;
					this.breed=breed;
					this.color=color;
					this.age=age;

					System.out.println("contents after Execution of Four parameterized constructors");
					System.out.println(this.name);
					System.out.println(this.color);
					System.out.println(this.breed);
					System.out.println(this.age);
					System.out.println(this.cost);
					System.out.println("======================");
				}
		//Five parameterized constructor
				public AnimalDog(String name,String breed,String color,int age,int cost) {
					this();
					this.name=name;
					this.breed=breed;
					this.color=color;
					this.age=age;
					this.cost=cost;

					System.out.println("contents after Execution of Five parameterized constructors");
					System.out.println(this.name);
					System.out.println(this.color);
					System.out.println(this.breed);
					System.out.println(this.age);
					System.out.println(this.cost);
					System.out.println("======================");
				}
		//zero parameterized constructor
			public AnimalDog() {
				super();
				this.name="tommy"; 
				this.breed="Blue";
				this.color="Pug";
				this.age=2;
				this.cost=4000;
				System.out.println("contents after Execution of ZERO parameterized constructors");
				System.out.println(this.name);
				System.out.println(this.color);
				System.out.println(this.breed);
				System.out.println(this.age);
				System.out.println(this.cost);
				System.out.println("======================");
				
				
			}
			void getData() {
				System.out.println(name);
				System.out.println(color);
				System.out.println(breed);
				System.out.println(age);
				System.out.println(cost);
			}
}

 class Constructors {
	public static void main(String[]args) {
		AnimalDog ad=new AnimalDog();
		ad.getData();
		System.out.println("++++++++++++++==");
		AnimalDog ad1= new AnimalDog("Jipsy");
		ad1.getData();
	}

}
