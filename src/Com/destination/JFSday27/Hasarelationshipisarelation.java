package Com.destination.JFSday27;

public class Hasarelationshipisarelation {
		public class Brain{
			int size;
			int ique;
			public Brain(int size,int ique) {
				super();
				this.size=size;
				this.ique=ique;
			}
			public Brain() {
				// TODO Auto-generated constructor stub
			}
			public int getVersion() {
				return size;
			}
			public int getName() {
				return ique;
				
			}

		}
		class Heart{
			int No_of_beats;
			float Weight;
			public Heart(int No_of_beats,float weight) {
				super();
				this.No_of_beats=No_of_beats;
				this.Weight=Weight;
			}
			public int getNo_of_beats() {
				return No_of_beats;
			}
			public float getsWeight() {
				return Weight;
			}
		}
		class Human{
			Brain Br=new Brain();
			void hascharger(charger c) {
				System.out.println(c.getcompany());
				System.out.println(c.getsvolts());
			}
		}
		class Launch{
			public static void main(String[] args) {
				charger cg=new charger("Samsung",10);
				Mobile m=new Mobile();
				
				System.out.println("Details of OS :");
				System.out.println(m.os.getName());
				System.out.println(m.os. getVersion());
				System.out.println("Details of Charger");
				m.hascharger(cg);
				//killing the mobile
				m=null;
				System.out.println("Details of Charger");
				System.out.println(m.os.getName());
				System.out.println(m.os. getVersion());
				
				System.out.println("Details of OS :");
				System.out.println(m.os.getName());
				System.out.println(m.os. getVersion());
				System.out.println("Details of Charger");
				m.hascharger(cg);
			}
			
		}


	}



