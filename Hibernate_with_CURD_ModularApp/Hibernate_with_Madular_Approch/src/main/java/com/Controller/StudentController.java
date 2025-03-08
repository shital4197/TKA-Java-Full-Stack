package com.Controller;

import com.service.StudentService;

public class StudentController {

	public static void main(String[] args) {
		
		StudentService ss = new StudentService();
//		ss.InsertData();
//		ss.UpdateData();
//		ss.GetSingleData();
//		ss.DisplayAllData();
		ss.DeleteData();

	}

}
