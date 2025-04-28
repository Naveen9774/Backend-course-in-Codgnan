package Com.destination.JFS.Variablesday13;

class Calculator {
	void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	void sub(int c, int d) {
		System.out.println(c-d);
	}

}
public class LocalVariableExample{
	public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.add();
		c1.sub(100,50);
	}
}
