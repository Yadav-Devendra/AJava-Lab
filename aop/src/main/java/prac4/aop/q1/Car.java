package prac4.aop.q1;

import org.springframework.stereotype.Component;

@Component
public class Car {
	public void drive() {
		System.out.println("Car: I am Driving");
	}
}
