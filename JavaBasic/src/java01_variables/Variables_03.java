package java01_variables;

//자동완성 단축키 : ctrl + space -> Enter

public class Variables_03 {
	public static void main(String[] args) {
		
		int data;
		// -> 변수를 선언하면 쓰레기값이 저장되어있다
		
		
		//변수 대입(초기화)
		data = 123;
		
		// sysout 쓰고 자동완성
		System.out.println( data );
		//The local variable data may not have been initialized 에러 -> 변수값이 초기화 안되어있음
	
	
		int data2 = 456; //선언과 동시에 초기화
		// -> 쓰레기값이 들어가지 않고 곧바로 초기화된다
	//[자료형][변수이름]=[데이터]
		
		System.out.println( data2);
	
	
	
	
	}

}
