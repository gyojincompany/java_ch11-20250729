package com.gyojincompany.ch11.part01.stringtest;

public class ReplaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "길동이는 순신이보다 키가 큽니다. 하지만 순신이 길동이보다 말을 잘합니다."; //길동->유신
		String replaceStr = str.replace("길동", "유신"); //원본을 수정하지는 않음!->새로운 변수로 저장
		System.out.println(str);
		System.out.println(replaceStr);
		
		
		

	}

}
