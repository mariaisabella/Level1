import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MultiRobot {
public static void main(String[] args) {
	Robot rob = new Robot();
	rob.setSpeed(10);
	rob.sparkle();
	rob.penDown();
	rob.setPenColor(Color.cyan);
	for(int i=0 ; i<8 ; i++){
		rob.move(50);
		rob.turn(45);
	}
	
	Robot sue = new Robot();
	sue.setSpeed(5);
	sue.setPenColor(Color.magenta);
	sue.turn(90);
	sue.move(100);
	sue.turn(90);
	sue.move(100);	
	sue.penDown();
	for(int i=0 ; i<6 ; i++){
		sue.move(100);
		sue.turn(60);
	}
	
	Robot mary = new Robot();
	mary.setPenColor(Color.orange);
	mary.setSpeed(10);
	mary.penDown();
	for(int i=0 ; i<360 ; i++){
		mary.move(3);
		mary.turn(1);
	}
	
	Robot steve = new Robot();
	steve.setSpeed(3);
	steve.setPenColor(Color.darkGray);
	steve.turn(270);
	steve.move(50);
	for(int i=0 ; i<4 ; i++){
		steve.move(300);
		steve.penDown();
		for(int i1=0 ; i1<4; i1++){
			steve.move(50);
			steve.turn(90);
		}
	}
	steve.penUp();
	steve.move(500);
}
}
