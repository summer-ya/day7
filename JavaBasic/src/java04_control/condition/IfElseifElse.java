package java04_control.condition;

import java.util.Scanner;

public class IfElseifElse {
	public static void main(String[] args) {
		
		
		
		// if ~ else if ~ else
		
//  if(조건식1) {
	//조건식 1이 참 일 때 수행하는 영역	
		
//	} else if (조건식2) {
	// 조건식 1이 거짓이고, 조건식 2가 참 일 때 수행하는 영역
		
//	} else if (조건식3) {
		// 조건식 1이 거짓이고 조건식2도 거짓이고 조건식3이 참일 때 수행하는 영역
		
//	} else {	
		// 조건식 1,2,3, 모두 거짓일 때 수행하는 영역
//	}
	// ** else if 구문은 작성할 수 있는 구문 개수에 제한없음
	// ** else if, else 구문은 필수가 아니다
	// ** else만 사용하는 구문은 if문 전체의 마지막으로만 1개 올 수 있음
	// ** if문 없이 단독으로 else if, else만 사용할 수 없음
	//---------------------------------------------------------------------
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Input Number : ");
	int num = sc.nextInt();
	
	if (num == 10 ) {
		System.out.println("10입니다");
	} else if (num == 20 ) {
		System.out.println("20입니다");
	} else if (num == 30) {
		System.out.println("30입니다");
	}
		
	}
}
