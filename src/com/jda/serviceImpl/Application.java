package com.jda.serviceImpl;

import com.jda.model.Doctor;
import com.jda.model.Patients;
import com.jda.utility.Utility;

public class Application {
	Doctor doc;
	Patients pat;
	Utility utility = new Utility();
	public Doctor addDoctor()
	{
		System.out.println("Enter Name Of the Doctor :");
		String name=utility.inputString();
		System.out.println("Enter ID of Dr. " +name);
		String ID=utility.inputString();
		System.out.println("Specialization of Dr.  "+name);
		String Specialization=utility.inputString();
		System.out.println("Availability of Dr. "+name);
		String Availability=utility.inputString();
		doc=new Doctor(name,ID,Specialization,Availability);
		return doc;
	}
	public Patients addPatient()
	{
		System.out.println("Enter Name Of the Patient :");
		String name=utility.inputString();
		System.out.println("Enter ID of  " +name);
		String ID=utility.inputString();
		System.out.println("Mobile number of "+name);
		int number=utility.inputInteger();
		System.out.println("Enter Age "+name);
		int Age=utility.inputInteger();
		pat=new Patients(name,ID,number,Age);
		return pat;
	}

}
