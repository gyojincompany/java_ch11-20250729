package com.gyojincompany.ch11.part01;

import java.util.Date;

public class ToStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object ob = new Object();
		System.out.println(ob.toString());
		
		Member member1 = new Member(); //id->null
		Member member2 = new Member("Tiger"); //id->Tiger
		System.out.println(member2.toString()); //Tiger
		System.out.println(member1.id); //null
		
		Date date = new Date();
		System.out.println(date.toString());
		
		
	}

}
