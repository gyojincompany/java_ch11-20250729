package com.gyojincompany.ch11.part01.stringexer;

// 2. korea@korea.com 이메일 주소에서 아이디와 도메인을 분리하여 출력하는 프로그램을 작성하시오.

public class Exer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "korea@korea.com";
		
//		String emailId = email.substring(0, 5);
//		String emailDomain = email.substring(6);
		
		int at_index = email.indexOf("@"); //@의 인덱스
		String emailId = email.substring(0, at_index);
		String emailDomain = email.substring(at_index+1);
		
		System.out.println("이메일 아이디 : " + emailId);
		System.out.println("이메일 도메인 : " + emailDomain);
	}

}
