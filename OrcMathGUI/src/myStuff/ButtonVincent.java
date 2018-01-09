package myStuff;

import java.awt.Color;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class ButtonVincent extends Button implements ButtonInterfaceJessica {

	public ButtonVincent(int x, int y, int w, int h, String text, Action action) {
		super(x, y, w, h, text, action);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setColor(Color g) {
		color = c;
		this.setBackground(c);
		update();
		
	}
	
	@Override
	public void dim() {
		this.setBackground(this.color);
		update();
	}

	@Override
	public void highlight() {
		this.setBackground(Color.WHITE);
		update();
		
	}
}
