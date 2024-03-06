package AJPJAVA;

public class StringBuffer1 {
	

	void s1() {
		
		  System.out.println("String Buffer ");
		  StringBuffer s1=new StringBuffer("java");
		  StringBuilder s2=new StringBuilder("python");
		  System.out.println(s2);
		  System.out.println(s1.equals(s2));
		  System.out.println(s1.charAt(0));
		  System.out.println(s1.substring(2));
		  
		  s1.setCharAt(2, 'V');
		  System.out.println(s1);
	}

	public static void main(String[]args) {
		StringBuffer1 obj =new StringBuffer1();
		obj.s1();
	}
}


