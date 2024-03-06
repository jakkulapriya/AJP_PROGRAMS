package AJPJAVA;

public class MultiThreadingEx6 extends Thread {
//public void run() {
//	for(int i=1;i<=10;i++) {
//		String name= Thread.currentThread().getName();
//		System.out.println(name+" i value:"+i);
//	}
//}
	public void run() {
		synchronized(this) {
		System.out.println("Synchronized start");
		for(int i=1;i<=10;i++) {
		String name= Thread.currentThread().getName();
			System.out.println(name+" i value:"+i);
		}
			System.out.println("ended");
		}
		for(int i=1;i<=10;i++) {
			String name= Thread.currentThread().getName();
				System.out.println(name+" i value:"+i);
			}
	}

	private void Synchronized(MultiThreadingEx6 multiThreadingEx6) {
	// TODO Auto-generated method stub
	
}

	public static void main(String[] args) {
		MultiThreadingEx6 obj = new MultiThreadingEx6 ();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		t2.start();
	}

}
