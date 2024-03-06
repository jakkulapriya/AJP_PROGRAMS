package AJPJAVA;

public class MultiThreadingEx5 extends Thread{
	public void run() {
		
		try {
			System.out.println("hi");
			System.out.println("GM");
			Thread.sleep(3000);
		}
		catch(Exception e) {
			System.out.println("its time to sleep");
			System.out.println("slepp got disturbed");
		}
		finally {
			System.out.println("finally");
		}
		
	}

	public static void main(String[] args) {
		MultiThreadingEx5 obj=new MultiThreadingEx5();
		Thread t1=new Thread(obj);
		t1.start();
		t1.interrupt();
		
	}

}
