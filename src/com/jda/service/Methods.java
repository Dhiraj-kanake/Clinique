package com.jda.service;
import com.jda.model.Doctor;
import com.jda.serviceImpl.Application;
import com.jda.utility.Utility;

public class Methods {
	Utility utility = new Utility();
	Doctor doc=new Doctor();
	Application app=new Application();
	Doctor[] listOfDoctors;
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
}
