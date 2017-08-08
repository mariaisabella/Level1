public class Runner {
	private String name;
	private int speed;
	private int bibNumber;
	private static int count;
	private static String location = "San Diego";
	private static String startTime = "6:00 am";

	public Runner(String name, int speed) {
		count = count + 1;
		bibNumber = 999 + count;
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static void setCity(String newCity) {
		location = newCity;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public String toString() {
		return "Runner " + name + " is running in " + location + " at " + startTime + ". His bib number is " + bibNumber
				+ ".";
	}

}