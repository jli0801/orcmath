package practiceTest;

import guiTeacher.GUIApplication;
import holiday.Front;

public class Application extends GUIApplication {
	
	public static Application app;
	public static Screen screen;

	public Application(int width, int height) {
		super(width, height);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		// TODO Auto-generated method stub
		screen = new Screen(getWidth(), getHeight());
		setScreen(screen);
	}

}
