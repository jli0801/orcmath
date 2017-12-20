package guiPlayer;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class Gundam extends AnimatedComponent {

//	ArrayList<Gundam> list = new ArrayList<Gundam>();
	private String s;
	private String name;
	private String series;
	private String color;

	public Gundam(String name, String series, String color) {
		super(100, 100, 30, 38);
		this.name = name;
		this.series = series;
		this.color = color;
	
		
	//	addSequence("resources/ss2.png", 180,0,0,28,38,8);
		Thread animation = new Thread(this);
		animation.start();
		update();
	
	}

	@Override
	public void update(Graphics2D g) {
	/*	g.setColor(Color.GRAY);
		g.fillRect(0,0,getWidth(), getHeight());*/
		super.update(g);
		
	}
	
	public String toString()
	{
		return name + "," + series + "," + color;
	}
	


}