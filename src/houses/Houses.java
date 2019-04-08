package houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot e = new Robot(20, 400);
	
	public static void main(String[] args) {
		e.miniaturize();
		Robot.setWindowSize(750, 500);
		e.penDown();
		e.setSpeed(100);
		h("small", 255, 0, 0, false);
		h("medium", 200, 50, 10, false);
		h("large", 0, 200, 40, true);
		h("small", 255, 255, 0, true);
		h("large", 255, 0, 255, true);
	}
	
	
	static void h(String size, int r, int g, int b, boolean pointyRoof) {
		int height = 60;
		if(size.equals("medium")) {
			height = 120;
		}
		if(size.equals("large")) {
			height = 250;
		}
		e.setPenColor(r, g, b);
		e.move(height);
		if (pointyRoof == true){
			e.turn(45);
			e.move(20);
			e.turn(90);
			e.move(20);
			e.turn(45);
		}
		else{
			e.turn(90);
			e.move(30);
			e.turn(90);
		}
		e.move(height);
		e.turn(270);
		e.setPenColor(0, 255, 0);
		e.move(20);
		e.turn(270);
	}
}


