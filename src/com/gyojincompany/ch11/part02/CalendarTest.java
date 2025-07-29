package com.gyojincompany.ch11.part02;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calNow = Calendar.getInstance();
		
		int year = calNow.get(Calendar.YEAR); //2025
		int month = calNow.get(Calendar.MONTH) + 1; //7
		int day = calNow.get(Calendar.DAY_OF_MONTH); //29
		
		int hour = calNow.get(Calendar.HOUR); //시간
		int minute = calNow.get(Calendar.MINUTE); //분
		int second = calNow.get(Calendar.SECOND); //초
		
		System.out.println(year + "년 " + month + "월 " + day + "일");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
		
		//요일 출력하기
		int weekday = calNow.get(Calendar.DAY_OF_WEEK);
		System.out.println("오늘의 요일:"+ weekday);
		System.out.println("오늘의 요일:"+ Calendar.TUESDAY);
		
		if(weekday == Calendar.TUESDAY) {
			System.out.println("오늘은 화요일 입니다!");
		} else {
			System.out.println("오늘은 화요일이 아닙니다!");
		}
	}

}
