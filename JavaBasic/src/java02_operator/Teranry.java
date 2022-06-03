package java02_operator;

public class Teranry {
	public static void main(String[] args) {
		
		//삼항 연산자 - 조건
		// 조건 연산자
		// 삼항조건연산자
		
		
		// 조건식이 true인지 false인지 판단하고 반환하는 결과값이 달라진다
		
		//			조건식  ?조건식이 참일 때 반환하는 값 : 조건식이 거짓일 때 반환하는 값
		
		//			** 조건식 - ture/false 로 판별할 수 있는 연산식
		//--------------------------------------------------------------------------------
		
		//int num1 = 30, num2 = 20;
		//int num1 = 20, num2 = 20;
		int num1 = 10, num2 = 20;
		
		System.out.println( num1 > num2 ? "num1이 크다" : "num1이 크지 않다");
		System.out.println( num1 > num2 ? "num1이 크다" : "num1이 작거나 같다");
		
		//-----------------------------------------------
		System.out.println("----------------------------");
		
		String resultText = num1 == num2 ? "같다" : "같지 않다";
		
		System.out.println(resultText);
		//-----------------------------------------------
		
		// 두 숫자 중에서 큰 값을 저장한다
		int result = num1 > num2 ? num1 : num2;
		System.out.println(result);
				
		
		
	}

}
