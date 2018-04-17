
public class Main {

	public static void main(String[] args) {
		
		Client c1 = new Client("Cınar mobilya","istanbul pendik","hasancnr08@cinarmobilya.com","İbrahim Çınar","ibrahimcinar@gmail.com",1);
		
		
		System.out.println("companyname: "+c1.getCompanyName());
		System.out.println("companyAddress: "+c1.getCompanyAddress());
		System.out.println("companyEmail: "+c1.getCompanyEmail());
		System.out.println("conctactName: "+c1.getContactName());
		System.out.println("contactEmail: "+c1.getContactEmail());
		System.out.println("id: "+c1.getId());
				
		
		c1.getClientCampaigns();
		c1.addNewCampaign();
		
		
		StaffMember s1 = new StaffMember(1,"Onur Dağdelen","16 Mayıs 2016","onurdagdelenn@gmail.com");
		
		
		System.out.println("staffNo: "+s1.getStaffNo());
		System.out.println("staffName: "+s1.getStaffName());
		System.out.println("staffStartDate: "+s1.getStaffStartDate());
		System.out.println("staffEmailAddress: "+s1.getStaffEmailAddress());
		
				
		
		s1.getStaffDetails();
		s1.assignStaffContact();
	}
		
	
		
}
