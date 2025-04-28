package Com.destination.JFS.Abstractionday26;

import java.util.Scanner;
abstract class shapes {
	double area;
	abstract void collectData();
	abstract void calculate();
	void display() {
		System.out.println("The area is : "+area);
		
	}

}
class circle extends shapes {
	private double radius;
	private double pi=3.14768;
	void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle : ");
		radius=sc.nextDouble();
		
	}
	void calculate() {
		area=pi*radius*radius;
		
	}
}
class Rectangle extends shapes{
	private double length;
	private double breath;
	void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of rectangle : ");
		length=sc.nextDouble();
		System.out.println("Enter the breath of rectangle : ");
		breath=sc.nextDouble();
		
		
}
	void calculate() {
		area=length*length;
	}
}
class square extends shapes{
	private double side;
	void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side of square : ");
		side=sc.nextDouble();
		
		
	}
	void calculate() {
		area=side*side;
	}
}
class Geometry{
	void permit(shapes ref) {
		ref.collectData();
		ref.calculate();
		ref.display();
	}
}
 class abstGeometry{
	 public static void main(String[] args) {
		 circle c=new circle();
		 Rectangle r=new Rectangle();
		 square s=new square();
		 Geometry ge=new Geometry();
		 System.out.println("Circle Data :");
		 ge.permit(c);
		 System.out.println("===================");
		 System.out.println("Rectangle Data :");
		 ge.permit(r);
		 System.out.println("===================");
		 System.out.println("Square Data :");
		 ge.permit(s);
		 System.out.println("===================");
	 	
		
	}
	
}
