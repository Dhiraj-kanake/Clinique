package com.jda.model;

import org.json.simple.JSONObject;

public class Doctor {
	private String Name;
	private String ID;
	private String Specialization;
	private String Availability;
	
	public Doctor(String Name,String ID, String Specialization,String Availability)
	{
		this.Name=Name;
		this.ID=ID;
		this.Specialization=Specialization;
		this.Availability=Availability;
	}
	public Doctor()
	{
	//	firstName =""; lastName=""; address = ""; city = ""; pincode=0;	state="";	mobileNumber=0;
	}
	public void printEntry()
	{
		System.out.println("Name :"+Name);
		System.out.println("ID :"+ID);
		System.out.println("Specialization :"+Specialization);
		System.out.println("Availability :"+Availability);
	}
	@SuppressWarnings("unchecked")
	public JSONObject createObject()
	{
		JSONObject object =new JSONObject();
		object.put("Name", Name);
		object.put("ID", ID);
		object.put("Specialization", Specialization);
		object.put("Availability", Availability);
		
		return object;
	}

}
