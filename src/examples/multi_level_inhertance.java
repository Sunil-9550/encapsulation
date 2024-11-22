package examples;

import examples.multi_level_inhertance.child1.child2;

public class multi_level_inhertance {
   void mul(int a,int b) {
	   int c=a+b;
	   System.out.println(c); 
   }
   public static void main(String[] args) {
	   child2 sc= new child2();
		sc.add();
		sc.div();
		sc.mul(5, 3);
	}
   
}
class child1 extends multi_level_inhertance{
	   int div() {
		   int a=10;
		   System.out.println(a);
		   return 0;
	   }

	   }
class child2 extends child1{
	   void add() {
		   int a=10;
		   System.out.println(a);
	   }
	}
