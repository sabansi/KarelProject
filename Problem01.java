import stanford.karel.Karel;
public class Problem01 extends Karel{
	public void run(){
		for(int i=0; i<1000000; i++)
			beepersInBag();
		while (true) {
            // Check if there is a beeper on the current corner.
            if (noBeepersPresent()) {
                // If there's no beeper, put one.
                putBeeper();
            }

            // Move to the next corner in the current row.
            if (frontIsClear()) {
                move();
            } else {
                // If there's no clear path in the current row, move to the next row.
                if (facingEast()) {
                    turnLeft();
                    move();
                    turnLeft();
                } else {
                	turnLeft();
                    turnLeft();
                    turnLeft();
                    move();
                    turnLeft();
                    turnLeft();
                    turnLeft();
                }
            }
            
            // Check if Karel has finished filling the world with beepers.
            if (frontIsBlocked() && facingNorth()) {
                break;
            }
        }
    }
}

