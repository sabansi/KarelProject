import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class GroupTest extends ConsoleProgram{
	public void run() { 
		ArrayList<String> students = new ArrayList<>();
		students.add("sansi23");
		students.add("akave23");
		Group classB = new Group(students);
		println(classB.getScore("sansi23"));
		println(classB.getScore("akave22"));
	}

}
