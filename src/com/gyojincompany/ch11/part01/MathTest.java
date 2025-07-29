package com.gyojincompany.ch11.part01;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.abs(-10)); //절대값 계산 -> 10
		
		System.out.println(Math.ceil(3.14)); //소수점 올림
		System.out.println(Math.floor(3.94)); //소수점 내림
		System.out.println(Math.round(3.74)); //소수점 반올림 
		
		System.out.println(Math.max(5, 10)); //두 정수 중 큰 값이 반환됨
		System.out.println(Math.max(1.1, 10.1)); //두 실수 중 큰 값이 반환됨
		
		System.out.println(Math.min(5, 10)); //두 정수 중 작은 값이 반환됨
		System.out.println(Math.min(1.1, 10.1)); //두 실수 중 작은 값이 반환됨		
		
		System.out.println(Math.random()); //0 ~ 1 사이의 수중 랜덤으로 1개 반환(0은 가능, 1은 불가능)
		System.out.println(Math.floor(Math.random() * 45 + 1)); //1 ~ 45 사이의 수중 랜덤으로 1개 반환
		
		System.out.println(Math.rint(3.5)); //인수값에 가장 가까운 정수를 실수형으로 반환(.5 -> 반올림)
		//반올림하는 메소드
		
		
		

	}

}
