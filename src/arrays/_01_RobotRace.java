package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Robot r[] = new Robot[9];
		for (int i = 0; i < r.length; i++) {
			r[i] = new Robot("batman");
			r[i].setSpeed(5);
			r[i].setX(i * 100 + 50);
			r[i].setY(500);
		}
		Random rand = new Random();
		boolean win = false;
		while (!win) {
			for (int i = 0; i < r.length; i++) {
				r[i].move(rand.nextInt(50));
				if (r[i].getY() < 30) {
					r[i].sparkle();
					i += 1;
					JOptionPane.showMessageDialog(null, "Winner: robot " + i);
					win = true;
					break;
				}
			}

		}

	}
}
// 2. create an array of 5 robots.

// 3. use a for loop to initialize the robots.

// 4. make each robot start at the bottom of the screen, side by side, facing up

// 5. use another for loop to iterate through the array and make each robot move
// a random amount less than 50.

// 6. use a while loop to repeat step 5 until a robot has reached the top of the
// screen.

// 7. declare that robot the winner and throw it a party!

// 8. try different races with different amounts of robots.

// 9. make the robots race around a circular track.
