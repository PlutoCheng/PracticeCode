package com.demo.aspect;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	
	private final static Logger logger = LoggerFactory.getLogger(LogAspect.class);
	@Pointcut("execution(public * com.demo.controller.BookController.*(..))")
	public void log() {
		
	}
	
	@Before("log()")
	public void doBefore() {
		System.out.println("before()");
	}
	
	@After("log()")
	public void doAfter() {
		System.out.println("after()");
	}
	
	@AfterReturning(returning = "obj", pointcut = "log()")
	public void doAfterReturning(Object obj) {
		System.out.println("afterRetruning()");
	}
	
}
