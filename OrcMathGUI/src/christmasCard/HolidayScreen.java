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

public class HolidayScreen extends FullFunctionScreen {

	public static Tree card;
    public static MainScreen screen1;
    public static HolidayScreen screen2;
	private Button back;
	private TextArea textArea;
	AnimatedComponent MovingTree;
	
	public HolidayScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		setBackground(new Color(0, 128, 0));
		 StyledComponent.setButtonOutline(true);

		 Button back = new Button(800,675,100,30,"Go back.",new Action() 
		 {
			 public void act() {

				 Tree.card.setScreen(Tree.mS);

			 }

			 });
		
			 viewObjects.add(back);

			textArea = new TextArea(0,90,500,650, "Enjoy these cute Pokemons in holiday gear!");
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
			viewObjects.add(new MovingPokemon());
		}
	

}
