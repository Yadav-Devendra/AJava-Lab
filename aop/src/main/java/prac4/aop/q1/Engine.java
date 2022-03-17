package prac4.aop.q1;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Engine {
	@Before("execution(* prac4.aop.q1.*.d*())")
	public void engineStart() {
		System.out.println("Engine: Starting Engine");
	}

	/*
	 * @After("execution( public void *())") public void engineStop() {
	 * System.out.println("Engine: Stopping Engine"); }
	 */
}
