package myStuff;

public class MoveVincent implements MoveInterfaceJessica {

	@Override
	public ButtonInterfaceJessica getAButton(int a) {
		return SimonGameJessica.screen.buttonInt[a];
	}
}
