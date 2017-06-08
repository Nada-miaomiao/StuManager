package stuManager;

public class Manager {
	int mNumber;
	String mName;
	String mAcademy;
	
	public Manager(int mNumber, String mName, String mAcademy){
		this.mNumber = mNumber;
		this.mName = mName;
		this.mAcademy = mAcademy;		
	}

	public int getmNumber() {
		return mNumber;
	}

	public void setmNumber(int mNumber) {
		this.mNumber = mNumber;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmAcademy() {
		return mAcademy;
	}

	public void setmAcademy(String mAcademy) {
		this.mAcademy = mAcademy;
	}
	
	
}
