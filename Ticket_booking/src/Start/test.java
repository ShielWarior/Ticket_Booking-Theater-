package Start;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Class_core.GoldTicket;
import Class_core.PlatinumTicket;
import Class_core.Silver;

public class test {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
		System.out.println("****Welcome to Xbox Threater*****");
		System.out.println("Enter Ticket Id :");
		String sid=br.readLine();
		
		System.out.println("Enter Your Name :");
		String sname=br.readLine();
		
		System.out.println("Enter Your Mob.no :");
		Long PhoneNum = Long.parseLong(br.readLine());
		
		System.out.println("Enter Your email :");
		String semail=br.readLine();
		
		System.out.println("Enter Movie Name");
		String smovie=br.readLine();
	
		Silver ss=new Silver(sid ,sname ,PhoneNum ,semail , smovie);
		boolean silver=ss.validateticketid();
		
		GoldTicket gg=new GoldTicket(sid ,sname ,PhoneNum ,semail , smovie);
		boolean gold=gg.validateticketid();
		
		PlatinumTicket pp=new PlatinumTicket(sid, sname,PhoneNum, semail, smovie);
		boolean platinum=pp.validateticketid();
		
		if (silver) {
			System.out.println("-+-+-+-+- Please Select options for tickets -+-+-+-+-");
			
			System.out.println("Please Select Number of Seats you want: ");
			int ticket = Integer.parseInt(br.readLine());
			
			System.out.println("Non-AC facility: 100 " + "AC facility: 250");
			System.out.println("Please select an option from " + "AC " + "or " + "NON-AC ");
			String ACInput = br.readLine();
			
			
				System.out.println("Hey " + sname +" Your Total amount to be Paid is: " + ss.claculateTicketCost(ticket, ACInput));
				break;
			
		}
		else if (gold) {
			System.out.println("-+-+-+-+- Please Select options for tickets -+-+-+-+-");
			
			System.out.println("Please Select Number of Seats you want: ");
			int ticketgold = Integer.parseInt(br.readLine());
			
			System.out.println("Non-AC facility: 350 " + "AC facility: 500");
			System.out.println("Please select an option from " + "AC " + "or " + "NON-AC ");
			String ACInputgold = br.readLine();
			
			System.out.println( "Hey " + sname +  " Your Total amount to be Paid is: " + gg.claculateTicketCost(ticketgold, ACInputgold));
				break;
			
		}
		else if (platinum) {
			System.out.println("-+-+-+-+- Please Select options for tickets -+-+-+-+-");
			
			System.out.println("Please Select Number of Seats you want: ");
			int ticketplatinum = Integer.parseInt(br.readLine());
			
			System.out.println("Non-AC facility: 600 " + "AC facility: 750");
			System.out.println("Please select an option from " + "AC " + "or " + "NON-AC ");
			String ACInputplatinum = br.readLine();
			
			
				System.out.println("Hey " + sname +" Your Total amount to be Paid is: " + pp.claculateTicketCost(ticketplatinum, ACInputplatinum));
				break;
			
		}
		else {
			System.out.println("Entered ID Does Not Match");
			break;
		}
		
		

	}

}
}
