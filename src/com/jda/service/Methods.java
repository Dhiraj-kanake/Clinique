package com.jda.service;
import com.jda.model.Doctor;
import com.jda.model.Patients;
import com.jda.serviceImpl.Application;
import com.jda.utility.Utility;

public class Methods {
	Utility utility = new Utility();
	Doctor doc=new Doctor();
	Application app=new Application();
	Doctor[] listOfDoctors;
	Patients[] listOfPatients;
	public Doctor[] createDoctorList()
	{
		System.out.println("How many Doctors you want to enter");
		int numberOfPersons=utility.inputInteger();
			listOfDoctors=new Doctor[numberOfPersons];
			for(int personNumber=0;personNumber<numberOfPersons;personNumber++)
			{
				listOfDoctors[personNumber]=app.addDoctor();
			}
			return listOfDoctors;
	}
	public Patients[] createpatientList()
	{
		System.out.println("How many Patients you want to enter");
		int numberOfPersons=utility.inputInteger();
			listOfPatients=new Patients[numberOfPersons];
			for(int personNumber=0;personNumber<numberOfPersons;personNumber++)
			{
				listOfPatients[personNumber]=app.addPatient();
			}
			return listOfPatients;
	}
}
