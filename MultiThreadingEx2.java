package AJPJAVA;

public class MultiThreadingEx2 extends Thread  {
	//public class MultiThreadingEx1 impliments Runnable interface   {
	public void run() {//running
		for(int i=1;i<=10;i++) {
			String name = Thread.currentThread().getName();	
			int priority= Thread.currentThread().getPriority();
			System.out.println(name+"  i value: "+ i +"priority "+priority);
		}
	}

	public static void main(String[] args) {
		MultiThreadingEx2 obj1 = new MultiThreadingEx2();
		Thread t1= new Thread(obj1);
		Thread t2= new Thread(obj1);
		t1.setName("T1");
		t2.setName("T2");
		t1.setPriority(1);
		t2.setPriority(10);
		t1.start();//runnable
		t2.start();
		
		
		
	}
	}


	
