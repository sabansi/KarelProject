import stanford.karel.*;

public class Problem09 extends SuperKarel {

	@Override
	public void run() {
		moveToFirstOperand();
		multiply();
	}

	private void moveToFirstOperand() {
		move();
	}

	// pre: Karel at 2x1 facing east
	private void multiply() {
		while (beepersPresent()) {
			pickBeeper();
			moveToSecondOperand();
			copySecondOperand();
			returnSecondOperand();
			returnToFirstOperandFromSecond();
		}
	}
	
	//pre: Karel at 3x1 facing east
	//post: Karel at 2x1 facing east
	private void returnToFirstOperandFromSecond() {
		turnAround();
		move();
		turnAround();
	}

	//pre: Karel at 3x1 facing east
	//post: Karel at 3x1 facing east
	private void returnSecondOperand() {
		moveToCopyFromSecondOperand();
		while (beepersPresent()) {
			returnBeeperFromCopy();
			returnToCopy();
		}
		returnToSecondOperandFromCopy();
	}
	
	//pre: Karel at 5x1 facing west
	//post: Karel at 3x1 east
	private void returnToSecondOperandFromCopy() {
		move();
		move();
		turnAround();
	}

	//pre: Karel at 3x1 facing east
	//post: Karel at 5x1 facing west
	private void moveToCopyFromSecondOperand() {
		move();
		move();
		turnAround();
	}

	//pre: Karel at 3x1 facing west
	//post: Karel at 5x1 facing west
	private void returnToCopy() {
		turnAround();
		move();
		move();
		turnAround();
	}

	//pre: Karel at 5x1 facing west
	//post: Karel at 3x1 facing west
	private void returnBeeperFromCopy() {
		pickBeeper();
		move();
		move();
		putBeeper();
	}

	//pre: Karel at 3x1 facing east
	//post: Karel at 3x1 facing east
	private void copySecondOperand() {
		while (beepersPresent()) {
			pickBeeper();
			moveToResult();
			putBeeper();
			moveToCopy();
			putBeeper();
			returnToSecondOperand();
		}
	}

	private void returnToSecondOperand() {
		turnAround();
		move();
		move();
		turnAround();
	}

	private void moveToCopy() {
		move();
	}

	private void moveToResult() {
		move();
	}

	private void moveToSecondOperand() {
		move();
	}
}