package com.java.demo.aop.SpringAopDemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect {
	
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Before("execution(* com.java.demo.aop.SpringAopDemo.business.*.*(..))")
	public void before(JoinPoint joinPoint) {
		log.info("Check for user Access");
		log.info("Allow execution for {}", joinPoint);
	}
	
	

}
