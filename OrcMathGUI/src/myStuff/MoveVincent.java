package myStuff;

public  class MoveVincent implements MoveInterfaceJessica {

	ButtonInterfaceJessica button;
	public MoveVincent(ButtonInterfaceJessica buttonInterfaceJessica) {
		this.button = button;
	}
	@Override
	public ButtonInterfaceJessica getAButton() {
		return button;
	}
	
	
}
