package com.gyojincompany.ch11.part01.stringexer;
// 1. "abcabcabc"에서 "ab"가 몇 번 나오는지 세어 주는 프로그램을 작성하시오.

public class Exer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcabcabc";
		
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'a' && str.charAt(i+1) == 'b') { //'a''b'
				count++;
			}
		}
		System.out.println(count);
		
		System.out.println("======================");
		
		String str1 = "abcabcabc";
		int startIndex = 0;
		int foundIndex;
		int sum = 0;
		
		while((foundIndex = str1.indexOf("ab", startIndex)) != -1) {
			sum++;
			startIndex = foundIndex + 1;
			
		}
		System.out.println("ab 의 개수 : " + sum);
		
		System.out.println("======================");
		
		String strAbc = "abcabcabc";
		String strTarget = "ab";
		int countA = 0;
		
		for(int i=0;i<=strAbc.length() - strTarget.length();i++) {
			if(strAbc.substring(i, i + strTarget.length()).equals(strTarget)) {
				//1회전) i=0 0~2 -> "ab" O
				//2회전) i=1 1~3 -> "bc" X
				//3회전) i=2 2~4 -> "ca" X
				//.....
				//7회전) i=6 6~8 -> "bc" X
				
				countA++;
			}		
		}
		System.out.println(countA);	
		
				
				
		
	}

}
