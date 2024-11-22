package threads;

public class first_thread extends Thread{
	@Override
	public void run() {
		System.out.println("this is lingala sunil kumar reddy");
		for(int i=0; i<=5; i++) {
			System.out.println(i);

	try {
		Thread.sleep(100);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}

}
	}
}

