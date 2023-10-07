import stanford.karel.*;

public class Assignment1Problem1 extends SuperKarel{
	public void run() {
		findMagazine();
		takeMagazine();
		getBackAtHomeWithMagazine();
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
	//karel takes the magazine
	private void takeMagazine() {
		pickBeeper();
	}
	//karel gets back at home with the magazine
	private void getBackAtHomeWithMagazine() {
		turnAround();
		for(int i=0; i<3; i++) {
		move();
		}
	}
}
