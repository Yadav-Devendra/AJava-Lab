package prac4.aop.q3;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Engine {
	@Pointcut("execution( public void *())")
	public void getNamePointcut() {
	}

	@Before("getNamePointcut()")
	public void engineStart() {
		System.out.println("Engine: Starting Engine using pointcut");
	}

	@After("getNamePointcut()")
	public void engineStop() {
		System.out.println("Engine: Stopping Engine using pointcut");
	}
}
