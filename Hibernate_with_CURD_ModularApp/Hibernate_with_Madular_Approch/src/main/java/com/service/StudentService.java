package com.service;

import com.dao.StudentDao;

public class StudentService {
	
	public static void InsertData() {
	StudentDao sd = new StudentDao();
	sd.InsertData();
	}

	public void UpdateData() {
		StudentDao sd = new StudentDao();
		sd.UpdateData();
		
	}

	public void GetSingleData() {
		StudentDao sd = new StudentDao();
		sd.GetSingleData();
		
	}

	public void DisplayAllData() {
		StudentDao sd = new StudentDao();
		sd.DisplayAllData();
			
	}

	public void DeleteData() {
		StudentDao sd = new StudentDao();
		sd.DeleteAllData();
		
	}
	

}
