package test;
import java.util.Scanner;

public class GN {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int quo = 0,rem;
		System.out.println("\t Frequency");
		System.out.println("\t###########\n");

		System.out.println("Please enter a number");
		quo = scan.nextInt();
		int[] nf = new int[10];

		do {

			rem = quo % 10;
			quo /=10;
			switch (rem) {
			case 0:
				nf[0] += 1;	break;
			case 1:
				nf[1] += 1;	break;
			case 2:
				nf[2] += 1;	break;
			case 3:
				nf[3] += 1;	break;
			case 4:
				nf[4] += 1;	break;
			case 5:
				nf[5] += 1;	break;
			case 6:
				nf[6] += 1;	break;
			case 7:
				nf[7] += 1;	break;
			case 8:
				nf[8] += 1;	break;
			case 9:
				nf[9] += 1;	break;

			}
		} while (quo > 0);

		int lucky = 0;
		Boolean flag = true;
		for (int index = 0; index < 9; index++) 
		{
			if (nf[index] > 0 && lucky == 0) 
			{
				lucky = nf[index];
			} 
			else if (nf[index] > 0 && nf[index] != lucky) 
			{
				flag = false;
			}
		}

		if (flag == false)
			System.out.println("The number is not in frequence");
		else
			System.out.println("The number is in frequence");
	}

}
