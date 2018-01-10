package myStuff;

import java.awt.Color;
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
		sequenceNum++;
	}

	@Override
	public void update(Graphics2D g) {
		clear();
		if(loss) {
			g.setColor(Color.RED);
			g.fillRect(300, 0, 200, 100);
			g.setColor(Color.black);
			g.drawString("Round: "+roundNum,10,55);
			g.drawString("Current Sequence Length: "+sequenceNum,5,100);
			g.drawString("LOL YOU CAN'T EVEN PLAY A KID GAME",5,150);
		}else {
			g.setColor(Color.GREEN);
			g.fillRect(300, 0, 200, 100);
			g.setColor(Color.black);
			g.drawString("Round: "+roundNum,5,55);
			g.drawString("Current Sequence Length: "+sequenceNum,5,100);
		}
	}
	
	public void gameOver()
	{
		loss = true;
		update();
	}

	@Override
	public ProgressInterfaceJessica setRound(int round) {
		return null;
		
	}

	@Override
	public ProgressInterfaceJessica setSequenceSize(int size) {
		return null;
		
	}

}
