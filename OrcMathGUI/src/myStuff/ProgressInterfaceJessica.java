package myStuff;

import guiTeacher.interfaces.Visible;

public interface ProgressInterfaceJessica extends Visible {

	void add(Object randomMove);
	 static void gameOver() {
		// TODO Auto-generated method stub
		
	}
	 ProgressInterfaceJessica setRound(int round);
	 ProgressInterfaceJessica setSequenceSize(int size);

	

}
