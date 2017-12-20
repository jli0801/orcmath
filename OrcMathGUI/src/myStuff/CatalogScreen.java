package myStuff;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen {

	private TextField descriptionField;
	private Button buttonOne;
	
	public CatalogScreen(int width, int height) {
		super(width, height);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		descriptionField = new TextField(40,50,200,30,"Name", "Description");
		viewObjects.add(descriptionField);
		descriptionField = new TextField(40,110,200,30,"Series", "Description2");
		viewObjects.add(descriptionField);
		descriptionField = new TextField(40,170,200,30,"Color", "Description3");
		viewObjects.add(descriptionField);
		buttonOne = new Button(40,230,100,100, "Add", new Action() {
			
			@Override
			public void act() {
				descriptionField.setText("You clicked the button");
				
			}
		});
		viewObjects.add(buttonOne);
		
	}

}
