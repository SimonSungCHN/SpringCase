package thread.concurrent.ticket;

import thread.concurrent.ticket.MyRunnable;

class MyRunnable implements Runnable{
	
	//一共有5张火车票
		private int ticketsCont = 5;
		
		@Override
		public void run(){
			//如果有票，就卖一张
			while(ticketsCont > 0){
				ticketsCont--;
				System.out.println(Thread.currentThread().getName() + "卖了1张票，剩余" + ticketsCont);
			}
		}
}


public class TichetsRunnable{
	
	public static void main(String[] args) {
		
		MyRunnable mr = new MyRunnable();
		Thread th1 = new Thread(mr, "窗口1");
		Thread th2 = new Thread(mr, "窗口2");
		Thread th3 = new Thread(mr, "窗口3");
		
		th1.start();
		th2.start();
		th3.start();
	}

}
