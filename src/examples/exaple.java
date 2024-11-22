package examples;

public class exaple extends overriding {
	public void interset() {
		System.out.println("sbi rate is 7%");
	}
	public static void main(String[] args) {
		exaple sc=new exaple();
		sc.interset();
		sc.interset();
	}
	public class ex extends exaple{
		public void interset() {
			System.out.println("icic rate is 10%");
		}
	}
	
}
