package com.java.demo.aop.SpringAopDemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@After(value = "execution(* com.java.demo.aop.SpringAopDemo.business.*.*(..))")
	public void after(JoinPoint joinPoint) {
		log.info("after execution of {}", joinPoint);
	}
	
	@AfterReturning(value ="execution(* com.java.demo.aop.SpringAopDemo.business.*.*(..))", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		log.info("{} returned with value {}", joinPoint, result);
	}
	
	
	

}
