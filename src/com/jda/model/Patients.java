package com.jda.model;

import org.json.simple.JSONObject;

public class Patients {
	private String Name;
	private String ID;
	private int MobileNumber;
	private int Age;
	
	public Patients(String Name,String ID, int MobileNumber,int Age)
	{
		this.Name=Name;
		this.ID=ID;
		this.MobileNumber=MobileNumber;
		this.Age=Age;
	}
	public Patients()
	{
	//	firstName =""; lastName=""; address = ""; city = ""; pincode=0;	state="";	mobileNumber=0;
	}
	public void printEntry()
	{
		System.out.println("Name :"+Name);
		System.out.println("ID :"+ID);
		System.out.println("MobileNumber :"+MobileNumber);
		System.out.println("Age :"+Age);
	}
	@SuppressWarnings("unchecked")
	public JSONObject createObject()
	{
		JSONObject object =new JSONObject();
		object.put("Name", Name);
		object.put("ID", ID);
		object.put("MobileNumber", MobileNumber);
		object.put("Age", Age);
		
		return object;
	}
}
