package Class_core;
import java.util.regex.Pattern;

public class Silver extends Book_ticket {
	Book_ticket b1=new Book_ticket(getTicketid(), getName(), getMobileno(), getEmail(), getMovie());
	
	public Silver(String ticketid, String name, long mobileno, String email, String movie) {
		super(ticketid, name, mobileno, email, movie);
		
		

	}
	public boolean validateticketid() 
	{
		String str=b1.getTicketid();
		boolean answer=(Pattern.matches("[SILVER000-999]{9}", str));
		return answer;
	}
	public int claculateTicketCost(int numberofTickets, String ACFacility)
	{
		int Ac = 250;
		int NonAC = 100;
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
