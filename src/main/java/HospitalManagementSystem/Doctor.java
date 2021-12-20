package HospitalManagementSystem;

public class Doctor 
{
	private String DoctorName;
	private String DoctorID;
	private int DoctorAge;
	private String DoctorGender;
	private String DoctorContactNumber;
	private String Designation;		// Doctor's Profession
	private String DoctorStatus;
		
	Doctor()
	{
		DoctorName = null;
		DoctorID = null;
		DoctorAge = 0;
		DoctorGender = null;
		DoctorContactNumber = null;
		Designation = null;
		DoctorStatus = null;
	}
	
	Doctor(String Name, String ID, int Age, String Gender, String ContactNumber, String Position, String Status)
	{
		DoctorName = Name;
		DoctorID = ID;
		DoctorAge = Age;
		DoctorGender = Gender;
		DoctorContactNumber = ContactNumber;
		Designation = Position;
		DoctorStatus = Status;
	}
	
	public String getDoctorName() {
		return DoctorName;
	}

	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
	}

	public String getDoctorID() {
		return DoctorID;
	}

	public void setDoctorID(String doctorID) {
		DoctorID = doctorID;
	}
	
	
	public int getDoctorAge() {
		return DoctorAge;
	}

	public void setDoctorAge(int doctorAge) {
		if(doctorAge < 0)
			throw new IllegalArgumentException("Doctor Age cannot be negative");
		else	
			DoctorAge = doctorAge;
	}

	public String getDoctorGender() {
		return DoctorGender;
	}

	public void setDoctorGender(String doctorGender) {
		DoctorGender = doctorGender;
	}

	public String getDoctorContactNumber() {
		return DoctorContactNumber;
	}

	public void setDoctorContactNumber(String doctorContactNumber) {
		DoctorContactNumber = doctorContactNumber;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public String getDoctorStatus() {
		return DoctorStatus;
	}

	public void setDoctorStatus(String doctorStatus) {
		DoctorStatus = doctorStatus;
	}

	public void PrintDoctorData()
	{
		System.out.println("\n");
		System.out.println("\n");

		System.out.println("Doctor  " + DoctorName + " Information\n");
		
		System.out.println("Doctor Name: " + DoctorName);
		System.out.println("Doctor ID: " + DoctorID);
		System.out.println("Age|Gender: " + DoctorAge + "|" + DoctorGender);
		System.out.println("Contact Number: " + DoctorContactNumber);
		System.out.println("Designation: " + Designation);
		System.out.println("Status: " + DoctorStatus);

		System.out.println("\n");
		System.out.println("\n");
	}
}
