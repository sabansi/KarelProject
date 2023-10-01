import stanford.karel.Karel;
public class Problem01 extends Karel{
	public void run(){
		while(frontIsClear()){
		while(frontIsClear()){
			move();
		}
		turnLeft();
		move();
		turnLeft();
		//turnLeft();
		while(frontIsClear()){
			move();
		}
		while(!facingNorth()){
			turnLeft();
		}
	}
	}
}
