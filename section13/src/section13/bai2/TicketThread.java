package section13.bai2;

public class TicketThread implements Runnable{
	private int soLuong = 1;
	
	@Override
	public void run() {
		muaVe();
	}
	
	public synchronized void muaVe() {
		soLuong -= 1;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if(soLuong >=0)
			System.out.println(Thread.currentThread().getName() + " Mua ve thanh cong");
		else
			System.out.println(Thread.currentThread().getName() + " Het ve");
	}

}
