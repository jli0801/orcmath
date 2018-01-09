package myStuff;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenJessica extends ClickableScreen implements Runnable {

	public ProgressInterfaceJessica progressInt;
	public ButtonInterfaceJessica[] buttonInt;
	public Color[] colorArr;
	private ArrayList<MoveInterfaceJessica> sequence;
	private TextArea textBox;
	public int roundNumber; 
	private int numTracker; //for roundNumber
	
	private int sequenceIndex;
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
		 textBox.setText("");
		 nextRound();
	}

	private void nextRound() {
		acceptUser = false;
		roundNumber++;
		sequence.add(randomMove());
		ProgressInterfaceJessica.setRound(roundNumber);
		ProgressInterfaceJessica.setSequenceSize(sequence.size());
		changeText("Simon's turn.");
		textBox.setText("");
		playSequence();
		changeText("Your turn.");
		acceptUser = true;
		sequenceIndex = 0;
	}
	private void playSequence() {
	ButtonInterfaceJessica b = getButton();
		for(int i = 0; i<sequence.size(); i++)
		{
			if(b != null)
			{
				b.dim();
			}
			else
			{
				b = sequence.get(i).getAButton();
				
				int sleepTime = roundNumber*3;
				b.highlight();
				Thread sleepT = new Thread(new Runnable(){

					public void run()
					{
						
						try 
						{
							Thread.sleep(sleepTime);
						} 
						catch (InterruptedException e) 
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
						
					});
				sleepT.start();
				b.dim();
			}
			
		}
	}

	private void changeText(String x)
	{
		Thread text = new Thread(new Runnable(){

			public void run()
			{
				textBox.setText(x);
				try 
				{
					Thread.sleep(1000);
				} 
				catch (InterruptedException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
				
			});
		text.start();
	}
	

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		setBackground(Color.DARK_GRAY);
		addButtons();
		run();
		for(ButtonInterfaceJessica j: buttonInt)
		{ 
		    viewObjects.add(j); 
		}
		progressInt = getProgress();
		textBox = new TextArea(130,230,300,40,"Let's play Simon!");
		textBox.setCustomTextColor(Color.LIGHT_GRAY);
		sequence = new ArrayList<MoveInterfaceJessica>();
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
		return getAButton(bIndex);
	}

	private ProgressInterfaceJessica getProgress() {
		return new ProgressVincent();
	}

	private void addButtons() {
		ButtonInterfaceJessica[] buttonInt = new ButtonInterfaceJessica[6];
		//parttwostep3
		numButton = 6;
		Color[] colorArr = new Color[6];
		colorArr[0] = Color.blue;
		colorArr[1] = Color.red;
		colorArr[2] = Color.GREEN;
		colorArr[3] = Color.gray;
		colorArr[4] = Color.pink;
		colorArr[5] = Color.YELLOW;
		
		for(int i =0; i<buttonInt.length; i--)
		{
			final ButtonInterfaceJessica b = getButton();
			buttonInt[i] = b;
			b.setColor(colorArr[i]); //fix
			b.setX(i*55);
			b.setY(i*55);
			
		
			b.setAction(new Action(){

				public void act()
				{
					if(acceptUser)
					{
						Thread blinkButton = new Thread(new Runnable(){

							public void run()
							{
								b.highlight();
								try 
								{
									Thread.sleep(800);
								} 
								catch (InterruptedException e) 
								{
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								b.dim();
							}
								
							});
						blinkButton.start();
					}
				}

				});
			
			if (b == sequence.get(sequenceIndex).getAButton()) //change
			{
				sequenceIndex++;
				if(sequenceIndex == sequence.size()){ 
				    Thread nextRound = new Thread(SimonScreenJessica.this); 
				    nextRound.start(); 
				}
			}
			else
			{
				ProgressInterfaceJessica.gameOver();
			}
			
			
		}
		
	}
	
	private ButtonInterfaceJessica getButton() {
		ButtonVincent = new ButtonVincent(x,y,w,h,"",null);
		return button;
	}



}
