package com.gyojincompany.ch11.part01;

public class SystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10000;i++) {
			System.out.println(i);
			if(i == 5000) {				
				break;
				// System.exit(i); //프로그램 종료
			}			
		}		
		System.out.println("for문 종료 후 출력되는 문장");
		
		
		
		long time1 = System.nanoTime(); //현재시간을 나노초로 변환하여 저장
		long time_m1 = System.currentTimeMillis(); //현재시간을 밀리초로 변환하여 저장
		System.out.println("==========================");
		long sum = 0L;
		for(int i=1;i<=10000000;i++) { //10000000번 반복 for문
			sum = sum + i;
		}
		
		System.out.println(sum);
		System.out.println("==========================");
		long time2 = System.nanoTime(); //현재시간을 나노초로 변환하여 저장
		long time_m2 = System.currentTimeMillis(); //현재시간을 밀리초로 변환하여 저장
		
		System.out.println("for문 실행에 걸린 나노초:"+(time2 - time1)); 
		//위 for문을 실행시키는데 걸린 시간(나노초 단위)
		System.out.println("for문 실행에 걸린 밀리초:"+(time_m2 - time_m1)); 
		//위 for문을 실행시키는데 걸린 시간(밀리초 단뒤)
		
		
		
	}

}
