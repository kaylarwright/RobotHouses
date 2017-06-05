import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class RobotHouses {
	public static void main(String[] args) {
		//1. Create a robot. 
		Robot.setWindowColor(0,0,0);
		Robot Kayla = new Robot();
		Kayla.miniaturize();
		Kayla.setSpeed(2000);
		//2. Have the robot start in the bottom left corner of the window.  
		Kayla.moveTo(10, 590);
		//3. Draw a house with a flat roof, of height 100 with green grass after it.
		Kayla.turn(90);
		Random Wright = new Random();
		for (int i = 0; i < 10; i++) {	
		int Kay = Wright.nextInt(400)+100;
		Kayla.penDown();
		if(Kay > 300){
		Kayla.setPenColor(0, 153, 51);
		Kayla.move(10);
		Kayla.setRandomPenColor();
		Kayla.turn(-90);
		Kayla.move(Kay);
		Kayla.turn(90);
		Kayla.move(50);
		Kayla.turn(90);
		Kayla.move(Kay);
		Kayla.setPenColor(0, 153, 51);
		Kayla.turn(-90);
		Kayla.move(10);
		}
		else{
			Kayla.setPenColor(0, 153, 51);
			Kayla.move(10);
			Kayla.setRandomPenColor();
			Kayla.turn(-90);
			Kayla.move(Kay);
			Kayla.turn(30);
			Kayla.move(30);
			Kayla.turn(120);
			Kayla.move(30);
			Kayla.turn(30);
			Kayla.move(Kay);
			Kayla.setPenColor(0, 153, 51);
			Kayla.turn(-90);
			Kayla.move(10);
		}
		}
		//4. Use a for loop to draw 10 houses like the one in step 3..  
		//5. Change the code to make the height random (100 - 500). Draw 10 houses of different heights
		//6. Make each house drawn in a different (random) color.  
		//7. Set the scene to night time by setting the background to black using Robot.setWindowColor(Color c)  
		//8. Give the houses peaked roofs if their height is less than 300. Keep a flat roof if the house is more than 300. 
		
	}
}
