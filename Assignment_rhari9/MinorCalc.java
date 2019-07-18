package test;
import java.util.Scanner;

public class MinorCalc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MyCalculator myCalc=new MyCalculator();
		
		System.out.println("Enter the option you want to enter 2 input parameters or 3 input parameters");
		int Option = sc.nextInt();
		
		System.out.println("Choose any one Operator : + - * / ");
		String s=sc.next();
		
		if(Option==2)
		{
			
			System.out.println("Enter Input #1:");
			int a=sc.nextInt();
			System.out.println("Enter Input #2:");
			int b=sc.nextInt();
			if(s.equals("+"))
			{
				System.out.println("Result is:" + myCalc.Add(a,b));
			}
			else if(s.equals("-"))
			{
				System.out.println("Result is:" + myCalc.Subtract(a,b));
			}
			else if(s.equals("*"))
			{
				System.out.println("Result is:" + myCalc.Multiply(a,b));
			}
			else if(s.equals("/"))
			{
				System.out.println("Result is:" + myCalc.Divide(a,b));
			}
		}
		else if(Option==3)
		{
			System.out.println("Enter Input #1:");
			int a=sc.nextInt();
			System.out.println("Enter Input #2:");
			int b=sc.nextInt();
			System.out.println("Enter Input #3:");
			int c=sc.nextInt();
			if(s.equals("+"))
			{
				System.out.println("Result is:" + myCalc.Add(a,b,c));
			}
			else if(s.equals("-"))
			{
				System.out.println("Result is:" + myCalc.Subtract(a,b,c));
			}
			else if(s.equals("*"))
			{
				System.out.println("Result is:" + myCalc.Multiply(a,b,c));
			}
			else if(s.equals("/"))
			{
				System.out.println("Result is:" + myCalc.Divide(a,b,c));
			}
		}
	}
}
