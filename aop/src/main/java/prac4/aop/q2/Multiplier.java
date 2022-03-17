package prac4.aop.q2;

import org.springframework.stereotype.Component;

@Component
public class Multiplier {
	public int prod(int a, int b) {
		return a * b;
	}
}
