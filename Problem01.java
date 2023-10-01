import stanford.karel.Karel;
public class Problem01 extends Karel{
	public void run(){
		while (true) {
            putBeeper(); // Place a beeper on the current corner.
            if (frontIsClear()) {
                move(); // Move to the next corner in the current row.
            } 
            else {
                if (facingEast()) {
                    turnLeft();
                    if (frontIsClear()) {
                        move(); // Move to the next row.
                        turnLeft();
                    }
                }
                else {
                    turnLeft();
                    turnLeft();
                    turnLeft();
                    if (frontIsClear()) {
                        move(); // Move to the next row.
                        turnLeft();
                        turnLeft();
                        turnLeft();
                    } 
                }
                if (frontIsBlocked() && facingNorth()) {
                    break;
                }
            }
        }
    }
}

