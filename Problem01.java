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
		while(!facingNorth()){
			turnLeft();
		}
		//turnLeft();
		while(frontIsClear()){
			move();
		}
	}
	}
}
