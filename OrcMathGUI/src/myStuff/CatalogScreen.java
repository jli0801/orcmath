package myStuff;

import java.util.List;

import guiPlayer.Book;
import guiPlayer.CatalogMakerSample;
import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogScreen extends FullFunctionScreen {

	private TextField descriptionField;
	private CatalogMakerSample catalog;
	private TextField descriptionFieldOne;
	private TextField descriptionFieldTwo;
	private TextArea textArea;
	private Button buttonOne;
	private CatalogMakerSample cScreen;
	
	public CatalogScreen(int width, int height) {
		super(width, height);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		cScreen = new CatalogMakerSample();
		descriptionField = new TextField(40,50,200,30,"Title", "");
		viewObjects.add(descriptionField);
		descriptionFieldOne = new TextField(40,110,200,30,"Author", "");
		viewObjects.add(descriptionFieldOne);
		
		descriptionFieldTwo = new TextField(40,170,200,30,"Page", "");
		descriptionFieldTwo.setInputType(TextField.INPUT_TYPE_NUMERIC);
		viewObjects.add(descriptionFieldTwo);
	
		textArea = new TextArea(1400,10,100,100, "Box of Text.");
		viewObjects.add(textArea);
		buttonOne = new Button(40,230,100,100, "Add", new Action() {
			
			@Override
			public void act() {
				addButtonClicked();
				
			}
		});
		viewObjects.add(buttonOne);
		
	}

	protected void addButtonClicked() {
	//	CatalogMakerSample book = new CatalogMakerSample();
		Book book = new Book(descriptionField.getText(), descriptionFieldOne.getText(),Integer.parseInt(descriptionFieldTwo.getText()));
		String s = textArea.getText() + book + "\n";
		
		catalog.addBook(book);
		
		descriptionField.setText("");
	//	viewObjects.add(descriptionField);
		descriptionFieldOne.setText("");
	//	viewObjects.add(descriptionFieldOne);
		descriptionFieldTwo.setText("");
	//	viewObjects.add(descriptionFieldTwo);
	}
	

}
