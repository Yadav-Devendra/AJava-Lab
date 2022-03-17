package prac4.aop.q2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Multiplier m = context.getBean("multiplier", Multiplier.class);
		m.prod(10, 30);
	}
}
