package Practical4;

public class Car {
	private Engine engine;

	public Car() {
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void carDetails() {
		System.out.println(engine.engineDetails());
	}
}
