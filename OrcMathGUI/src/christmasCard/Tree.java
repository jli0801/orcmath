package christmasCard;

import guiTeacher.GUIApplication;

public class Tree extends GUIApplication {

	
    public static Tree card;
	public static MainScreen mS;
	public static HolidayScreen hS;

	public Tree(int width, int height) {
		super(width, height);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
	 mS = new MainScreen(getWidth(), getHeight());
	 hS = new HolidayScreen(getWidth(), getHeight());
	setScreen(mS);

	}

	public static void main(String[] args) {
		 card = new Tree(1600, 1600);

		 Thread runner = new Thread(card);

		 runner.start();	
	}

}
