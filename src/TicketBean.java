public class TicketBean {
	private String ticket;
	@SuppressWarnings("unused")
	private double price;
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	public double getPrice() {
		return 10000;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public TicketBean(String ticket, double price) {
		this.ticket = ticket;
		this.price = price;
	}
	
} 
