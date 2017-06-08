package stuManager;

public class Grade {
	private int gNumber;
	private int gGrade;
	private String gCourse;
	private String gTeacher;
	private String gStudent;

	public Grade() {
		// TODO Auto-generated constructor stub
	}

	public Grade(int gNumber, int gGrade, String gCourse, String gTeacher, String gStudent) {
		this.gCourse = gCourse;
		this.gGrade = gGrade;
		this.gNumber = gNumber;
		this.gStudent = gStudent;
		this.gTeacher = gTeacher;
	}

	public int getgNumber() {
		return gNumber;
	}

	public void setgNumber(int gNumber) {
		this.gNumber = gNumber;
	}

	public int getgGrade() {
		return gGrade;
	}

	public void setgGrade(int gGrade) {
		this.gGrade = gGrade;
	}

	public String getgCourse() {
		return gCourse;
	}

	public void setgCourse(String gCourse) {
		this.gCourse = gCourse;
	}

	public String getgTeacher() {
		return gTeacher;
	}

	public void setgTeacher(String gTeacher) {
		this.gTeacher = gTeacher;
	}

	public String getgStudent() {
		return gStudent;
	}

	public void setgStudent(String gStudent) {
		this.gStudent = gStudent;
	}

}
