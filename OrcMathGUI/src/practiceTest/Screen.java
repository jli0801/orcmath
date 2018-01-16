package practiceTest;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class Screen extends FullFunctionScreen {

	public TextArea text;
	public boolean choseL;
	public boolean choseW;
	public Screen(int width, int height) {
		super(width, height);
		choseL = false;
		choseW = false;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		choseL = false;
		choseW = false;
		text.setText("");
		
		Button lose = new Button(100, 150, 100,30,"Lose", new Action() {
			
			@Override
			public void act() {
				if(!choseL && !choseW)
				{
				text.setText("You lose!");
				choseL = true; 
				choseW = true;
				}
			}
		});
		
		
		Button win = new Button(100, 150, 100,30,"Win", new Action() {
			
			@Override
			public void act() {
				if(!choseL && !choseW)
				{
				text.setText("You Win!");
				choseL = true; 
				choseW = true;
				}
			}
		});
		viewObjects.add(lose);
		viewObjects.add(win);
		viewObjects.add(text);

	}

}
