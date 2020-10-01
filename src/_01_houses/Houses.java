package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
		
	
	static Robot Rob = new Robot();
	
	public void run() {

		
		Rob.setX(10);
		Rob.setY(500);
		Rob.setPenColor(Color.black);
		Rob.penDown(); 
		Rob.setSpeed(100);
		Random ran = new Random();
	
for (int i = 0; i < 10; i++) {
	int randomnumber = ran.nextInt(3);
		if(randomnumber == 0) {
		drawpointyroof ("small" , Color.black);
		}
		if(randomnumber == 1) {
			drawpointyroof ("medium" , Color.pink);
		}
		if(randomnumber == 2) {
			newhouse("large" , Color.blue);
		}
}
	}
		

static public void newhouse(String height, Color C) { 
	int length = 100;

	if(height.equals("large")) {
		length = 250;
	}
	
		Rob.setPenColor(C);
	Rob.move(length);
		Rob.turn(90);
		Rob.move(20);
		Rob.turn(90);
		Rob.move(length);
		Rob.turn(270);
		Rob.setPenColor(Color.GREEN);
		Rob.move(50);
		Rob.turn(270);
	
}
	

static public void drawpointyroof(String height, Color C) {
	
	int length = 100;
	if (height.equals("small")) {
		length = 60;
	}
	if(height.equals("medium")) {
		length = 120;
	}

		Rob.setPenColor(C);
	Rob.move(length);
		Rob.turn(45);
		Rob.move(20);
		Rob.turn(90);
		Rob.move(20);
		Rob.turn(45);
		Rob.move(length);
		Rob.turn(270);
		Rob.setPenColor(Color.GREEN);
		Rob.move(50);
		Rob.turn(270);
	
}
	}



