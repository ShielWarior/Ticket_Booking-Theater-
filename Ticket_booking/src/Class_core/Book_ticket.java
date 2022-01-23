package Class_core;

public class Book_ticket {
	private String ticketid;
	private String name;
	private long mobileno;
	private String email;
	private String movie;
	
	public String getTicketid() {
		return ticketid;
	}
	public void setTicketid(String ticketid) {
		this.ticketid = ticketid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public Book_ticket(String ticketid, String name, long mobileno, String email, String movie) {
		super();
		this.ticketid = ticketid;
		this.name = name;
		this.mobileno = mobileno;
		this.email = email;
		this.movie = movie;
	}
	@Override
	public String toString() {
		return "Book_ticket [ticketid=" + ticketid + ", name=" + name + ", mobileno=" + mobileno + ", email=" + email
				+ ", movie=" + movie + "]";
	}
	

}
