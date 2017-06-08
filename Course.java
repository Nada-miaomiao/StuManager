package stuManager;

public class Course {
	private int cNumber;
	private int cPeriod;
	private int cCredit;
	private String cName;

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(int cNumber, int cPeriod, int cCredit, String cName) {
		this.cName = cName;
		this.cCredit = cCredit;
		this.cNumber = cNumber;
		this.cPeriod = cPeriod;
	}

	public int getcNumber() {
		return cNumber;
	}

	public void setcNumber(int cNumber) {
		this.cNumber = cNumber;
	}

	public int getcPeriod() {
		return cPeriod;
	}

	public void setcPeriod(int cPeriod) {
		this.cPeriod = cPeriod;
	}

	public int getcCredit() {
		return cCredit;
	}

	public void setcCredit(int cCredit) {
		this.cCredit = cCredit;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

}
