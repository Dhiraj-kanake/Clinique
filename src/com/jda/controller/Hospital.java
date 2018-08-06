package com.jda.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.jda.model.Doctor;
import com.jda.service.Methods;
import com.jda.serviceImpl.Application;
import com.jda.utility.Utility;

public class Hospital {
	static JSONParser parser = new JSONParser();

	public static void main(String args[]) throws FileNotFoundException, IOException, ParseException {
		Doctor doc = new Doctor();
		Utility utility = new Utility();
		Methods mt =new Methods();
		boolean flag = false, demo = false;
		int doctorNumber = 0;
		HashMap<Integer, Doctor[]> doctorList = new HashMap<>();
		while (true) {
			System.out.println("***Clinique Management***");
			System.out.println("1.Enter New Doctor");
			System.out.println("2.Search Doctor");
			System.out.println("3.search Patient");
			System.out.println("4.Take appointment");
			System.out.println("5. print report");
			System.out.println("6.exit");
			int choice = utility.inputInteger();
			switch (choice) {
			case 1: {
				doctorNumber += 1;
				doctorList.put(doctorNumber, mt.createDoctorList());
				utility.storeIntoFile(doctorList);
				break;
			}
			case 2: {
				utility.searchDoctor();
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
