import stanford.karel.Karel;
public class Problem01 extends Karel{
	public void run(){
		while (true) {
            putBeeper(); 
            if (frontIsClear()) {
                move(); 
            } 
            else {
                if (facingEast()) {
                    turnLeft();
                    if (frontIsClear()) {
                        move(); 
                        turnLeft();
                    }
                }
                else {
                    turnLeft();
                    turnLeft();
                    turnLeft();
                    if (frontIsClear()) {
                        move(); 
                        turnLeft();
                        turnLeft();
                        turnLeft();
                    } 
                }
                if (facingNorth() && frontIsBlocked()) {
                    break;
                }
            }
        }
    }
}

