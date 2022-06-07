package java04_control.condition;

public class If_02 {
	public static void main(String[] args) {
		
		
		int num = 10;
		
		if( num == 15 ) {
			System.out.println("HI");
		}
		System.out.println("HELLO");
		
		//-----------------------------
		
		// {}중괄호는 여러 개의 코드를 묶어주는 역할을 한다
		// 코드 실행 순서(흐름)에는 영향을 주지 않는다
		
		
		{
			System.out.println("Apple");
			System.out.println("Banana");
			System.out.println("Cherry");
		}
		System.out.println("------------------------");
		
		// 제어문은 해당 제어문 다음에 오는 코드 한 개 또는 {} 중괄호 한 블록에 영향을 준다
		
		if (false) 
			System.out.println("코드 111111"); //실행 안됨
			System.out.println("코드 222222"); // 실행됨
			System.out.println("------------------------");

			// 제어문에 영향을 받는 코드가 한 줄이어도 반드시 {}중괄호를 쓰도록 한다
		if (false) {
			System.out.println("코드 111111"); //실행 안됨
		}
			System.out.println("코드 222222"); // 실행됨
			
			
			
			System.out.println("------------------------");
			
			if (false); {
				System.out.println("HI"); 
				System.out.println("Hello");
				System.out.println("Hola");
			}
	}

}
