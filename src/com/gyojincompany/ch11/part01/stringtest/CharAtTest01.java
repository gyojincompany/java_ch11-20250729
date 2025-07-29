package com.gyojincompany.ch11.part01.stringtest;

public class CharAtTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Korea oop program";
		String str2 = "우리나라 좋은나라";
		
		System.out.println(str.charAt(3)); //e->문자열 중에서 원하는 문자 1글자만 반환해주는 메소드
		
		int count = 0;
		for(int i=0;i<str.length();i++) {
			//System.out.println(str.charAt(i));
			if(str.charAt(i) == 'o') {
				System.out.println("문자열 내에 소문자 o가 포함되어 있습니다.");
				count++;			}
		}
		
		System.out.println(str + " 문자열 내에 소문자 o가 " + count + "번 포함되어 있습니다.");
	}

}
