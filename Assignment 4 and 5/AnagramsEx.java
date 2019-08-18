package test;
import java.util.Scanner;
import java.util.Arrays;

public class AnagramsEx {

	public static void main(String[] args) 
	{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Input String #1:");
        String a = scan.next().toLowerCase();
        System.out.println("Enter Input String #2:");
        String b = scan.next().toLowerCase();
        scan.close();
        
        isAnagram(a, b);
		
	}
	static void isAnagram(String str1,String str2)
	{
		String s1=str1.replace("\\s","");
		String s2=str2.replace("\\s","");
		boolean status=true;
			
		if(s1.length()!=s2.length())
		{
			status=false;
		}
		else
		{
			char[] ArrayS1=s1.toLowerCase().toCharArray();
			char[] ArrayS2=s2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status=Arrays.equals(ArrayS1, ArrayS2);		
		}
		if(status)
		{
			System.out.println(s1 + " and " + s2 +" is Anagrams");
		}
		else
		{
			System.out.println(s1 + " and " + s2 +" are not Anagrams");
		}
	}
}
