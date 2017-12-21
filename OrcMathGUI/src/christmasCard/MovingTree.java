package christmasCard;

import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;

public class MovingTree extends AnimatedComponent {

	public MovingTree(int x, int y, int w, int h) {
		super(x, y, w, h);
		
		addSequence("resources/sprites.png", 180,0,0,28,38,8);
		Thread animation = new Thread(this);
		animation.start();
		update();
	}
	public void update(Graphics2D g) {
			g.setColor(Color.GRAY);
			g.fillRect(0,0,getWidth(), getHeight());
			super.update(g);
			
		}

}
