package AJPJAVA;

public class MultiThreadingEx1 extends Thread  {
	//public class MultiThreadingEx1 impliments Runnable interface   {
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("i value:"+i);
		}
	}

	public static void main(String[] args) {
		MultiThreadingEx1 obj = new MultiThreadingEx1();
		Thread t1= new Thread(obj);
		t1.start();
		for(int j=1;j<=10;j++) {
			System.out.println("j value:"+j);
		}
		

	}

}
