package christmasCard;

import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Button;
import guiTeacher.components.StyledComponent;
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
		setBackground(new Color(0, 128, 0));
	 StyledComponent.setButtonOutline(true);

	 Button open = new Button(800,675,100,30,"Continue...",new Action() 
	 {
		 public void act() {

			 Tree.card.setScreen(Tree.hS);

		 }

		 });
	 	
		 viewObjects.add(open);

		textArea = new TextArea(0,90,1000,1000, "MERRY CHRISTMAS! \nHAPPY HOLIDAYS!\n HAPPY NEW YEAR!");
		textArea.setCustomTextColor(new Color(179, 0, 0));
		try {
			File fontFile = new File("resources/christmas.ttf");
			//			File fontFile = new File("resources//DayRoman.ttf");
			Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);
			Font baseFont=font.deriveFont(96f);
			textArea.setFont(baseFont);
		} catch (Exception e) {
			e.printStackTrace();
		}
		viewObjects.add(textArea);
		viewObjects.add(new Banner(1600));
	//	viewObjects.add(new Snowballs());

	}


}
