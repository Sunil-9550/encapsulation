package examples;

public class hereial_inhertance {
	void add() {
		System.out.println("i am your parent");
	}
	public class child1 extends hereial_inhertance {
		void sub() {
			System.out.println("i am children");
		}
		class child2 extends hereial_inhertance{
			void mul() {
				System.out.println("i am children1");
			}
		}
		public static void main(String[] args) {
			hereial_inhertance sc=new hereial_inhertance();
			sc.add();
			child1 sc1=new child1();
			sc1.add();
			sc1.sub();
			child2 sc2=new child2();
			sc2.add();
		
		}
	}

}
