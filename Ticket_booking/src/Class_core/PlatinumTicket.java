package Class_core;
import java.util.regex.Pattern;

public class PlatinumTicket extends Book_ticket{

Book_ticket b1=new Book_ticket(getTicketid(), getName(), getMobileno(), getEmail(), getMovie());
	
	public PlatinumTicket(String ticketid, String name, long mobileno, String email, String movie) {
		super(ticketid, name, mobileno, email, movie);
		
		

	}
	public boolean validateticketid() 
	{
		String str=b1.getTicketid();
		boolean answer=(Pattern.matches("[PLATNIUM000-999]{11}", str));
		return answer;
	}
	public int claculateTicketCost(int numberofTickets, String ACFacility)
	{
		int Ac = 750;
		int NonAC = 600;
		int amount = 0;
		
		if(ACFacility.equals("AC"))
		{
			amount = numberofTickets * Ac;
			
		}
		else {
			amount = numberofTickets * NonAC;
		}
		return amount;
	}
	

}