import java.util.ArrayList;

public class StaffMember {
	
	int staffNo=1;
	String staffName,staffStartDate,staffEmailAddress;

	public void getStaffDetails() {
		
		
		System.out.println("Çalışanın Numarası: " + staffNo);
		System.out.println("Çalışanın İsmi: " +staffName);
		System.out.println("Çalışanın İşe Başalama Tarihi: " +staffStartDate);
		System.out.println("Çalışanın Email Adresi: " +staffEmailAddress);
		
	}
	public void assignStaffContact() {
		
		ArrayList <String> staffContact = new ArrayList <String> ();	
		staffContact.add("Onur Dağdelen 5453087202");
		staffContact.add("Kazım Dağdelen 5322249268");
		
		System.out.println (staffContact.get(0));
		System.out.println (staffContact.get(1));
		
	    }
	
	public StaffMember(int alinanstaffNo,String alinanstaffName,String alinanstaffStartDate,String alinanstaffEmailAddress) {
		
		setStaffNo(alinanstaffNo);
		setStaffName(alinanstaffName);
		setStaffStartDate(alinanstaffStartDate);
		setStaffEmailAddress(alinanstaffEmailAddress);
	}
	
	public int getStaffNo() {
		return staffNo;
	}
	public void setStaffNo(int staffNo) {
		this.staffNo = staffNo;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffStartDate() {
		return staffStartDate;
	}
	public void setStaffStartDate(String staffStartDate) {
		this.staffStartDate = staffStartDate;
	}
	public String getStaffEmailAddress() {
		return staffEmailAddress;
	}
	public void setStaffEmailAddress(String staffEmailAddress) {
		this.staffEmailAddress = staffEmailAddress;
	}
	
	
}
