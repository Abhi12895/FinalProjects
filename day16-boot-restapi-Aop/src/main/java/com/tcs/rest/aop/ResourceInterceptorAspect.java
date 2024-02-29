package com.tcs.rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

//@Aspect
//@Component
@Slf4j
public class ResourceInterceptorAspect {

//	@Pointcut("execution(com.tcs.rest.resources.ProductResource)")
	@Pointcut("execution(*com.tcs.rest.resources.*.*(..))")//it means any resource,any method and any parameters
	public void loggingPointCut() {
		
	}
	
	
	/*@Before("loggingPointCut()")//name of method->loggingPointCut()
	public void before(JoinPoint jp) {
		log.info("Before method invoked :: "+jp.getSignature());
	}
	
	
	@After("loggingPointCut()")
	public void after(JoinPoint jp) {
		log.info("After method invoked :: "+jp.getSignature());
	}*/
	
}
