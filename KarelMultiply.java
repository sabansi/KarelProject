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
			returnAtFifthPile();
			returnBeepersToThirdPile();
			returnAtSecondPile();
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
	public void returnAtFifthPile() {
		move();
		move();
		turnAround();
	}
	public void returnAtSecondPile() {
		move();
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