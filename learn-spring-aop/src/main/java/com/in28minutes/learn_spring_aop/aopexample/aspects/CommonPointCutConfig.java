package com.in28minutes.learn_spring_aop.aopexample.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCutConfig {

	@Pointcut("execution(* com.in28minutes.learn_spring_aop.aopexample.*.*.*(..))")
	public void businessAndDataPackaageConfig() {}
	
	@Pointcut("@annotation(com.in28minutes.learn_spring_aop.aopexample.annotations.TrackTime)")
	public void trackTimeAnnotationConfig() {}
}
