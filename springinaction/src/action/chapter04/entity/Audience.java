package action.chapter04.entity;


import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.AfterThrowing;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class Audience {

	/* This way to define aspect is based on AspectJ annotation: */
	
	/*
	@Pointcut("execution(** action.chapter04.entity.Performance.perform(..))")
	public void performance(){
		
	}
	*/
	
	
	/*
	@Before("performance()")
	public void silenceCellPhones(){
		System.out.println("Silencing cell phones");
	}
	*/
	
	
	/*
	@Before("performance()")
	public void takeSeats(){
		System.out.println("Taking seats");
	}
	*/
	
	
	/*
	@AfterReturning("performance()")
	public void applause(){
		System.out.println("CLAP CLAP CLAP!!!");
	}
	*/
	
	
	/*
	@AfterThrowing("performance()")
	public void demandRefund(){
		System.out.println("Demanding a refund");
	}
	*/
	
	
	/*
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp){
		try {
			System.out.println("Slicing cell phones");
			System.out.println("Take seats");
			jp.proceed();
			System.out.println("CLAP CLAP CLAP");
		} catch (Throwable e) {
			System.out.println("Demanding a refund");
		}
	}
	*/
	
	
	
	
	
	
	
	
	
	
	/* Besides AspectJ annotation, we can also use xml to define aspect, so the methods doesn't need any annotation: */
	/* A lot of things are done in xml file: */
	
	/*
	public void silenceCellPhones(){
		System.out.println("Silencing cell phones");
	}
	*/
	
	
	/*
	public void takeSeats(){
		System.out.println("Taking seats");
	}
	*/
	
	
	/*
	public void applause(){
		System.out.println("CLAP CLAP CLAP!!!");
	}
	*/
	
	
	/*
	public void demandRefund(){
		System.out.println("Demanding a refund");
	}
	*/
	
	
	public void watchPerformance(ProceedingJoinPoint jp){
		try {
			System.out.println("Slicing cell phones");
			System.out.println("Take seats");
			jp.proceed();
			System.out.println("CLAP CLAP CLAP");
		} catch (Throwable e) {
			System.out.println("Demanding a refund");
		}
	}
	
}
