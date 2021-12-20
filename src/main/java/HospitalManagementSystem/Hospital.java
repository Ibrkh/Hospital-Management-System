package HospitalManagementSystem;

import java.util.*;  

public class Hospital 
{
	private String HospitalID;
	private String HospitalName;
	private String HospitalLocation;
	private int HospitalFloors;		// Number of floors
	private int HospitalCapacity;	// Number of WardRooms
	private float HospitalRating;
	private float Price;			// Price for each Patient bed
	
	private ArrayList<WardRoom> Rooms;	//WardRoom
	private ArrayList<Doctor> Doctors;	//Doctors
	private ArrayList<Patient> Patients;//Patients
	
	Hospital()
	{
		Rooms = new ArrayList<WardRoom>();
		Doctors = new ArrayList<Doctor>();	
		Patients  = new ArrayList<Patient>();
		
		HospitalID = "K190312I190657";
		HospitalName = "Shifa International";
		HospitalLocation = "Sector H-8, Islamabad";
		HospitalFloors = 10;	// 10 Floors Building
		HospitalCapacity = 100;	// 10 Wards on each floor
		HospitalRating = 4.2f;	// MAX 5
		Price = 8645.75f;		// Price per Bed
	}
			
	public String getHospitalID() {
		return HospitalID;
	}


	public void setHospitalID(String hospitalID) {
		HospitalID = hospitalID;
	}


	public String getHospitalName() {
		return HospitalName;
	}


	public void setHospitalName(String hospitalName) {
		HospitalName = hospitalName;
	}


	public String getHospitalLocation() {
		return HospitalLocation;
	}


	public void setHospitalLocation(String hospitalLocation) {
		HospitalLocation = hospitalLocation;
	}


	public int getHospitalFloors() {
		return HospitalFloors;
	}


	public void setHospitalFloors(int hospitalFloors) {
		if(hospitalFloors < 0)
			throw new IllegalArgumentException("Hospital Floors cannot be negative");
		if(hospitalFloors > 10)
			throw new IllegalArgumentException("Hospital Floors invalid ! MAX 10 Floors");
			
		else	
			HospitalFloors = hospitalFloors;
	}


	public float getHospitalRating() {
		return HospitalRating;
	}


	public void setHospitalRating(float hospitalRating) {
		if(hospitalRating < 0.00f)
			throw new IllegalArgumentException("Hospital Rating cannot be negative");
		if(hospitalRating > 5.00f)
			throw new IllegalArgumentException("Hospital Rating invalid ! MAX 5.00f");			
		else
			HospitalRating = hospitalRating;
	}


	public float getPrice() {
		return Price;
	}


	public void setPrice(float price) {
		if(price < 0)
			throw new IllegalArgumentException("Price cannot be negative");
		else
			Price = price;
	}

	public int getHospitalCapacity() {
		return HospitalCapacity;
	}

	public void setHospitalCapacity(int hospitalCapacity) {
		if(hospitalCapacity < 0)
			throw new IllegalArgumentException("Hospital Capacity cannot be negative");
		else
			HospitalCapacity = hospitalCapacity;
	}

	public void AddDoctor(Doctor doctor){
		Doctors.add(doctor);
	}
	
	public void AddPaitent(Patient patient){		
		for(int i=0;i<Rooms.size();i++)
		{	
			if(patient.getPatientWardID() == Rooms.get(i).getWardID())
			{	
				Rooms.get(i).setWardCapacity((Rooms.get(i).getWardCapacity())+1);
				Patients.add(patient);
				break;
			}
			if(Rooms.get(i).getWardCapacity() > 12)
				throw new IllegalArgumentException("Hospital Ward Capacity is Full !");
		}
	}
	
	public void AddWard(WardRoom ward){
		Rooms.add(ward);
		HospitalCapacity--;
	}
	
	public void WardPatient() {
		for(int i=0;i<Rooms.size();i++)
			System.out.println("Patients in Ward " + Rooms.get(i).getWardID() + "|" + Rooms.get(i).getWardName() + ": "  + Rooms.get(i).getWardCapacity());	
	}
	
	public void PatientBedsAvailiable() {
		
		for(int i=0;i<Rooms.size();i++)
		{
			int BedsAvailiable = 12;
			BedsAvailiable -= Rooms.get(i).getWardCapacity();
			System.out.println("Patient Beds availiable in Ward " + Rooms.get(i).getWardID() + "|" + Rooms.get(i).getWardName() + ": "  + BedsAvailiable);	
		}
	}
	
	public void PrintPatientsData() {
		for(int i=0;i<Patients.size();i++)
			Patients.get(i).PrintPatientData();		
	}
	
	public void PrintHospitalData(){
		
		System.out.println("Hospital " + HospitalName + " Information\n");
		
		System.out.println("Hospital Name: " + HospitalName);
		System.out.println("Hospital ID: " + HospitalID);
		System.out.println("Hospital Location: " + HospitalLocation);
		System.out.println("Hospital Building Floors: " + HospitalFloors);
		System.out.println("Number of WardRooms: " + HospitalCapacity);
		System.out.println("Hospital Ratings: " + HospitalRating);
		System.out.println("Price for one capacity Patient Bed: " + Price);
		
		System.out.println("\n");
		System.out.println("\n");
		
		for(int i=0;i<Rooms.size();i++)
			Rooms.get(i).PrintWardData();

		for(int i=0;i<Doctors.size();i++)
			Doctors.get(i).PrintDoctorData();

		for(int i=0;i<Patients.size();i++)
			Patients.get(i).PrintPatientData();		
	}
}
