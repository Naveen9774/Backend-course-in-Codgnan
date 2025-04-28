package Com.destination.JFS.Polymorphrismday25;
	class Animal{
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

	 class PolymorphismAnimal {
		public static void main(String[] args) {
			
		
			Cow cw=new Cow();
			Tiger tg=new Tiger();
			Bear br=new Bear();
			
			Animal ref; //parent handle
			
			System.out.println("Cow data");
			ref=cw; // parent type reference to child object 
			ref.eat();
			ref.sleep();
			ref.breath();
			cw.cowLS(); //we cannot have parent type reference to the specialized methods of child class
			System.out.println("------------------------");
			System.out.println("Tiger data");
			ref=tg;
			ref.eat();
			ref.sleep();
			ref.breath();
			tg.tigerLS();
			System.out.println("--------------- ---------");
			System.out.println("Bear data");
			ref=br;
			ref.eat();
			ref.sleep();
			ref.breath();
			br.bearLS();
			System.out.println("------------------------");
			
		}
	}



