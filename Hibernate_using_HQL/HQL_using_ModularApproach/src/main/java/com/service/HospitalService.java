package com.service;

import com.dao.HospitalDao;

public class HospitalService {

	public void InsertData() {
		HospitalDao d1 = new HospitalDao();
		d1.InsertData();
		
	}

	public void UpdateData() {
		HospitalDao d2 = new  HospitalDao();
		d2.UpdateData();
		
	}

	public void GetSingleData() {
		HospitalDao d3 = new  HospitalDao();
		d3.GetSingleData();
		
	}

	public void DisplayAllData() {
		HospitalDao d4 = new  HospitalDao();
		d4.DisplayAllData();
		
	}

	public void DeleteData() {
		HospitalDao d5 = new  HospitalDao();
	    d5.DeleteData();
	}
}
