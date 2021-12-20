package HospitalManagementSystem;

import static org.junit.Assert.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.PrintStream;
import java.util.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing_HospitalSystem 
{
	// Hospital Class Object
	private static Hospital H;	

	@BeforeClass
	public static void setUp() throws Exception {
		H = new Hospital();
		
		System.out.println("Creating hospital object...\n");
		
		//Scanner input = new Scanner(System.in);
		//System.out.println("");
		
		Doctor D1 = new Doctor("Adnan Tariq", "D1909812", 42, "Male", "03459200195", "Allergist/Immunologist", "Availiable");
		Doctor D2 = new Doctor("Mubashir Luqman", "D1909430", 53, "Male", "033119201835", "Cardiologist", "Availiable");
		Doctor D3 = new Doctor("Zohaib Adnan", "D195911", 38 , "Male", "03159272301", "General Surgeon", "Availiable");
		Doctor D4 = new Doctor("Javeria Imtiaz", "D190225", 32, "Feale", "03025910166", "Dermatologist", "Availiable");
		Doctor D5 = new Doctor("Kasif Munir", "D199332", 28, "Male", "03422610145", "Hematologist", "Availiable");
		Doctor D6 = new Doctor("Atif Jilani", "D190334", 46, "Male", "03320278345", "Plastic Surgeon", "Availiable");
		Doctor D7 = new Doctor("Rohail Gulbaz", "D190099", 34, "Male", "03342619145", "Neurologist", "Availiable");
		Doctor D8 = new Doctor("Sara Afzal", "D199332", 28, "Female", "03345013143", "Gynecologist", "Availiable");
		Doctor D9 = new Doctor("Subhan Ullah", "D191556", 52, "Male", "03345098233", "Physiatrist", "Availiable");
		Doctor D10 = new Doctor("Fatima Farooq", "D190643", 24, "Female", "03345073143", "Urologist", "Availiable");
		
		WardRoom WR1 = new WardRoom("Accident/Emergency (AE Unit)", "WR190111", "Beds Availiable", 0, "Male-Ward");
		WardRoom WR2 = new WardRoom("Accident/Emergency (AE Unit)", "WR190112", "Beds Availiable", 0, "Female-Ward");
		WardRoom WR3 = new WardRoom("Cardiology (CARDIO Unit)", "WR190121", "Beds Availiable", 0, "Male-Ward");
		WardRoom WR4 = new WardRoom("Cardiology (CARDIO Unit)", "WR190122", "Beds Availiable", 0, "Female-Ward");
		WardRoom WR5 = new WardRoom("Intensive/Critical Care (CC/IC Unit)", "WR190131", "Beds Availiable", 0, "Male-Ward");
		WardRoom WR6 = new WardRoom("Intensive/Critical Care (CC/IC Unit)", "WR190132", "Beds Availiable", 0,"Female-Ward");
		WardRoom WR7 = new WardRoom("Gynecology (GYN Unit)", "WR190141", "Beds Availiable", 0, "Male-Ward");
		WardRoom WR8 = new WardRoom("Gynecology (GYN Unit)", "WR190142", "Beds Availiable", 0, "Female-Ward");
		WardRoom WR9 = new WardRoom("Infection Control (INFECT Unit)", "WR190151", "Beds Availiable", 0, "Male-Ward");
		WardRoom WR10 = new WardRoom("Infection Control (INFECT Unit)", "WR190152", "Beds Availiable", 0, "Femle-Ward");
		WardRoom WR11 = new WardRoom("Maternity (MAT Unit)", "WR190161", "Beds Availiable", 0, "Female-Ward");
		WardRoom WR12 = new WardRoom("Nuerology (NUR Unit)", "WR190171", "Beds Availiable", 0, "Male-Ward");
		WardRoom WR13 = new WardRoom("Nuerology (NUR Unit)", "WR190172", "Beds Availiable", 0, "Female-Ward");
		WardRoom WR14 = new WardRoom("Intensive Surgery (IS Unit)", "WR190182", "Beds Availiable", 0, "Femle-Ward");
		WardRoom WR15 = new WardRoom("Intensive Surgery (IS Unit)", "WR190181", "Beds Availiable", 0, "Male-Ward");
		
		Patient P1 = new Patient("Ibrahim Khan", "k190312", 22, "Male", "03162533800", "Normal", "In-Charge", "WR190111", "Adnan Tariq");
		Patient P2 = new Patient("Hassan Jamil", "k190229", 21, "Male", "03350749821", "Critical", "In-Charge", "WR190181", "Zohaib Adnan");
		Patient P3 = new Patient("Fajr Naveed", "i190422", 20, "Female", "032976123081", "Normal", "In-Charge", "WR190122", "Atif Jilani");
		Patient P4 = new Patient("Muhammad Ibtisam", "i190442", 24, "Male", "0302912639213", "Adequate", "Dis-Charged", "-", "-");
		Patient P5 = new Patient("Mahnoor Muratza", "k190501", 21, "Female", "033496123115", "Critical", "In-Charge", "WR190142", "Sara Afzal");
		Patient P6 = new Patient("Khizr Hassan", "k190455", 21, "Male", "033362338123", "Normal", "In-Charge", "WR190151", "Kshif Munir");
		Patient P7 = new Patient("Hamza Adeel", "k190714", 21, "Male", "03365512356", "Critical", "In-Charge", "WR190111", "Rohail Gulbaz");
		Patient P8 = new Patient("Rutba Ali", "k190291", 21, "Female", "031212319918", "Normal", "Dis-Charged", "-", "-");
		Patient P9 = new Patient("Talha Rizwan", "i190982", 25, "Male", "0312941639213", "Adequate", "Dis-Charged", "-", "-");
		Patient P10 = new Patient("Sarim Sohail", "k195881", 21, "Male", "033358712091", "Normal", "In-Charge", "WR190151", "Subhan Ullah");
	
		H.AddDoctor(D1); H.AddDoctor(D2); H.AddDoctor(D3); H.AddDoctor(D4);	H.AddDoctor(D5);
		H.AddDoctor(D6); H.AddDoctor(D7); H.AddDoctor(D8); H.AddDoctor(D9); H.AddDoctor(D10);
		H.AddWard(WR1); H.AddWard(WR2); H.AddWard(WR3); H.AddWard(WR4); H.AddWard(WR5);
		H.AddWard(WR6); H.AddWard(WR7); H.AddWard(WR8); H.AddWard(WR9); H.AddWard(WR10);
		H.AddWard(WR11); H.AddWard(WR12); H.AddWard(WR13); H.AddWard(WR14); H.AddWard(WR15);
		H.AddPaitent(P1); H.AddPaitent(P2); H.AddPaitent(P3); H.AddPaitent(P4); H.AddPaitent(P5);
		H.AddPaitent(P6); H.AddPaitent(P7); H.AddPaitent(P8); H.AddPaitent(P9); H.AddPaitent(P10);
	}

	@Before
	public void BeforeEachTest() throws Exception {
	}

	@Test
	public void TestOne() { //Printing All Hospitals Data 
		H.PrintHospitalData();
	}

	@Test
	public void TestTwo() { //Printing All Patients Data 
		H.PrintPatientsData();
	}

	@Test
	public void TestThree() { //Printing Number of Patients in each ward room 
		H.WardPatient();
	}

	@Test
	public void TestFour() { //Printing Number of Patient Beds availiable in each ward room 
		H.PatientBedsAvailiable();
	}

	@Test
	public void TestFive() throws FileNotFoundException { //Printing All Hospitals Data in a File 
		
		  //Instantiating the File class
	      File file = new File("HospitalData.txt");
	      //Instantiating the PrintStream class
	      PrintStream stream = new PrintStream(file);
	      //System.out.println("Hello world");
	      System.setOut(stream);
	      //Printing values to file
	      //System.out.println("Hello, how are you");
	      //System.out.println("Welcome to Tutorialspoint");
	}	
}
