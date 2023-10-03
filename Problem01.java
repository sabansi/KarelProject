import stanford.karel.Karel;
public class Problem01 extends Karel {
	public void run(){
		while (true) {
            putBeeper(); 
            if (frontIsClear()) {
                move(); 
            } 
            else {
                if (facingWest()) {
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
                else {
                	 turnLeft();
                     if (frontIsClear()) {
                         move(); 
                         turnLeft();
                     }
                }
             //   if (facingNorth() && frontIsBlocked()) {
              //      break;
            //    }
            }
        }
    }
}

