
package test;
import java.util.Scanner;

public class Assign2 {
	public static void main(String[] args) 
    {
           // TODO Auto-generated method stub
           Scanner s=new Scanner(System.in);
           int number=1;
           System.out.println("Enter a number between 1 t0 100");
           int k=s.nextInt();
           
           for (int i=1;i<=k;i++)
           {
                        for (int j=1;j<=i;j++)
                        {                                 
                        System.out.print(number +" ");
                        number++;
                        }
                        System.out.println();
                        
                        if((number+i)>k)
                        {
                               break;
                        }
            }
                        

     }

}

