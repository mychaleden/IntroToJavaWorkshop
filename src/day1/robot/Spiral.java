package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		
Robot r2d2= new Robot();		

r2d2.penDown();
		
r2d2.setSpeed(10);
		// 4. Do the following (steps 7-9) 75 times
for (int i = 0; i < 10000.; i++) {
	r2d2.setRandomPenColor();
	r2d2.move(5*i);
	r2d2.turn(360/16);
	r2d2.setPenWidth(25);
	
}
			// 7. Change the pen color to random
	
			// 6. Move the robot 5 times the current line number you are drawing (5*i)
	
			// 2. Turn the robot 1/3 of 360 degrees to the right
	
			// 8. Change the number of sides to 7 (don’t add a new line of code for this one!)
	
			// 9. Set the pen width to i

	}
	
			
}
