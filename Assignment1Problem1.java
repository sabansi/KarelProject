import stanford.karel.*;

public class Assignment1Problem1 extends SuperKarel{
	public void run() {
		findMagazine();
		//takeMagazine();
		//getMagazineAtHome();
	}
	//karel moves to the position where beeper is
	private void findMagazine() {
		move();
		move();
		turnRight();
		move();
		turnLeft();
		move();
	}
}
