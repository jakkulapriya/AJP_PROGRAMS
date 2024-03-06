package AJPJAVA;

public interface Interface1
{
	 int a=10;
    void m1(int a,int b);
   
    default void m2()
    {
   	 System.out.println("default methods allowed from 1.8v");
    }
   
    static void m3() {
   	 System.out.println("static method allowed from 1.8v ");
    }
   
    public default  void m4() {
   	 System.out.println("private method");
    }
   
    public static void main(String[] args) {
		System.out.println("main method also allowed from 1.8v");
	 }
   
   
   
}
