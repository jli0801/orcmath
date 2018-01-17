package practiceTest;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class Screen extends FullFunctionScreen {

	public TextArea text;
	
	
	public Screen(int width, int height) {
		super(width, height);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		text = new TextArea(50, 50, 100, 100, "");
	
		
		Button lose = new Button(100, 150, 100,30,"Lose", new Action() {
			
			@Override
			public void act() {
				
				text.setText("You lose!");
				lose.setEnabled(false);
				win.setEnabled(false);
			}
		});
		
		
		Button win = new Button(250, 150, 100,30,"Win", new Action() {
			
			@Override
			public void act() {
				
				text.setText("You Win!");
				lose.setEnabled(false);
				win.setEnabled(false);
			}
		});
		viewObjects.add(lose);
		viewObjects.add(win);
		viewObjects.add(text);

	}

}
