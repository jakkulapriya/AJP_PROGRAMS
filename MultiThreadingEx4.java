package AJPJAVA;

public class MultiThreadingEx4 extends Thread {
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("i value:"+i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MultiThreadingEx4 obj = new MultiThreadingEx4();
		Thread  t1= new Thread(obj);
		t1.start();
		t1.join();
		for(int j=1;j<=10;j++) {
			System.out.println("j value:"+j);
		}
		
	}

}
