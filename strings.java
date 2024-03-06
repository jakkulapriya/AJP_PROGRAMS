package AJPJAVA;

public class strings {
	void str() {
		
		String s1 ="java";
		String s2 ="programming";
		System.out.println(s1.toString());
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(2));
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.indexOf('v'));
		System.out.println((s1+"").repeat(5));
		System.out.println((s1+"").repeat(5));
		System.out.println(("string length:" +s2.length()));
		System.out.println(("string length: " +s1.length()));
		
		 String res1=s1.replace('j', 'z');
		  System.out.println(s1);
		  System.out.println(res1);

       String res=s2.replace('r','p');
       System.out.println(s2);
       System.out.println(res);

       String s3 = "java";
       String s4 ="fundamentals";
       String s5= "language";
       
       System.out.println(s3==s4);//compares address of s1 and s4
       System.out.println(s2==s1);
       System.out.println(s2==s3);
       System.out.println(s2==s2);
       System.out.println(s2.equals(s1));//compares the content...check it is equal or not
       System.out.println(s3==s1);
       System.out.println(s3==s5);
       System.out.println(s2.substring(5));//return after or in between letters 
       System.out.println(s5.substring(3,5));
       System.out.println(s3.compareTo(s2));//defines the ASCII value and declare the numbers as output
       System.out.println(s4.compareTo(s1));
       System.out.println(s3.compareTo(s1));
       System.out.println(s3.compareToIgnoreCase(s1));
       
       
       String p1="Java";
 	  String p2="JAVA";
 	  System.out.println(p1.equals(p2));
 	  System.out.println(p1.equalsIgnoreCase(p2));
 	  System.out.println(p1.compareTo(p2));
 	  System.out.println(p1.compareToIgnoreCase(p2));
 	  }
	   

	
	

	
	public static void main(String[] args) {
		strings obj =new strings();
		obj.str();
	
	}
}
		