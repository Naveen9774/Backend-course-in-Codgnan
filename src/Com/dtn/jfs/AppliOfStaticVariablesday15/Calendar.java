package Com.dtn.jfs.AppliOfStaticVariablesday15;

public class Calendar 
{
	static int a,b,c;
	int m,n,o;
	//static block
	static 
	{
		System.out.println("hello");
		a=100;
		b=200;
		c=300;
	}
	//non static block
	{
		m=10;
		n=20;
		o=30;
	}
	//static method
	static void display() 
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	void display1() 
	{
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
	}

}
class staticExample1
{
	public static void main(String[] args) 
	{
		System.out.println("main");
		Calendar.display();
		Calendar c=new Calendar();
		c.display1();
	}
}
