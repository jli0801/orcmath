package myStuff;

import guiTeacher.GUIApplication;

public class CatalogMakerGui extends GUIApplication {

	public CatalogMakerGui(int width, int height) {
		super(width, height);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		// TODO Auto-generated method stub
	CatalogScreen s = new CatalogScreen(getWidth(), getHeight());
	setScreen(s);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CatalogMakerGui sample = new CatalogMakerGui(800, 550);
		Thread go = new Thread(sample);
		go.start();
	}

}
