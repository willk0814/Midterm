package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {
	
	@BeforeClass
	public static void setup() {
		ArrayList<Staff> StaffList = new ArrayList<Staff>();
		Staff staff1 = new Staff(null, null, null, null, null, null, null, null, 0, 10000, null, null);
		Staff staff2 = new Staff(null, null, null, null, null, null, null, null, 0, 20000, null, null);
		Staff staff3 = new Staff(null, null, null, null, null, null, null, null, 0, 30000, null, null);
		Staff staff4 = new Staff(null, null, null, null, null, null, null, null, 0, 40000, null, null);
		Staff staff5 = new Staff(null, null, null, null, null, null, null, null, 0, 50000, null, null);
		
		StaffList.add(staff1);
		StaffList.add(staff2);
		StaffList.add(staff3);
		StaffList.add(staff4);
		StaffList.add(staff5);

		double sum = 0;
		for(int i = 0; i<5; i++) {
			sum += StaffList.get(i).getSalary();
		}
		double average = sum/5;
		assertEquals(average, 30000, .001);
	}
	
	@Test
	public void test() {
		assertEquals(1,1);
	}	

}
