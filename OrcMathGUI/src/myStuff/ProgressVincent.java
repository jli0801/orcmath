package myStuff;

import java.awt.Graphics2D;

import guiTeacher.components.Component;

public class ProgressVincent extends Component implements ProgressInterfaceJessica {
	private int roundNum;
	private int sequenceNum;
	private boolean loss;
	
	public ProgressVincent(int x, int y, int w, int h) {
		super(250,50,400,200);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Object randomMove) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Graphics2D g) {
		// TODO Auto-generated method stub

	}
	
	public void gameOver()
	{
		loss = true;
		update();
	}

}
