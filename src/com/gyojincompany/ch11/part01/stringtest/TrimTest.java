package com.gyojincompany.ch11.part01.stringtest;

import java.util.Scanner;

public class TrimTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("좋아하는 위인을 입력하세요:");
		String str = scanner.nextLine();
		
		System.out.println(str.strip()); //문자열 양쪽에 있는 공백 제거->원본은 수정되지 않음
		str = str.strip();
		System.out.println(str.length());
		
	}

}
