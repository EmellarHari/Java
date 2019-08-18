package test;
import java.util.Scanner;
public class MyMatrixEx {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) 
	{
		

		System.out.println("Enter the Size of Array");
		int n=scan.nextInt();
		
		int[][] matrix= new int[n][n];
		System.out.println("Enter the Array elements");
		
		for(int i =0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println("Enter the row"+ i+ " col "+ j +" ");	
				matrix[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Input Matrix values are ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print( matrix[i][j]+" ");				
			}
			System.out.println();
		}
		
		int k=0;
		
		System.out.println("\tOutput Matrix values Are");	
		for(int i=0;i<n;i++)
		{
			if(k%2==0)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print( matrix[i][j]+" ");				
				}
			}
			else
			{
				for(int j=n-1;j>=0;j--)
				{
					System.out.print( matrix[i][j]+" ");				
				}
			}
			k++;
			System.out.println();
		}
	}
}
