package com.in28minutes.learn_spring_aop.aopexample.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class PerformanceTrackingAspect {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	//@Around("execution(* com.in28minutes.learn_spring_aop.aopexample.*.*.*(..))")
	@Around("com.in28minutes.learn_spring_aop.aopexample.aspects.CommonPointCutConfig.trackTimeAnnotationConfig()")
	public Object calculateExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		 long startMilliSec = System.currentTimeMillis();
		
		Object resultingVaue = proceedingJoinPoint.proceed();
		 long stopMilliSec = System.currentTimeMillis();
		 long executionTime = stopMilliSec - startMilliSec;
		 
		 logger.info("Around Aspect - {} is called and the time to execute this method is {}", proceedingJoinPoint,executionTime);
		 
		 return resultingVaue;
		
	}
}
