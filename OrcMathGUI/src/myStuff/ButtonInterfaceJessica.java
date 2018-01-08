package myStuff;

import java.awt.Color;

import guiTeacher.components.Action;
import guiTeacher.interfaces.Clickable;

public interface ButtonInterfaceJessica extends Clickable {

	void setColor(Color blue);
	
	void setAction(Action a);
	
	void dim();

	void highlight();
	
	
}
