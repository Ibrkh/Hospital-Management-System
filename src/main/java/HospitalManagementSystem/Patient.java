package HospitalManagementSystem;

public class Patient 
{
	private String PatientName;
	private String PatientID;
	private int PatientAge;
	private String PatientGender;
	private String PatientContactNumber;
	private String PatientCondition;	// Specific care will be provided depending upon the condition of the patient
	private String PatientStatus;
	private String PatientWardID;		// The Ward Room ID in which patient is admitted in..
	private String PatientDoctor;		// The Doctor assigned to the patient
	
	Patient()
	{
		PatientName = null;
		PatientID = null;
		PatientAge = 0;
		PatientGender = null;
		PatientContactNumber = null;
		PatientCondition = null;
		PatientStatus = null;
		PatientWardID = null;
		PatientDoctor = null;
	}

	Patient(String Name, String ID, int Age, String Gender, String ContactNumber, String Condition, String Status, String WardID, String Doctor)
	{
		PatientName = Name;
		PatientID = ID;
		PatientAge = Age;
		PatientGender = Gender;
		PatientContactNumber = ContactNumber;
		PatientCondition = Condition;
		PatientStatus = Status;
		PatientWardID = WardID;
		PatientDoctor = Doctor;
	}
	
	public String getPatientName() {
		return PatientName;
	}

	public void setPatientName(String patientName) {
		PatientName = patientName;
	}

	public String getPatientID() {
		return PatientID;
	}

	public void setPatientID(String patientID) {
		PatientID = patientID;
	}
	
		
	public int getPatientAge() {
		return PatientAge;
	}

	public void setPatientAge(int patientAge) {
		if(patientAge < 0)
			throw new IllegalArgumentException("Patient Age cannot be negative");
		else
			PatientAge = patientAge;
	}

	public String getPatientGender() {
		return PatientGender;
	}

	public void setPatientGender(String patientGender) {
		PatientGender = patientGender;
	}

	public String getPatientContactNumber() {
		return PatientContactNumber;
	}

	public void setPatientContactNumber(String patientContactNumber) {
		PatientContactNumber = patientContactNumber;
	}

	public String getPatientCondition() {
		return PatientCondition;
	}

	public void setPatientCondition(String patientCondition) {
		PatientCondition = patientCondition;
	}

	public String getPatientStatus() {
		return PatientStatus;
	}

	public void setPatientStatus(String patientStatus) {
		PatientStatus = patientStatus;
	}

	public String getPatientWardID() {
		return PatientWardID;
	}

	public void setPatientWardID(String patientWardID) {
		PatientWardID = patientWardID;
	}

	public String getPatientDoctor() {
		return PatientDoctor;
	}

	public void setPatientDoctor(String patientDoctor) {
		PatientDoctor = patientDoctor;
	}

	public void PrintPatientData()
	{
		System.out.println("\n");
		System.out.println("\n");

		System.out.println("Patient " + PatientName + " Information\n");
		
		System.out.println("Patient Name: " + PatientName);
		System.out.println("Patient ID: " + PatientID);
		System.out.println("Age|Gender: " + PatientAge + "|" + PatientGender);
		System.out.println("Contact Number: " + PatientContactNumber);
		System.out.println("Condition: " + PatientCondition);
		System.out.println("Status: " + PatientStatus);
		System.out.println("Patient WardID: " + PatientWardID);
		System.out.println("Doctor Assigned: " + PatientDoctor);
		
		System.out.println("\n");
		System.out.println("\n");
	}
}
