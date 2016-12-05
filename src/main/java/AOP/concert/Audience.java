package AOP.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	@Pointcut("execution(** AOP.concert.Performance.perform(..))")   //定义命名的切点
	public void performance(){}
	
/*	@Before("performance()")         //表演之前
	public void silenceCellPhones(){
		System.out.println("Silencing cell phones");
	}
	
	@Before("performance()")         //表演之前 
	public void takeSeats(){
		System.out.println("Taking seats");
	}
	
	@AfterReturning("performance()")    //表演之后
	public void applause(){
		System.out.println("CLAP CLAP CLAP!!!");
	}
	
	@AfterThrowing("performance()")     //表演失败之后
	public void demandRefund(){
		System.out.println("Demanding a refund");
	}*/
	
	@Around("performance()")         // 环绕通知
	public void watchPerformance(ProceedingJoinPoint jp){
		
		try {
			System.out.println("Silencing cell phones");
			System.out.println("Taking seats");
			jp.proceed();    // 执行方法
			System.out.println("CLAP CLAP CLAP!!!");
		} catch (Throwable e) {
			System.out.println("Demanding a refund");
			e.printStackTrace();
		}
	}

}
