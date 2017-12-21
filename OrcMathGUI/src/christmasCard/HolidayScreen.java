package christmasCard;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Button;
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
		 Button back = new Button((getWidth()-120)/2,getHeight()-60,100,30,"Go back.",new Action() 
		 {
			 public void act() {

				 Tree.card.setScreen(Tree.mS);

			 }

			 });

			 viewObjects.add(back);

			textArea = new TextArea(175,250,1000,1000, "Enjoy these cute Pokemons in holiday gear!");
			viewObjects.add(textArea);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
