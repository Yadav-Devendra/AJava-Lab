package Practical2;

public class Car {
	private String name;
	private int price;
	private int seats;
	private String color;
	private String fuelType;
	private Engine engine;

	public Car(String name, int price, int seats, String color, String fuelType, Engine engine) {
		super();
		this.name = name;
		this.price = price;
		this.seats = seats;
		this.color = color;
		this.fuelType = fuelType;
		this.engine = engine;
	}

	public void carDetails() {
		System.out.println("\nCar Details: \nCar Name = " + name + "\nCar Price = " + price + "\nCar Seats = " + seats
				+ "\nCar Color = " + color + "\nCar Fuel Type = " + fuelType);
		System.out.println(engine.engineDetails());
	}
}
