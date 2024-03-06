package AJPJAVA;

public class ControlStatements {
	void a1() {
		int a=35;
		if(a%2==0) {
			System.out.println("it is even number");
		}
		else {
			System.out.println("it is odd number");
		}
	}
    void a2() {
	int choice=1;
	switch(choice) {
	case 1:
		System.out.println("today is sunday");
	
	case 2:
		System.out.println("today is monday");
	case 3:
		System.out.println("today is tuesday");
}
    }
	void a3() {
		int a=12,b=78;
		char choice2='d';
		String choice4="d";
		switch(choice4)
		{
			case "a":
				System.out.println("Addition:"+(a+b));
				break;
			case "b":
				System.out.println("Subtraction:"+(a-b));
				break;
			case "c":
				System.out.println("Multiplication:"+(a*b));
				break;
			default:
				System.out.println("Wrong choice");
		
	     }


		
	}
    public static void main(String[] args) {
	ControlStatements obj =new ControlStatements();
	obj.a1();
	obj.a2();
	obj.a3();
	
		
	}

}

