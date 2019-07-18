package test;
import java.util.Scanner;

public class TicketSystem {
	public static Scanner sc=new Scanner(System.in);
	public static Scanner scText=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ticketing System");
		System.out.println("****************");
		System.out.println("Enter 1 to Create New Ticket:");
		System.out.println("Enter 2 for Exit:");
		int UserChoice = sc.nextInt();
		
		TicketingSystem ts=new TicketingSystem();
		
		
		if(UserChoice==1)
		{
			System.out.println("Please Enter the Ticket Number");
			ts.setTicketNo(sc.nextInt());
			System.out.println("Please Enter Ticket Description");
			ts.setTicketDesc(scText.nextLine());
			System.out.println("Please Enter Ticket Type");
			ts.setTicketType(scText.nextLine());
		}
		else if(UserChoice==2)
		{
			System.out.println("Exit");
		}
		
		System.out.println("Enter 3 for Approval or 4 for Cancel/Reject:");
		UserChoice = sc.nextInt();
		
		if(UserChoice==3)
		{
			//change the ticket status to approved and print the ticket.
			ts.setTicketStatus(1);
			System.out.println("Your Ticket is Approved");
			System.out.println("Ticketing Details are as follow:");
			System.out.println("********************************");
			System.out.println("Ticket Number:" + ts.getTicketNo());
			System.out.println("Ticket Description:" + ts.getTicketDesc());
			System.out.println("Ticket Type:" + ts.getTicketType());
			System.out.println("Ticket Status:" + ts.getTicketStatus());
			System.out.println("********************************");
		}
		else if(UserChoice==4)
		{
			System.out.println("Your Ticket " + ts.getTicketNo() + " is Cancelled or Rejected");
		}
		sc.close();
	}	
}
