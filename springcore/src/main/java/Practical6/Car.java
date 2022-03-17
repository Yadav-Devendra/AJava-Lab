package Practical6;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	private Engine engine;

	public Car() {
	}

	public Engine getEngine() {
		return engine;
	}

	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void carDetails() {
		System.out.println(engine.engineDetails());
	}
}
