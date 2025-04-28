package Com.destination.JFSday28;

interface calculator1 { //point 1
	public abstract void mod();//point 8
	public abstract void add();
	public abstract void div(int a,int b);
	static void mul() {
		
	}
	default void sub() {
		
	}

}
//point 7
class child1 implements calculator1 //point4
public class interfacecode1{
	public static void main(String[] args) {
		//point5
		calculator1 c=new calculator1();
		//point6
		calculator1 calcy1;
		//point14
		calculator1 c1=new calculator1() {
			//override
			
		}
	}
}
