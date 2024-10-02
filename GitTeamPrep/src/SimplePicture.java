import acm.graphics.GImage;
//comment1
//comment2
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage("robot.png", 200, 100);
		add(robot);
<<<<<<< HEAD
		GLabel label = new GLabel("Step: 7 Test", 200, 400);
=======
		GLabel label = new GLabel("Hw I feel when using github hackslash", 200, 400);
>>>>>>> branch 'main' of https://github.com/Fall2024Comp55/git-team-lab-team-c-c-g.git
		add(label);
	}
	
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}