package Com.destination.JFS.GetterSetter.Encapday20;

	//Solution to Shadowing Problems Using "this" Keyword
	//"this" keyword is used to differentiate instance variables from local variables when their names are the same.

	class Tiger1 {
	 // Instance variables (attributes of the Tiger1 class)
	 String name;
	 String country;
	 int age;

	 // Setter method to set the values of instance variables
	 // Parameters have the same names as instance variables
	 void SetData2(String name, String country, int age) {
	     // Use "this" to refer to instance variables explicitly
	     this.name = name;         // Assigns the parameter `name` to the instance variable `name`
	     this.country = country;   // Assigns the parameter `country` to the instance variable `country`
	     this.age = age;           // Assigns the parameter `age` to the instance variable `age`
	 }

	 // Getter method to print the values of instance variables
	 void getData() {
	     System.out.println(name);     // Prints the value of the instance variable `name`
	     System.out.println(country); // Prints the value of the instance variable `country`
	     System.out.println(age);     // Prints the value of the instance variable `age`
	 }
	}

class Shadowingsol {
		
		public static void main(String[] args) {
	        // Create an object of the Tiger1 class
	        Tiger1 t = new Tiger1();

	        // Call the setter method to initialize instance variables
	        t.SetData2("Ramu", "India", 5);

	        // Call the getter method to print the values of instance variables
	        t.getData();  // Output: "Ramu", "India", "5"
	    }
	}





