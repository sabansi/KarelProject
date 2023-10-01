import stanford.karel.Karel;
public class Problem01 extends Karel{
	public void run(){
		while (leftIsClear()){
		      putBeeperRow();
		      turnForClearLeftRow();
		      putBeeperRow();
		      turnForClearRightRow();      
		   }
		   putBeeperRow();

		function turnForClearLeftRow() {
		   turnLeft();
		   move();
		   turnLeft();
		}

		function turnForClearRightRow() {
		   turnRight();
		   move();
		   turnRight();
		}

		function putBeeperRow() {
		   while(frontIsClear()){ 
		      putBeeper();
		      move();
		   }
		   putBeeper();
		}
}
}
