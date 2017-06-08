package stuManager;

public class Student {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stuAcademy == null) ? 0 : stuAcademy.hashCode());
		result = prime * result + stuBirthdate;
		result = prime * result + ((stuMajor == null) ? 0 : stuMajor.hashCode());
		result = prime * result + ((stuName == null) ? 0 : stuName.hashCode());
		result = prime * result + stuNumber;
		result = prime * result + ((stuSex == null) ? 0 : stuSex.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (stuAcademy == null) {
			if (other.stuAcademy != null)
				return false;
		} else if (!stuAcademy.equals(other.stuAcademy))
			return false;
		if (stuBirthdate != other.stuBirthdate)
			return false;
		if (stuMajor == null) {
			if (other.stuMajor != null)
				return false;
		} else if (!stuMajor.equals(other.stuMajor))
			return false;
		if (stuName == null) {
			if (other.stuName != null)
				return false;
		} else if (!stuName.equals(other.stuName))
			return false;
		if (stuNumber != other.stuNumber)
			return false;
		if (stuSex == null) {
			if (other.stuSex != null)
				return false;
		} else if (!stuSex.equals(other.stuSex))
			return false;
		return true;
	}
	int stuNumber;
	int stuBirthdate;
	String stuName;
	String stuSex;
	String stuAcademy;
	String stuMajor;
	
	public Student() {}
	
	public Student(int stuNumber,int stuBirthdate,String stuName,
	String stuSex,String stuAcademy,String stuMajor){
		this.stuNumber = stuNumber;
		this.stuBirthdate = stuBirthdate;
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuAcademy = stuAcademy;
		this.stuMajor = stuMajor;
	}
	
	public int getStuNumber() {
		return stuNumber;
	}
	public void setStuNumber(int stuNumber) {
		this.stuNumber = stuNumber;
	}
	public int getStuBirthdate() {
		return stuBirthdate;
	}
	public void setStuBirthdate(int stuBirthdate) {
		this.stuBirthdate = stuBirthdate;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuSex() {
		return stuSex;
	}
	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}
	public String getStuAcademy() {
		return stuAcademy;
	}
	public void setStuAcademy(String stuAcademy) {
		this.stuAcademy = stuAcademy;
	}
	public String getStuMajor() {
		return stuMajor;
	}
	public void setStuMajor(String stuMajor) {
		this.stuMajor = stuMajor;
	}
	
	
}
