package thread.concurrent.ticket;

import thread.concurrent.ticket.MyThread;

class MyThread extends Thread{
	
	//一共有5张火车票
	private int ticketsCont = 5;
	//窗口，即线程名
	private String name;
	
	public MyThread(String name){
		this.name = name;
	}
	
	@Override
	public void run(){
		//如果有票，就卖一张
		while(ticketsCont > 0){
			ticketsCont--;
			System.out.println(name + "卖了1张票，剩余" + ticketsCont);
		}
	}
}


public class TicketsThread {

	public static void main(String[] args) {
		
		// 创建3个线程，模拟3个窗口卖票
		MyThread mt1 = new MyThread("窗口1");
		MyThread mt2 = new MyThread("窗口2");
		MyThread mt3 = new MyThread("窗口2");
		
		//启动3个线程，窗口开始卖票
		mt1.start();
		mt2.start();
		mt3.start();
	}
}
