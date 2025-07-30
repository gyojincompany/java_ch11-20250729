package com.gyojincompany.ch11.part01.stringtest;

public class StringTestAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = '1';
		
		if (ch >=65 && ch <= 90) {//65 -> 대문자 A 아스키코드값, 90 -> 대문자 Z 아스키코드값
			System.out.println(ch + "는 영문자 대문자 입니다.");
		} else if (ch >= 97 && ch <= 122 ){
			System.out.println(ch + "는 영문자 소문자 입니다.");
		}
		
		
		String str = "i like chopin";
		String str2 ="";
		
		for(int i=0;i<str.length();i++) {			
			if(i == 0) {
//				str2= str2 + String.valueOf(str.charAt(0)).toUpperCase();
				str2= str2 + String.valueOf(str.charAt(0)).toUpperCase();
			} else if (String.valueOf(str.charAt(i)).equals(" ")) {
				str2 = str2 + " " + String.valueOf(str.charAt(i+1)).toUpperCase();
				i = i+1;
			} else {
				str2 = str2 + String.valueOf(str.charAt(i));
			}
			
		}
		
		System.out.println(str2);
	}

}
