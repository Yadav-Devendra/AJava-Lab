package prac4.aop.q1;

import org.springframework.stereotype.Component;

@Component
public class Airplane {
	public void fly() {
		System.out.println("Airplane: I am Flying");
	}
}