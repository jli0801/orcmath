package myStuff;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import guiPlayer.CustomLabel;
import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class CustomButton extends Button implements CustomLabel {

	public String StringOne;
	public String StringTwo;
	
	public CustomButton(int x, int y, int w, int h, String text, Action action) {
		super(x, y, w, h, text, action);
		// TODO Auto-generated constructor stub
		updateString1(StringOne);
		updateString2(StringTwo);
	}
	public void CustomButton(int x, int y)
	{
		
	}
	@Override
	public void updateString1(String string) {
		string = "Save Now";

	}

	@Override
	public void updateString2(String string) {
		string = "Cancel Now";
	}

	@Override
	public void setIconColor(Color color) {
		// TODO Auto-generated method stub

	}
	
	public void drawButton(Graphics2D g, boolean hover){
	
		g.setColor(Color.BLACK);
		//g.drawString(str,x,y);
		g.drawString(StringOne, 120, 135);
	}

}
