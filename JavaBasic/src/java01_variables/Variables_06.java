package java01_variables;

public class Variables_06 {
	public static void main(String[] args) {
		
		System.out.println(8765); //int형 상수(constant 변함없는) 8765
		//--------------------------------------------------------------------
		
		// 변수
		int num ;
		num = 1234;
		System.out.println( num );
		//--------------------------------------------------------------------

		// 변수의 상수화
		// -> 이름있는 상수
		 int MAX, MAX2;
		MAX = 100;
		MAX2 = 200;
		System.out.println(MAX + MAX2);
		//--------------------------------------------------------------------

		// 총 학생 수
		final int studentTotalNumber = 30;
		//final int STUDENT_TOTAL_NUMBER = 36;
		
		System.out.println("학생" + studentTotalNumber + "명의 평균값");
		
		// 프로그램 실행 도중 함부로 값이 바뀌지 않도록 해줌
//		studentTotalNumber = 540;
		//평균계산
		double average = 1000 / studentTotalNumber;
		
		System.out.println("전체 평균" + average);
		
	}

}
