package java01_variables;

public class Variables_05 {
	public static void main(String[] args) {
		
		
		
		@SuppressWarnings("unused") //코드에 warning(노란줄) 안 보이도록 설정
		// 학생의 나이
//		int student age; 에러, 띄어쓰기 금지
		int student_age; // snake case, 뱀 표기법
		int studentAge; // camel case, 낙타등 표기법
		// 자바에서는 낙타등표기법(camel case ) 추천
		//------------------------------------------------------------------------
		//int 1stNumber; 에러, 숫자로 시작할 수 없음
		
		int firstNumber;
		//------------------------------------------------------------------------
		// int int; 에러, 예약어(키워드)는 사용 못 함
		//------------------------------------------------------------------------
		// 의미없는 변수명 사용하지 않기(int a;)
		// 간단한 의미라도 가지도록 변수명 사용할 것!
		int num1;
		int num2;
		//------------------------------------------------------------------------
		double 넓이;
		넓이 = 234.567;
		System.out.println("넓이 : " + 넓이);
		//g한글로 변수명 설정은 가능하나 절대 사용하지 말 것.
	}

}
