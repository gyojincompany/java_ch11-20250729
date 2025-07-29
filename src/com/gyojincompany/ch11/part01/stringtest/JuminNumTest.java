// 주민번호 출력 프로그램

package com.gyojincompany.ch11.part01.stringtest;

public class JuminNumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jumin = "990725-1234537"; 
		//성별 1900년 생 1->남자, 2->여자, 2000년 생 3->남자, 4->여자, 1800년 생 9->남자, 0->여자
		char gender = jumin.charAt(7); //index는 0부터 시작하는 것에 주의!
		
		switch (gender) {
		case '1': //char 타입 문자와 비교
		case '3': //char 타입 문자와 비교
			System.out.println("남자!");
			break;
		case '2': //char 타입 문자와 비교
		case '4': //char 타입 문자와 비교
			System.out.println("여자!");
			break;
		}
			
			
		
		
		
		
	}

}
