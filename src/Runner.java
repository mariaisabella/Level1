public class Runner {
	String name;
	int speed;
	int bibNumber;
	static int count;
	static String location = "Miami";
	static String startTime = "4:57";

	public Runner(String name, int speed){
		count = count+1;
		bibNumber = 1000+count;
	}
	      
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public int getSpeed(){
		return speed;
	}
	public void describeRunner() {
		System.out.println("Runner " + name + " is running in " + location + " at " + startTime + ". His bib number is " + bibNumber + ".");
	}
	
	public static void main(String[] args) {
		Runner joe = new Runner("joe", 20);
		joe.describeRunner();

	}
}

