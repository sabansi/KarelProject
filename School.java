import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class School {

	private ArrayList<String> teachers;
	private ArrayList<String> subjects;
	private HashMap<String, ArrayList<String>> teacherSubjects;
	private HashMap<String, ArrayList<String>> subjectTeachers;
	private HashMap<String, ArrayList<String>> subjectPupils;
	private HashMap<String, ArrayList<String>> pupilSubjects;

	public School() {
		teachers = new ArrayList<>();
		teacherSubjects = new HashMap<>();
		subjectTeachers = new HashMap<>();
		subjects = new ArrayList<>();
		subjectPupils = new HashMap<>();
		pupilSubjects = new HashMap<>();
	}

	public void addTeacher(String teacher) {
		if (!teachers.contains(teacher)) {
			teachers.add(teacher);
		}
	}

	public void addSubject(String teacher, String subject) {
		if (!teachers.contains(teacher)) {
			return;
		}
		if (!subjects.contains(subject)) {
			subjects.add(subject);
		}
		if (!teacherSubjects.containsKey(teacher)) {
			teacherSubjects.put(teacher, new ArrayList<>());
		}
		teacherSubjects.get(teacher).add(subject);
		if (!subjectTeachers.containsKey(subject)) {
			subjectTeachers.put(subject, new ArrayList<>());
		}
		subjectTeachers.get(subject).add(teacher);
	}

	public void addPupil(String pupil, String subject) {
		if (!subjects.contains(subject)) {
			return;
		}
		if (!subjectPupils.containsKey(subject)) {
			subjectPupils.put(subject, new ArrayList<>());
		}
		subjectPupils.get(subject).add(pupil);
		if (!pupilSubjects.containsKey(pupil)) {
			pupilSubjects.put(pupil, new ArrayList<>());
		}
		pupilSubjects.get(pupil).add(subject);
	}

	public Iterator<String> getTeachers(String pupil) {
		ArrayList<String> studentSubjects = pupilSubjects.get(pupil);
		ArrayList<String> studentTeachers = new ArrayList<>();
		for (String nextSubject : studentSubjects) {
			ArrayList<String> nextTeachers = subjectTeachers.get(nextSubject);
			studentTeachers.addAll(nextTeachers);
		}
		return studentTeachers.iterator();
	}

	public Iterator<String> getPupils(String teacher) {
		ArrayList<String> thisTeacherSubjects = teacherSubjects.get(teacher);
		ArrayList<String> thisTeacherPupils = new ArrayList<>();
		for (String nextSubject : thisTeacherSubjects) {
			thisTeacherPupils.addAll(subjectPupils.get(nextSubject));
		}
		return thisTeacherPupils.iterator();
	}
	
	public void removeTeacher(String teacher){
		teacherSubjects.remove(teacher);
		teachers.remove(teacher);
	}
}