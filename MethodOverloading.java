package AJPJAVA;

public class MethodOverloading {
	void add(int a ,int b) 
	{
		System.out.println("addion of two numbvers"+(a+b));
	}
void add(float a, float b)
{
	System.out.println("addition of two floating numbers"+(a+b));
}
void add(String a ,String b, String c)
{
	System.out.println("addition of 3 strings"+(a+b+c));
}
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.add(10,20);
       obj.add(2.3f, 5.6f);
       obj.add("java", "c++","c");
	}

}
