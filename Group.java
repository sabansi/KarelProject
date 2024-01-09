import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Group {
	private Map<String, Double> studentScores;
	public Group() {
		studentScores = new HashMap<String, Double>();
	}
	
	public Group(ArrayList<String> students) {
		studentScores = new HashMap<>();
		for(String student: students) {
			studentScores.put(student, null);
		}
	}
	
	public Double getScore(String student) {
		if(!studentScores.containsKey(student)) {
			System.out.println("No such student: " + student);
			return null;
		}
		return studentScores.get(student);
	}
	
	public void setScore(String student, double score) {
		if(!studentScores.containsKey(student)) {
			System.out.println("No such student: " + student);
			return;
		}
		studentScores.put(student, score);
	}

}
