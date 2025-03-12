package com.controller;

import com.service.HospitalService;

public class HospitalController {

	public static void main(String[] args) {
		
		HospitalService ss = new HospitalService ();
//		ss.InsertData();
//		ss.UpdateData();
//		ss.GetSingleData();
//		ss.DisplayAllData();
		ss.DeleteData();

	}

}
