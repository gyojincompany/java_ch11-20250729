package com.gyojincompany.ch11.part01.stringexer;

public class Exer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "i like chopin";
		String result = "";
		
		result = result += String.valueOf(str.charAt(0)).toUpperCase();
		for (int i = 1; i < str.length(); i++) {
			String strone = String.valueOf(str.charAt(i));
			if (strone.equals(" ")) {
				result = result += " ";
				String abc = String.valueOf(str.charAt(i+1));
				result = result += abc.toUpperCase();
				i+=2;
			}
				result = result += String.valueOf(str.charAt(i));
		}
			System.out.println(result);
	}

}
