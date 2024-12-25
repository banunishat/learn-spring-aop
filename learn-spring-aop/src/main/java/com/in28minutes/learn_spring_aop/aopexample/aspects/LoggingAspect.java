package com.in28minutes.learn_spring_aop.aopexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {

	private Logger logger =LoggerFactory.getLogger(getClass());
	
	//@Before("execution(* com.in28minutes.learn_spring_aop.aopexample.*.*.*(..))")
	@Before("com.in28minutes.learn_spring_aop.aopexample.aspects.CommonPointCutConfig.businessAndDataPackaageConfig()")
	public void logMethodCallBeforeExecution(JoinPoint joinPoint) {
		logger.info("Before aaspect The method is called {} with the arguments{}",joinPoint,joinPoint.getArgs());
	}
	
	@After("execution(* com.in28minutes.learn_spring_aop.aopexample.*.*.*(..))")
	public void logMethodCallAfterExcution(JoinPoint joinPoint) {
		logger.info("After Aspect The method is called {}",joinPoint);
	}
	
	@AfterThrowing(
			pointcut ="execution(* com.in28minutes.learn_spring_aop.aopexample.*.*.*(..))",
			throwing = "exception")
	public void logMethodCallAfterException(JoinPoint joinPoint,Exception exception) {
		logger.info("After Aspect Throwing the exception  The method is called {} and throwthe excepton{}",joinPoint,exception);
	}
	
	
	@AfterReturning(
			pointcut ="execution(* com.in28minutes.learn_spring_aop.aopexample.*.*.*(..))",
			returning = "resultValue")
	public void logMethodCallAfterReturning(JoinPoint joinPoint,Object resultValue) {
		logger.info("After Aspect succussful return The method is called {} and the returned value {}",joinPoint,resultValue);
	}
	
	
}
