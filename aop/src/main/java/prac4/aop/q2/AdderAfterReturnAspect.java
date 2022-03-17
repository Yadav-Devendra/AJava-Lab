package prac4.aop.q2;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class AdderAfterReturnAspect {
	@AfterReturning(pointcut = "execution(public int prod(..))", returning = "returnvalue")
	public void AdderAfterReturnAspect(int returnvalue) {
		System.out.println("From After-returning advice");
		System.out.println("Multipication is " + returnvalue);
	}
}
