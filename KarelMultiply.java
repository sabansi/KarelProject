import stanford.karel.Karel;

public class KarelMultiply extends Karel {
	public void run() {
		move();
		while(beepersPresent()) {	
			pickBeeper();
			move();
			while(beepersPresent()) {
				pickBeeper();
				addBeepersToForthAndFifthPiles();
				turnAround();
				move();
				move();
				turnAround();
			}
			returnAtThirdPile();
			returnBeepersToThirdPile();
		}
	}
	public void addBeepersToForthAndFifthPiles() {
		move();
		putBeeper();
		move();
		putBeeper();
	}
	public void turnAround() {
		turnLeft();
		turnLeft();
	}
	public void returnAtThirdPile() {
		move();
		move();
		turnAround();
	}
	public void returnBeepersToThirdPile() {
		while(beepersPresent()) {
			pickBeeper();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			turnAround();
		}
	}
}