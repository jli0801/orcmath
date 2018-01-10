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
		 textBox.setText("Game");
		 nextRound();
	}

	private void nextRound() {
		acceptUser = false;
		roundNumber++;
		sequence.add(randomMove());
		setRound(roundNumber);
		setSequenceSize(sequence.size());
		changeText("Simon's turn.");
		textBox.setText("");
		playSequence();
		changeText("Your turn.");
		acceptUser = true;
		sequenceIndex = 0;
	}
	private ProgressInterfaceJessica setSequenceSize(int size) {
		ProgressVincent seqSize = new ProgressVincent(250,50,400,200);
		return setSequenceSize(size);
		
	}

	private ProgressInterfaceJessica setRound(int roundNumber2) {
		ProgressVincent pro = new ProgressVincent(250,50,400,200);
		return setRound(roundNumber2);
		
	}

	private void playSequence() {
	ButtonInterfaceJessica b = getButton(50,70,60,60);
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
		for(int i = 0;i <buttonInt.length;i++)
		{ 
			System.out.println(buttonInt[i]);
		    viewObjects.add(buttonInt[i]); 
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
		    return new MoveVincent(buttonInt[index]);
	}

	

	private ProgressInterfaceJessica getProgress() {
		return new ProgressVincent(250,50,400,200);
	}

	private void addButtons() {
		sequence = new ArrayList<MoveInterfaceJessica>(); //array
		buttonInt = new ButtonInterfaceJessica[6]; //allB
		//parttwostep3
		numButton = 6;
		Color[] colorArr = new Color[6];
		colorArr[0] = Color.blue;
		colorArr[1] = Color.red;
		colorArr[2] = Color.GREEN;
		colorArr[3] = Color.gray;
		colorArr[4] = Color.pink;
		colorArr[5] = Color.YELLOW;
		
		for(int i =0; i<buttonInt.length; i++)
		{
			final ButtonInterfaceJessica b = getButton(50,i*50+20,60,60);
			//length is 6 so buttons 0 to 5
			buttonInt[i] = b; //fill buttons
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
					
					if (b == sequence.get(sequenceIndex).getAButton()) //change
					{
						sequenceIndex++;
					}
					else
					{
						ProgressInterfaceJessica.gameOver();
					}
					if(sequenceIndex == sequence.size())
					{ 
					    Thread nextRound = new Thread(SimonScreenJessica.this); 
					    nextRound.start(); 
					}
				}

				});
			
		
			
			
		}
		
	}
	
	private ButtonInterfaceJessica getButton(int x,int y,int w, int h) {
		ButtonVincent button = new ButtonVincent(x,y,w,h,"",null);
		return button;
	}



}
