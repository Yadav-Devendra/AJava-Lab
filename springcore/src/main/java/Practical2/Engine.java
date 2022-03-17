package Practical2;

public class Engine {
	private int engineNo;
	private String engineName;
	private String engineType;

	public Engine(int engineNo, String engineName, String engineType) {
		super();
		this.engineNo = engineNo;
		this.engineName = engineName;
		this.engineType = engineType;
	}

	public String engineDetails() {
		return "\nEngine Details: \nEngine Number = " + engineNo + "\nEngine Name = " + engineName + "\nEngine Type = "
				+ engineType;
	}
}
