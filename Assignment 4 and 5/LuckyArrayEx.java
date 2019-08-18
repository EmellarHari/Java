package test;
import java.util.Scanner;

public class LuckyArrayEx {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int len = 0;
		Boolean flag = true;
		int[] arrayNumber;

		System.out.println("Please enter a length of array");
		len = scan.nextInt();
		arrayNumber = new int[len];

		for (int i= 0; i<len; i++) 
		{
			System.out.println("Please enter " + (i+1) + " position value");
			arrayNumber[i] = scan.nextInt(); 
		}

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arrayNumber[j] == arrayNumber[i]) {
					flag = false;
					break;
				}
			}
		}

		if (flag == true)
			System.out.println("The number is Lucky");
		else
			System.out.println("The number is Not Lucky");

	}

}
