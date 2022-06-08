package java04_control.loop;

public class For_07_1 {
	public static void main(String[] args) {
		
		// 초기식, 증감식에는 여러 개의 코드를 사용할 수 있다.
		// 각 코드는 콤마,로 구분해서 작성
		//----------------------------------------------------
			
			int account = 0; 
			
			for(int day=0, money=10; day<15; day++) { 
				//account변수는 포함 안하는 이유가 for문이 끝나면 account 변수가 사라지기 때문에
				// 최종 account금액이 사라짐 그래서 따로빼기
				
			
				account += money;
				
				money *= 2;
				
				
				
				// int account = 0;
				// for(int day=0, money=10; day<15; day++, account+=money, money*=2);
				//System.out.println("저축한 총 금액 : " + account + "원"); //완전 축약식
				
			}
			System.out.println("저축한 총 금액 : " + account + "원");
		
	}

}
