package java02_operator;

public class Unary_02 {
	public static void main(String[] args) {
		
		//단항연산자 - 증감
		
		// ++ : 증가연산자
		// -- : 감소연산자
		
		// 피연산자로 적용한 변수의 값을 1 증가(감소)시킨다
		//----------------------------------------------------------
		
		int num;
		
		num = 15; //변수를 15로 초기화
		
		System.out.println( num );
		System.out.println( num-- ); //감소연산, 후위 감소, 후치 감소
		System.out.println( num );
		
		System.out.println("---------------");
		
		num = 15; //변수를 15로 초기화
		
		System.out.println( num );
		System.out.println( --num ); //감소연산, 전위 감소, 전치 감소
		System.out.println( num );
		
		// ** 전위 증감연산자는 변수의 값을 활용 전에 변수의 값을 증감시킨다.
		// ** 후위 증감연산자는 변수의 값을 활용한 후에 변수의 값을 증감시킨다.
		
		System.out.println("---------------");
		
		num = 15;
		System.out.println( num );
		
		num = 13;
		
		System.out.println( num ++ -10 - ++num);
		//최종 출력결과는? -12
		//연산수행 후 num변수의 값? 15
		
		
		
		
		
	}

}
