package java01_variables;

public class Variables_02 {
	
	public static void main(String[] args) {
		
		System.out.println( 4567 ); //int형, 정수형
	
		 // 자료형(int)변수 4B짜리 메모리공간이 만들어지고 a라는 이름이 붙여진 것
		int number; //int형 변수 선언(Declaration) 했다고 표현함
		// -> int형 데이터를 저장할 수 있는 메모리 공간이 만들어짐
		// -> 해당 변수 공간의 이름을 number로 지정한다.
		
		number = 13; // 13이라는 값을 number 변수공간에 대입(Assignment)
	//  변수명  데이터값  -> 오른쪽의 데이터값을 왼쪽 변수공간에 집어넣어 저장된다
	// 메모리공간
		
		
		number = 87; //87을 number에 대입(저장)
		// -> 기존에 저장되있던 13을 지우고 87을 저장한다
		
		
		System.out.println(number);
		// -> number변수에 저장된 값을 불러와서 출력한다
	}
	
}
