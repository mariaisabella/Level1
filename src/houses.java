import org.jointheleague.graphical.robot.Robot;

public class houses {
	
	static Robot rob = new Robot();
	
static void flatBuilding(int height, int r, int g, int b) {

	rob.setSpeed(7);
	rob.penDown();
	rob.setPenColor(r, g, b);
	rob.move(height);
	rob.turn(90);
	rob.move(100);
	rob.turn(90);
	rob.move(height);
	rob.turn(-90);
	rob.setPenColor(0,255,0);
	rob.move(100);

}	
	
public static void main(String[] args) {

	flatBuilding(300, 255, 0, 0);


}
}
