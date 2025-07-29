package com.gyojincompany.ch11.part01.stringtest;

public class StringTest0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "KOR";
		String str2 = "jap";
		String str3 = str1 + str2;
		System.out.println(str3);
		//banana
		String str4 ="";
		if(str4.indexOf("b") == -1) { //이미 문자열에 해당 문자가 확인 후 참이나오면 문자열 끝에 문자 추가
			str4 = str4 + "b";
		}
	}

}
