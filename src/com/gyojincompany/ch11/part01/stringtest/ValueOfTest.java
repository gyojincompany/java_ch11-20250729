package com.gyojincompany.ch11.part01.stringtest;

public class ValueOfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = String.valueOf(100);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println(str1.substring(2)); //문자열로 변경되어 문자열 메소드 적용 가능해짐
		System.out.println(str2);
		System.out.println(str3.toUpperCase());
		
	}

}
