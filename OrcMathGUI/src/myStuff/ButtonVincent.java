package myStuff;

import java.awt.Color;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class ButtonVincent extends Button implements ButtonInterfaceJessica {

	private Action action;
	private Color color;
	
	public ButtonVincent(int x, int y, int w, int h, String text, Action action) {
		super(x, y, w, h, text, action);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setColor(Color g) {
		color = g;
		this.setBackground(g);
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
