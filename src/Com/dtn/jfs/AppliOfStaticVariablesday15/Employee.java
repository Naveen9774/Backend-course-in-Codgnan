package Com.dtn.jfs.AppliOfStaticVariablesday15;

import java.util.Scanner;

class Employee {
	String name;
	static String company;
	int age;
	int salary;
	static {
		company="TCS";
	}
	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name :");
		name =sc.next();
		System.out.println("Enter the age");
		age =sc.nextInt();
		System.out.println("Enter the salary");
		salary =sc.nextInt();
	}
	void display() {
		System.out.println(name);
		System.out.println(company);
		System.out.println(age);
		System.out.println(salary);
	}

}
class staticExample {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.collectData();
		e1.display();
		e2.collectData();
		e2.display();
	}
}

