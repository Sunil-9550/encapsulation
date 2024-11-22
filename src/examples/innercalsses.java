package examples;

public class innercalsses {
	void max() {
		System.out.println("sunil");
	}
}
	class outerclass extends innercalsses{
		void min() {
			System.out.println("madhan");
		}
	}
	class middleclas  extends outerclass{
			  void midle() {
				System.out.println("lingala");
			}	
	
	public static void main(String[] args) {
		middleclas sc=new middleclas();
		sc.max();
		sc.midle();
		sc.min();
	}
	}
	


