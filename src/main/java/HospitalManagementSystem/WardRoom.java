package HospitalManagementSystem;

public class WardRoom 
{
	private String WardName;
	private String WardID;
	private String WardStatus;
	private int WardCapacity;	// Number of patients in a ward room; MAX 12
	private String WardType; 	// Male_Ward or Female_Ward
		
	WardRoom()
	{
		WardName = null;
		WardID = null;
		WardStatus = null;
		WardCapacity = 0;	// 12 number of patients can be in a ward room
		WardType = null;	
	}
	
	WardRoom(String Name, String ID, String Status, int Capacity, String Type)
	{
		WardName = Name;
		WardID = ID;
		WardStatus = Status;
		WardCapacity = Capacity;
		WardType = Type;			
	}
	
	public String getWardName() {
		return WardName;
	}

	public void setWardName(String wardName) {
		WardName = wardName;
	}

	public String getWardID() {
		return WardID;
	}

	public void setWardID(String wardID) {
		WardID = wardID;
	}

	public String getWardStatus() {
		return WardStatus;
	}

	public void setWardStatus(String wardStatus) {
		WardStatus = wardStatus;
	}

	public int getWardCapacity() {
		return WardCapacity;
	}

	public void setWardCapacity(int wardCapacity) {
		WardCapacity = wardCapacity;
	}

	public String getWardType() {
		return WardType;
	}

	public void setWardType(String wardType) {
		WardType = wardType;
	}
	
	public void PrintWardData()
	{
		System.out.println("\n");
		System.out.println("\n");

		System.out.println("Ward Room  " + WardName + " Information\n");
		
		System.out.println("Ward Name: " + WardName);
		System.out.println("Ward ID: " + WardID);
		System.out.println("Status: " + WardStatus);
		System.out.println("Ward Capacity: " + WardCapacity);
		System.out.println("Ward Type: " + WardType);

		
		System.out.println("\n");
		System.out.println("\n");
	}
}
