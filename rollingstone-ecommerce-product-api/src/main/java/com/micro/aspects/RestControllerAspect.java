package com.micro.aspects;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Metrics;


@Aspect
@Component
public class RestControllerAspect {

	private final Logger logger = LoggerFactory.getLogger("RestControllerAspect");
	
	// these counter just has a unique name field
	Counter productCreatedCounter = Metrics.counter("com.micro.product.created");
	
	// runs before all controller methods
	// *Controller = Any controllers
	// .. = any argument
	@Before("execution(public * com.micro.ctrl.*Controller.*(..))")
	public void generalAllMethodAspect() {
		logger.info("All Method Calls to controllers invoke this general aspect method");
	}
	
	// called after any controller save() method is invoked
	@AfterReturning("execution(public * com.micro.ctrl.*Controller.save(..))")
	public void getsCalledOnProductSave() {
		logger.info("This aspect is fired after the save method of any controller has returned");
		productCreatedCounter.increment();
	}
	
	
}
