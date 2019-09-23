package _02_robot_graffiti;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot robot = new Robot();
	robot.hide();
	robot.setSpeed(100);
	robot.moveTo(30, 200);
	robot.penDown();
	robot.move(200);
	robot.turn(90);
	for(int i = 0; i<5; i++)
	{
		robot.turn(30);
		robot.move(50);
	}
	robot.penUp();
	robot.turn(210);
	robot.move(200);
	robot.penDown();
	robot.turn(-90);
	robot.move(200);
	robot.turn(180);
	robot.move(200);
	robot.turn(-90);
	robot.move(100);
	JOptionPane.showMessageDialog(null, "Dean Le");
}
}
