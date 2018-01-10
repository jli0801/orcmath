package myStuff;

import java.util.ArrayList;

import guiTeacher.GUIApplication;
import guiTeacher.interfaces.Visible;

public class SimonGameJessica extends GUIApplication {

	public static SimonGameJessica game;
	public static SimonScreenJessica screen;
	
	
	public SimonGameJessica(int width, int height) {
		super(width, height);
	
		setVisible(true);
		
	}
	@Override
	public void initScreen() {
		screen = new SimonScreenJessica(getWidth(), getHeight());
		screen.initAllObjects(new ArrayList<Visible>());
		setScreen(screen);

	}
	public static void main(String[] args)
	{
		game = new SimonGameJessica(800,800);
		game.initScreen();
		Thread runner = new Thread(game);
		runner.start();
	}


}
