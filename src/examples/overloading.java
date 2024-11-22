package examples;

public class overloading {
	void overloading(int a,int b) {
		System.out.println("lingala");
	}
	void overloading(int a,float b) {
		System.out.println("madhan");
	}
	public static void main(String[] args) {
		overloading sc=new overloading();
		sc.overloading(10, 20);
		sc.overloading(23, 3.4f);
	}

}
