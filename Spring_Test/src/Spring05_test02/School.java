package Spring05_test02;

public class School {
	private Student student;
	private int grade;
	public School() {
		super();
	}
	public School(Student student, int grade) {
		super();
		this.student = student;
		this.grade = grade;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return student + "\t 학년: " + grade;
	}
}
