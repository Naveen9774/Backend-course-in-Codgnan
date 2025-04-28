package Com.destination.JFS.Variablesday13;

class Animal {
	static String name;
	static String color;
	static String breed;
	static int cost;
	static int age;
	static void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(cost);
		System.out.println(age);
	}
	static void allocateDate() {
		name="tommy";
		color="brown";
		breed="pug";
		cost=4000;
		age=2;
	}
}
class StaticVariableExample 
{
   public static void main(String[] args) {
	   System.out.println("++++++++++++++++++++++++++");
	   Animal.display();
	   Animal.allocateDate();

	   
   }

}
