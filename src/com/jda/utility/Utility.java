package com.jda.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.jda.model.Doctor;

public class Utility {
	static JSONParser parser = new JSONParser();
	Scanner scanner;

	public Utility() {
		scanner = new Scanner(System.in);
	}

	public String inputString() {
		return scanner.next();
	}

	public Long inputLong() {
		return scanner.nextLong();
	}

	public int inputInteger() {
		return scanner.nextInt();
	}

	@SuppressWarnings("unchecked")
	public void storeIntoFile(HashMap<Integer, Doctor[]> list)throws FileNotFoundException, IOException, ParseException 
	{
		String filename = "/home/bridgelabz/Documents/doctors.json";
		Object obj = parser.parse(new FileReader(filename));
		JSONObject object = (JSONObject) obj;
		JSONObject addressBook = (JSONObject) object.get("Doctors");
		JSONArray jArray = (JSONArray) addressBook.get("List");
		Doctor doc[] = list.get(1);
		HashMap<String, JSONObject> hMap2 = new HashMap<>(); // creating 2nd
		                                                  
		int lengthOfBook = doc.length;
		for (int i = 0; i < lengthOfBook; i++) {
			JSONObject jObject = doc[i].createObject();
			jArray.add(jObject);
		}
		addressBook.put("List", jArray);
		hMap2.put("Doctors", addressBook);

		JSONObject newObjectdemo = new JSONObject(hMap2); // converting that
		                                                  // hashmap2 into
		                                                  // jasonobject

		@SuppressWarnings("resource")
		FileWriter file = new FileWriter(filename); // writing into file

		file.write(newObjectdemo.toJSONString());
		// System.out.println("passed"+companyName);
		file.flush();

	}
	public void searchDoctor() throws FileNotFoundException, IOException, ParseException
	{
		String filename = "/home/bridgelabz/Documents/doctors.json";
		Object obj = parser.parse(new FileReader(filename));
		JSONObject object = (JSONObject)obj;
		JSONObject addressBook=(JSONObject) object.get("Doctors");
		JSONArray jArray=(JSONArray)addressBook.get("List");
		System.out.println("Enter the name of the Doctor to search");
		String Name=inputString();
	 @SuppressWarnings("rawtypes")
	Iterator itr = jArray.iterator();
		while(itr.hasNext())
		{
			JSONObject jobject=(JSONObject) itr.next();
			String name=(String) jobject.get("Name");
			if(Name.equals(name))
			{
				System.out.println("Found"+jobject);
				
			}
		}
	}

}
