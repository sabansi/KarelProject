import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class GroupTest extends ConsoleProgram {
	public void run() {
		ArrayList<String> students = new ArrayList<>();
		students.add("sansi23");
		students.add("akave23");
		Group classB = new Group(students);
		println(classB.getScore("sansi23"));
		println(classB.getScore("akave22"));
		classB.setScore("sansi23", 15.0);
		classB.setScore("akave23", 15.0);
		println(classB.getScore("sansi23"));
		println(classB.getScore("akave23"));
		classB.addStudent("akave22");
		println(classB.getScore("akave22"));
	}

}
