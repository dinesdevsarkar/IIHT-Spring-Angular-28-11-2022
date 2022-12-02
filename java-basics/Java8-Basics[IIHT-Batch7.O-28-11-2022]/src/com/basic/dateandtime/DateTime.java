package com.basic.dateandtime;

import java.text.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTime {
	
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		//LocalDate today1 = LocalDate.of(2022, 8, 15);
		LocalDate today1 = LocalDate.of(2022, Month.AUGUST, 15);
		System.out.println(today1);
		//Date date = new Date();
		
		LocalDateTime rightnow = LocalDateTime.now();
		System.out.println(rightnow);
		
		LocalTime time1 = LocalTime.now();
		System.out.println(time1.of(5, 50, 33));
		
		LocalTime time2 = LocalTime.now(ZoneId.of("CET"));
		System.out.println(time2);
	}
}
