package com.jda.serviceImpl;

import com.jda.model.Doctor;
import com.jda.utility.Utility;

public class Application {
	Doctor doc;
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

}
