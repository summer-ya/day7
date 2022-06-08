package java04_control.loop;

public class For_07 {
	public static void main(String[] args) {
//		int sum = 10;
//
//		for(int i = 0; i<=14; i++) {
//		
//
//		}
//			System.out.println(sum);
//			
			
			
			
			//1. 반복패턴
		    //   15일 동안 반복
			//2. 매일 수행해야하는 작업
			//	 예금액 2배로 만들기 (첫날 10원)
			//	 예금액을 총 금액에 더하기
			//--------------------------------------
			// 문제 해결에 필요한 변수
			// 날짜      int day
			// 예금액    int money
			// 총금액    int account
			
			// 반복문 - 15일 동안 반복
			// 반복횟수 : 15번
			// 반복구간 : 0 ~14
			// 초기식 : int day = 0;
			// 조건식 : day<15
			// 증감식 : day++
			//---------------------------------------------
			int day = 0;
			int money = 10; //예금액 (첫날 10원) 초기화
			int account = 0; //총금액 초기화
			
			// 15일 동안 반복
			for(day=0; day<15; day++) { // 15일 반복되는 날짜 반복문
				
				// 예금액을 총 금액에 더하기
				account += money;
				
				// 예금액을 2배로 만들기 (첫날 10원)
				money *= 2;
				System.out.println((day+1) +"일차 저축액 : " + account + "원");
			}
			System.out.println();
			System.out.println("저축한 총 금액 : " + account + "원");
		
	}

}
