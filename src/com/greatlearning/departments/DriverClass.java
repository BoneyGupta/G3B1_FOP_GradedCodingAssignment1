package com.greatlearning.departments;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminDepartment ad= new AdminDepartment();
		HrDepartment hd=new HrDepartment();
		TechDepartment td= new TechDepartment();
		
		System.out.println(" Welcome to"+ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		System.out.println();
		
		
		System.out.println(" Welcome to"+hd.departmentName());
		System.out.println(hd.doActivity());
		System.out.println(hd.getTodaysWork());
		System.out.println(hd.getWorkDeadline());
		System.out.println(hd.isTodayAHoliday());
		System.out.println();		
		
		
		System.out.println(" Welcome to"+ td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());
		
		
	}

}
