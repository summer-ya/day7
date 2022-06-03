package java02_operator;

public class Binary_04 {
	public static void main(String[] args) {
		
		//이항 연산자 - 논리
		//     &&         ||         !
		//     AND        OR         NOT
		
		//     **  !(NOT) 연산자는 단항 연산자
		
		//     논리(boolean) 데이터의 관계를 따져서 결과를 반환한다
		
		// AND 연산은 피연산자가 모두 true일 때 전체 결과가 true
		// OR 연산은 피연산자가 둘 중 하나라도 true일 때 전체 결과가 true
		
		// NOT 연산은 피연산자의 논리를 부정한다(반대로 바꾼다)
		
		//   | (수직바, Vertical Bar) - shift + \
		//----------------------------------------------------------------
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("true&&flase : " + (b1&&b2)); //false
		System.out.println("true||false : " + (b1||b2)); //true
		System.out.println("-----------------------------------");
		
		int num = 77;
		
		System.out.println( num >= 1); //true 
		System.out.println( num <= 100); //true
		
		
		// num변수가 1보다 크거나 같다, 그리고, num변수가 100보다 작거나 같다
		//  -> num 변수는 1~100 사이의 값이다
		
		
		System.out.println( num >= 1 && num <= 100);
//		System.out.println( ((77 >= 1) && (77 <= 100))); //변수 활용
//		System.out.println( true && ( 77 <= 100)); //왼쪽항 >= 연산
//		System.out.println( true && true )); //왼쪽항 <= 연산
//		System.out.println( true ); // && 연산
		
		//---------------------------------------
		System.out.println("------------------------");
		System.out.println( !((num >= 1) && (num <=100)) );
//		System.out.println( !(num >= 1) !&& !(num <=100) );
		System.out.println( num < 1 || num > 100 );
		
		// ** !(논리부정) 연산자의 적용
		// 관계연산자는 반대 조건으로 치환된다
		
		
	}

}
