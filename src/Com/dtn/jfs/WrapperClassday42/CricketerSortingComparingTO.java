package Com.dtn.jfs.WrapperClassday42;

import java.util.ArrayList;
import java.util.Collections;

	class Cricketer1 implements Comparable<Cricketer> {
		String name;
		int runs; 
		int matchs;
		int catches;
		String country;



		public Cricketer1(String name, int runs, int matchs, int catches, String country) {
			super();
			this.name = name;
			this.runs = runs;
			this.matchs = matchs;
			this.catches = catches;
			this.country = country;
		}

		public String getName() {
			return name;
		}

		public int getRuns() {
			return runs;
		}

		public int getMatchs() {
			return matchs;
		}

		public int getCatches() {
			return catches;
		}

		public String getCountry() {
			return country;
		}

		@Override
		public String toString() {
			return "Cricketer [name=" + name + ", runs=" + runs + ", matchs=" + matchs + ", catches=" + catches
					+ ", country=" + country + "]";
		}
		@Override
		public int compareTo(Cricketer o) {
			if(this.runs < o.runs) {
				return 1;
			}
			else {
				return -1;
			}
		}
	}
	class Launch2{
		public static void main(String[] args) {
			Cricketer c1=new Cricketer("Sachin",15000,300,200,"India");
			Cricketer c2=new Cricketer("ABC",8000,200,100,"SA");
			Cricketer c3=new Cricketer("Naveen",5000,150,200,"USA");
			Cricketer c4=new Cricketer("Vinod",1000,700,70,"UK");

			System.out.println(c1);
			System.out.println(c2);
			System.out.println(c3);
			System.out.println(c4);

			ArrayList<Cricketer> al=new ArrayList<Cricketer>();
			al.add(c1);
			al.add(c2);
			al.add(c3);
			al.add(c4);
			System.out.println(al);
			
			//Collections.sort(al);
			//System.out.println(al);
			
			
		}

	}


