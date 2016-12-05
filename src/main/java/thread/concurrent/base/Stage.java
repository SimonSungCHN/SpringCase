package thread.concurrent.base;

import thread.concurrent.base.ArmyRunnable;
import thread.concurrent.base.KeyPersonThread;
import thread.concurrent.base.Stage;

//舞台
public class Stage extends Thread {

	@Override
	public void run() {

		System.out.println("开始大戏！");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("大幕拉开！");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("开始！");

		ArmyRunnable armyTaskOfSuiDynasty = new ArmyRunnable();
		ArmyRunnable armyTaskOfRevolt = new ArmyRunnable();

		// 使用Runnable接口创建线程
		Thread armyOfSuiDynasty = new Thread(armyTaskOfSuiDynasty, "隋军");
		Thread armyOfRevolt = new Thread(armyTaskOfRevolt, "农民起义军");

		// 启动线程，让军队开始作战
		armyOfSuiDynasty.start();
		armyOfRevolt.start();

		// 舞台线程休眠
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("半路杀出个程咬金");
		Thread mrCheng = new KeyPersonThread();
		mrCheng.setName("程咬金");

		System.out.println("程咬金的理想是结束战争！");

		// 停止军队作战，停止线程的方法
		armyTaskOfSuiDynasty.keepRunning = false;
		armyTaskOfRevolt.keepRunning = false;

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 留给关键人物
		mrCheng.start();

		//等待程咬金完成线程
		try {
			mrCheng.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("战争结束！");
		System.out.println("再见！");

	}

	public static void main(String[] args) {

		new Stage().start();
	}

}
