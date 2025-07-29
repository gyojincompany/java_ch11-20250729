package com.gyojincompany.ch11.part01.stringtest;

public class ToLowerUpperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "KOREA";
		String str2 = "japan";
		String str3 = "JAPAN";
		
		System.out.println(str1.toLowerCase()); //모두 소문자로 변경 -> 원본은 수정하지 않음
		System.out.println(str1); //모두 소문자로 변경
		System.out.println(str2.toUpperCase()); //모두 대문자로 변경 -> 원본은 수정하지 않음
		str2 = str2.toUpperCase(); // 대문자로 변환 후 overwrite(덮어쓰기)
		if(str2.equals(str3)) {
			System.out.println("두 문자열은 같다!");
		} else {
			System.out.println("두 문자열은 다르다!");
		}
		
		
	}

}
