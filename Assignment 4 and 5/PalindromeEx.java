package test;
import java.util.Scanner;
import java.util.*;

public class PalindromeEx {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Input value");
		String strText=sc.nextLine();
		String strDest=Reverse(strText);		
		
		if(strText.equalsIgnoreCase(strDest)) 
		{
			System.out.println("The given input is Palindrom");
		}
		else
		{
			System.out.println("The given input is Not Palindrom");
		}			
	}
	public static String Reverse(String str)
	{
		String strDest="";
		for(int i = str.length()-1; i >= 0; i--) 
		{
			strDest += str.charAt(i);
		}
		return strDest;
	}

	
}
