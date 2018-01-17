package practiceTest;

import guiTeacher.GUIApplication;
import holiday.Front;
import holiday.HolidayCard;

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
	public static void main(String[] args) {
		app = new Application(800, 500);
		Thread runner = new Thread(app);
		runner.start();
	}

}
