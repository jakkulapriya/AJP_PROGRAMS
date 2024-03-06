package AJPJAVA;
import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
	Scanner sc = new Scanner(System.in);
	private Object sum;
	void a1() {
		int[][]A= {{1,2,3},{4,5,6},{7,8,9}};
		
			System.out.println(Arrays.deepToString(A));
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
				System.out.print(A[i][j]+" ");
				}
				System.out.println();
			}
				System.out.println(A[0][1]);
				System.out.println(A[2][1]);
				
		}
			
	
	
	
	
	void a2() {
		System.out.println("enter the row size");
		int r= sc.nextInt();
		System.out.println("enter the column size ");
		int c= sc.nextInt();
		int [][]A1= new int[r][c];
		
		System.out.println("enter the values "+r*c+ "are");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				A1[i][j]=sc.nextInt();
			}
		}
			for(int i1=0;i1<r;i1++) {
				for(int j=0;j<c;j++) {
					System.out.print(A1[i1][j]);
				}
			System.out.println();
			
	
	}
		}
	void sum() {
		System.out.println("enter the row size");
		int r= sc.nextInt();
		System.out.println("enter the column size ");
		int c= sc.nextInt();
		int [][]A1= new int[r][c];
		
		System.out.println("enter the values "+r*c+ "are");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				A1[i][j]=sc.nextInt();
			}
		}
			for(int i1=0;i1<r;i1++) {
				for(int j=0;j<c;j++) {
					System.out.print(A1[i1][j]);
				}
			System.out.println();
			
			}
	
	System.out.println("Individual row sum:");
	int s=0;
	for(int i=0;i<r;i++)
	{
		s=0;
		for(int j=0;j<c;j++)
		{
			s=s+A1[i][j];
		}
		System.out.println("row"+i+" sum is: "+s);
	}
	//System.out.println("sum of array elements:"+s);
	
	
	
	System.out.println("Individual column sum:");
	int cs=0;
	for(int i=0;i<c;i++)
	{
		cs=0;
		for(int j=0;j<r;j++)
		{
			cs=cs+A1[j][i];
		}
		System.out.println("column"+i+" sum is: "+cs);
	}
	}
	

	public static void main(String[] args) {
		Array2D obj = new Array2D();
		obj.a1();
		obj.a2();
	obj.sum();
		
	}

}
