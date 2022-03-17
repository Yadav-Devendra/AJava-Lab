package com.spring.aopPractice.prac1;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class Engine {

	@Pointcut("execution(* com.spring.aopPractice.prac1.*.*())")
	public void doSomething() {
	}

	/*
	 * @Before("execution(* com.spring.aopPractice.prac1.*.*())") public void
	 * engineStart() { System.out.println("Engine: Starting Engine"); }
	 * 
	 * @After("execution(* com.spring.aopPractice.prac1.*.*())") public void
	 * engineStop() { System.out.println("Engine: Stopping Engine"); }
	 */

	@Before("doSomething()")
	public void engineStart() {
		System.out.println("Engine: Starting Engine");
	}

	@After("doSomething()")
	public void engineStop() {
		System.out.println("Engine: Stopping Engine");
	}

	/*
	 * @AfterReturning(pointcut =
	 * "execution(int com.spring.aopPractice.prac1.Multiplier.*(..)))", returning =
	 * "returnvalue") public void AdderAfterReturnAspect(int returnvalue) {
	 * System.out.println("From After-returning advice");
	 * System.out.println("Multipication is " + returnvalue); }
	 */
}
