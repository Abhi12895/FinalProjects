package com.tcs.rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.tcs.rest.resource.Product;

import lombok.extern.slf4j.Slf4j;

//@Aspect
//@Component
@Slf4j
public class ResourceInterceptorAspect2 {

//	@Pointcut("execution(com.tcs.rest.resources.ProductResource)")
	/*@Pointcut("execution(*com.tcs.rest.resources.*.*(..))")//it means any resource,any method and any parameters
	public void loggingPointCut() {
		
	}
	
	@AfterReturning(value="execution(*com.tcs.rest.resources.*.*(..))",returning="product")
	public void afterRet(JoinPoint jp,Product pro) {
		log.info("After method invoked :: "+pro);
	}
	
	@AfterThrowing(value="execution(*com.tcs.rest.resources.*.*(..))",throwing="e")
	 public void afterThrow(JoinPoint jp,Exception e) {
		log.info("After method invoked ::"+e);
	}*/
	
}
