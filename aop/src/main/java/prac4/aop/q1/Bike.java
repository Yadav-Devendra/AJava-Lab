package prac4.aop.q1;

import org.springframework.stereotype.Component;

@Component
public class Bike {
	public void ride() {
		System.out.println("Bike: I am Riding");
	}
}
