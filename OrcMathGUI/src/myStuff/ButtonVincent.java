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
		// TODO Auto-generated method stub
		this.setBackgroundColor(g);
	}
	
	@Override
	public void dim() {
		// TODO Auto-generated method stub
	}

	@Override
	public void highlight() {
		// TODO Auto-generated method stub
		
	}
}
