package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_02 {
	public static void main(String[] args) {
		// 학생 정보 관리 프로그램
		// 이름, 나이, 성별, 국어, 영어, 수학
		//6가지 정보 저장할 수 있는 변수를 만들고 총점과 평균을 포함한 결과를 출력
		
//		String name;
//		int age;
//	    char gender;
//		int Korea;
//		int English;
//		int Mathmatics;
//		
//		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
//		System.out.print("이름");
//		name = sc.nextLine();
//		
//		System.out.print("나이");
//		age = sc.nextInt();
//		
//		System.out.print("성별");
//	char gender = sc.nextLine().charAt(0);
//		
//		System.out.print("국어");
//		Korea = sc.nextInt();
//		
//		System.out.println("영어");
//		English = sc.nextInt();
//		
//		System.out.println("수학");
//		Mathmatics = sc.nextInt();
//		
//		System.out.println("총점");
//		System.out.println(Korea + English + Mathmatics);
//		
//		System.out.println("평균");
//		System.out.println(average);
		
		
//		
		// 데이터 타입의 기본값
//		String name = null; // 참조값 기본 데이터 null
//		int age = 0;  // 정수값 기본 데이터 0
//		double average = 0.0; // 실수값 기본 데이터 0.0
//		boolean isEmpty = false; //논리값 기본 데이터 false
//		char gender = '\0'; // 문자값 기본 데이터 '\0' (널문자, null문자)
		//--------------------------------------------------------------------------
		
		// 이름 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("Input name : ");
		String name = sc.nextLine();
		
//		System.out.println("[TEST] name : " + name);
		
		
		// 나이 입력
		System.out.print("Input Age : ");
		int age = sc.nextInt();
//		System.out.println("[TEST] age : " + age);
		
		sc.nextLine(); //입력 버퍼 지우기
		
		// 성별 입력
		System.out.print("Input Gender : ");
		char gender = sc.nextLine().charAt(0);
		
//		System.out.println("[TEST] gender : " + gender);
		
		// 점수 입력 - 국어, 영어, 수학
		
		System.out.print("Input Korean : ");
		int kor = sc.nextInt();
		
		System.out.print("Input Enlglish : ");
		int eng = sc.nextInt();
		
		System.out.print("Input Math : ");
		int math = sc.nextInt();
		
//		System.out.print("[TEST] 점수 : " + kor + "," + eng + "," + math);
		
		//--------------------------------------------------------------------
		
		// 총점 계산하기
		int sum = kor + eng + math;
		
		// 평균 계산하기
		double avg = sum / (double)3;
//		System.out.println("[TEST] sum : " + sum);
//		System.out.println("[TEST] avg : " + avg);
		
		System.out.println();
		System.out.println("--- 출력 ---");    //\t  -> tap키 누른것 처럼 들여쓰기
		
		System.out.println("이름\t나이\t성별\t국어\t영어\t수학\t총점\t평균");
		
		System.out.print(name + "\t");
		System.out.print(age + "\t");
		System.out.print(gender + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(math + "\t");
		System.out.print(sum + "\t");
		
//		System.out.println(avg + "\t");
		System.out.printf("%.2f", avg); //소수점 둘째자리까지 출력
		
	}

}
