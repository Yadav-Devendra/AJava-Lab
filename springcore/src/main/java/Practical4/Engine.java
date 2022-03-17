package Practical4;

public class Engine {
	private int engineNo;
	private String engineName;
	private String engineType;

	public Engine() {
	}

	public Engine(int engineNo, String engineName, String engineType) {
		super();
		this.engineNo = engineNo;
		this.engineName = engineName;
		this.engineType = engineType;
	}

	public int getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}

	public String getEngineName() {
		return engineName;
	}

	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String engineDetails() {
		return "\nEngine Details: \nEngine Number = " + engineNo + "\nEngine Name = " + engineName + "\nEngine Type = "
				+ engineType;
	}
}
