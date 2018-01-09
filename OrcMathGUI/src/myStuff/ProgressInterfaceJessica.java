package myStuff;

import guiTeacher.interfaces.Visible;

public interface ProgressInterfaceJessica extends Visible {

	void add(Object randomMove);

	

	static void gameOver();
	static void setRound(int round);
	static void setSequenceSize(int size);

	

}
