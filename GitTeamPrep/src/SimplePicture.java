//comment1
//comment2
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram; 

public class SimplePicture extends GraphicsProgram {
	private static final String IMAGE_NAME ="robot.png";
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		final GImage robot = new GImage(IMAGE_NAME, 200, 100);
		add(robot);

		GLabel label = new GLabel("Hw I feel when using github hackslash/martyrr", 200, 400);
		add(label);
	} 
	
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}