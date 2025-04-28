package Com.destination.JFS.GetterSetter.Encapday20;

/* Shadowing problems: 
 * This program demonstrates variable shadowing, a scenario where the compiler 
 * gets confused between local variables and instance variables with the same name.
 * Local variables take precedence over instance variables within the method scope.
 */

class Tiger {
    // Instance variables (attributes of the Tiger class)
    String name;
    String country;
    int age;

    // Generic setter method to set the values of instance variables
    // Here, method parameters have the same names as instance variables
    void SetData2(String name, String country, int age) {
        // Shadowing problem: 
        // The parameters `name`, `country`, and `age` overshadow the instance variables.
        // These assignments only modify the local parameters, not the instance variables.
        name = name;      // Assigning the parameter `name` to itself
        country = country; // Assigning the parameter `country` to itself
        age = age;        // Assigning the parameter `age` to itself
    }

    // Generic getter method to print the values of instance variables
    void getData() {
        System.out.println(name);   // Prints the instance variable `name`
        System.out.println(country); // Prints the instance variable `country`
        System.out.println(age);    // Prints the instance variable `age`
    }
}
class Shadowingprob {
    public static void main(String[] args) {
        // Create an object of the Tiger class
        Tiger t = new Tiger();

        // Attempt to set values for the instance variables using the setter method
        t.SetData2("Ramu", "India", 5);

        // Print the values of instance variables
        // Expected: "Ramu", "India", 5
        // Actual: null, null, 0 (because of the shadowing problem in SetData2 method)
        t.getData();
    }
}
