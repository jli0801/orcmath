package myStuff;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenJessica extends ClickableScreen implements Runnable {

	public ProgressInterfaceJessica progressInt;
	public ButtonInterfaceJessica[] buttonInt;
	private ArrayList<MoveInterfaceJessica> moveInt;
	private TextArea textBox;
	public int roundNumber; 
	private int numTracker; //for roundNumber
	private int lastSelected;
	private int numButton;
	private boolean acceptUser;
	private SimonScreenJessica screen;
	
	public SimonScreenJessica(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void run() {
/*		viewObjects.add(roundNumber);
		Thread app = new Thread(this);
		app.start();*/
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		setBackground(Color.DARK_GRAY);
		textBox.setCustomTextColor(Color.LIGHT_GRAY);
		addButtons();
		run();
		for(ButtonInterfaceJessica j: buttonInt)
		{ 
		    viewObjects.add(j); 
		}
		progressInt = getProgress();
		textBox = new TextArea(130,230,300,40,"Let's play Simon!");
		moveInt = new ArrayList<MoveInterfaceJessica>();
		//add 2 moves to start
		lastSelected = -1;
		progressInt.add(randomMove());
		progressInt.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progressInt);
		viewObjects.add(textBox);

	}

	private MoveInterfaceJessica randomMove() {
		  int index = (int)(Math.random()*buttonInt.length);
		    while(index == lastSelected){
		        index = (int)(Math.random()*buttonInt.length);
		    }
		    return getMove(index);
	}

	private MoveInterfaceJessica getMove(int bIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	private ProgressInterfaceJessica getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addButtons() {
		ButtonInterfaceJessica[] buttonInt = new ButtonInterfaceJessica[6];
		//parttwostep3
		numButton = 6;
		for(int i =0; i<buttonInt.length; i--)
		{
			ButtonInterfaceJessica b = getAButton();
			buttonInt[i] = b;
			b.setColor(Color.BLUE); //fix
		}
	}

	private ButtonInterfaceJessica getAButton() {
		// TODO Auto-generated method stub
		return null;
	}


}
