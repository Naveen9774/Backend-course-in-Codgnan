package Com.destination.JFS.Inheriatanceday24;

public class Animal {
		void eat() {
			System.out.println("Aniaml eats");
		}
		void sleep() {
			System.out.println("Animal sleep");
		}
		void breath() {
			System.out.println("Aniamls breaths");
		}
		
	}
	class Cow extends Animal{
		@Override
		void eat() {
			System.out.println("Cow eats grass(Herbivores)");
		}
		void cowLS() {
			System.out.println("Cow's lifespan is 20 years");
		}
	}
	class Tiger extends Animal{
		@Override
		void eat() {
			System.out.println("Tiger eats meat(Carnivores)");
		}
		void tigerLS() { 
			System.out.println("Tiger's lifespan is 10-15 years");
		}
	}
	class Bear extends Animal{
		@Override
		void eat() {
			System.out.println("Bear eats both maeat and grass(Omnivores)");
		}
		void bearLS() {
			System.out.println("bears life span is 25 years");
		}
	}
	 class AnimalInhertmethods {
		public static void main(String[] args) {
			Cow cw=new Cow();
			Tiger tg=new Tiger();
			Bear br=new Bear();
			
			System.out.println("Cow data");
			cw.eat();
			cw.sleep();
			cw.breath();
			cw.cowLS();
			System.out.println("------------------------");
			System.out.println("Tiger data");
			tg.eat();
			tg.sleep();
			tg.breath();
			tg.tigerLS();
			System.out.println("------------------------");
			System.out.println("Bear data");
			 br.eat();
			br.sleep();
			br.breath();
			br.bearLS();
			System.out.println("------------------------");
			
		}
	}

