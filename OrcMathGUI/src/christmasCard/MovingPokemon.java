package christmasCard;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;

public class MovingPokemon extends AnimatedComponent {

	public MovingPokemon() {
		super(150,300,60,60);
		
		addSequence("resources/sprites.png", 600,0,115,330,330,4);
		Thread animation = new Thread(this);
		animation.start();
		update();
	}
	public void update(Graphics2D g) {
			
		//	g.fillRect(0,0,getWidth(), getHeight());
			super.update(g);
			
		}

}
