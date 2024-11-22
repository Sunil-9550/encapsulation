package examples;

public class single_level_inheritance {
	public static  int add(int a,int b) {
		int c=a+b;
		System.out.println(c);
		return 0;
	}
			public static void main(String[] args) {
				child.sub();
				child.add(12,30);
				
			
		}
			public class child extends single_level_inheritance{
				public static  void sub() {
					int a=10,b=20;
					int c=a-b;
					System.out.println(c);
				}

	}

}
