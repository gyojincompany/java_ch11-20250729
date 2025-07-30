package com.gyojincompany.ch11.part01.stringexer;

//3. "banana" 에서 중복된 문자를 제거하면 "ban" 이 됩니다. 
//중복으로 나오는 문자를 제거하여 "banana"를 "ban"으로 출력하는 프로그램을 작성하시오.

public class Exer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~100까지의 수중에 홀수만 모두 더한 값
//		int sum = 0;
//		for(int i=1;i<=100;i++) {
//			if(i % 2 != 0) { //홀수 판별
//				sum = sum + i;
//			}
//		}
		
		String str = "banana";
		String result = ""; //int sum=0;
		
		for(int i=0;i<str.length();i++) {
			if(result.indexOf(str.charAt(i)) == -1) {
				result = result + str.charAt(i);
			}
			
		}
		
		System.out.println(result);
	}

}
