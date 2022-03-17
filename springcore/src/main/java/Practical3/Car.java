package Practical3;

public class Car {
	private String name;
	private int price;
	private int seats;
	private String color;
	private String fuelType;
	private Engine engine;

	public Car() {
	}

	public Car(String name, int price, int seats, String color, String fuelType, Engine engine) {
		super();
		this.name = name;
		this.price = price;
		this.seats = seats;
		this.color = color;
		this.fuelType = fuelType;
		this.engine = engine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void carDetails() {
		System.out.println("\nCar Details: \nCar Name = " + name + "\nCar Price = " + price + "\nCar Seats = " + seats
				+ "\nCar Color = " + color + "\nCar Fuel Type = " + fuelType);
		System.out.println(engine.engineDetails());
	}
}
