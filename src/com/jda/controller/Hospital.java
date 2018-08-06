package com.jda.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.jda.model.Doctor;
import com.jda.model.Patients;
import com.jda.service.Methods;
import com.jda.serviceImpl.Application;
import com.jda.utility.Utility;

public class Hospital {
	static JSONParser parser = new JSONParser();

	public static void main(String args[]) throws FileNotFoundException, IOException, ParseException {
		Doctor doc = new Doctor();
		Patients pat = new Patients();
		Utility utility = new Utility();
		Methods mt =new Methods();
		boolean flag = false, demo = false;
		int doctorNumber = 0;
		int patientNumber =0;
		HashMap<Integer, Doctor[]> doctorList = new HashMap<>();
		HashMap<Integer,Patients[]> patientList = new HashMap<>();
		while (true) {
			System.out.println("***Clinique Management***");
			System.out.println("1. Doctors");
			System.out.println("2. Enter Patients");
			System.out.println("3.Search Doctor");
			System.out.println("4.search Patient");
			System.out.println("5.Take appointment");
			System.out.println("6. print report");
			System.out.println("7.exit");
			int choice = utility.inputInteger();
			switch (choice) {
			case 1: {
				System.out.println(" 1. Enter new Doctors ");
				System.out.println("2. search Doctor");
				int ch=utility.inputInteger();
				switch(ch)
				{
				case 1:
				{
				doctorNumber += 1;
				doctorList.put(doctorNumber, mt.createDoctorList());
				utility.storeIntoFile(doctorList);
				break;
				}
				case 2:
				{
					utility.searchDoctor();
				}
				}
				break;
			}
			case 2: {
				System.out.println(" 1. Enter new patients ");
				System.out.println("2. search patient");
				int ch=utility.inputInteger();
				switch(ch)
				{
				case 1:
				{
				patientNumber += 1;
				patientList.put(patientNumber, mt.createPatientList());
				utility.storeIntoFile(doctorList);
				break;
				}
				case 2:
				{
					utility.searchDoctor();
				}
				}
				break;
				
				break;
			}
			case 3: {
				
				break;
			}
			case 4: {
				utility.editPersonDetail(bookList);
				break;
			}
			case 5: {
				utility.deletePerson(bookList);
				break;
			}
			case 6: {
				flag = true;
				break;
			}
			}
			if (flag)
				break;
		}

	}
}
