package com.gyojincompany.ch11.part01.stringtest;

public class SubstringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String addr = "서울특별시 종로구 숭인동 111번지 306호 2층";
		
		 String firstAddr = addr.substring(6, 9); //endindex에 해당하는 문자는 추출되는 문자열에 포함안됨		 
		 System.out.println(firstAddr);
		 String secondAddr = addr.substring(14); //endindex를 생략하면 시작 index 부터 끝까지 추출
		 System.out.println(secondAddr);
	}

}
