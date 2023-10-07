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
}