package examples;
interface max{
	void max1();
}
interface min{
	void min1();
}
public class exaple2 implements max,min {
	public void max1() {
		System.out.println(Math.max(12, 20));
	}
	public void min1() {
		System.out.println(Math.min(23, 30));
	}
	public static void main(String[] args) {
	exaple2 sc=new exaple2();
	sc.max1();
	sc.min1();
	}

}
