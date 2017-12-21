package christmasCard;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Button;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class MainScreen extends FullFunctionScreen {

	public static Tree card;
    public static MainScreen screen1;
    public static HolidayScreen screen2;
	private Button open;
	private TextArea textArea;

	
	public MainScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	/*	 screen1 = new MainScreen(getWidth(), getHeight());

		 screen2 = new HolidayScreen(getWidth(), getHeight());

		 setScreen(screen1);*/
	@Override
	public void initAllObjects(List<Visible> viewObjects) {
	 Button open = new Button((getWidth()-120)/2,getHeight()-60,100,30,"Continue...",new Action() 
	 {
		 public void act() {

			 Tree.card.setScreen(Tree.hS);

		 }

		 });

		 viewObjects.add(open);

		textArea = new TextArea(175,250,1000,1000, "HAPPY CHRISTMAS! MERRY HOLIDAYS! MERRY NEW YEAR!");
		viewObjects.add(textArea);

	}


}
