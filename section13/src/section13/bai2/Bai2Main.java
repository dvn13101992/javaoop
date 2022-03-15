package section13.bai2;

public class Bai2Main {
	public static void main(String[] args) {
		TicketThread ticketThread = new TicketThread();
		
		Thread t1 = new Thread(ticketThread);
		Thread t2 = new Thread(ticketThread);
		
		t1.start();
		t2.start();
	}
}
