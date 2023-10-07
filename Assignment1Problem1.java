import stanford.karel.Karel;

public class Assignment1Problem1 extends Karel{
	public void run() {
		findMagazine();
		//takeMagazine();
		//getMagazineAtHome();
	}
	//karel moves to the position where beeper is
	private void findMagazine() {
		move();
		turnRight();
		for(int i=0; i<3; i++) {
		move();
		}
	}
	private void turnRight() {
		for(int i=0; i<3; i++) {
			turnLeft();
			}
	}
}
