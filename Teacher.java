package stuManager;

public class Teacher {
	int tNumber;
	String tName;
	String tAcademy;
	String tMajor;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	
	public Teacher(int tNumber,String tName,String tAcademy,String tMajor) {
		this.tNumber = tNumber;
		this.tName = tName;
		this.tAcademy = tAcademy;
		this.tMajor = tMajor;
	}

	public int gettNumber() {
		return tNumber;
	}

	public void settNumber(int tNumber) {
		this.tNumber = tNumber;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String gettAcademy() {
		return tAcademy;
	}

	public void settAcademy(String tAcademy) {
		this.tAcademy = tAcademy;
	}

	public String gettMajor() {
		return tMajor;
	}

	public void settMajor(String tMajor) {
		this.tMajor = tMajor;
	}
	
	
}
