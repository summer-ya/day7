//주석, Comment
// 소스코드에 대한 설명을 적을 때 사용
// 자바 프로그램에 영향을 주지 않음
//()괄호 {]중괄호 []대괄호

//		들여쓰기(Tab) <->내어쓰기(shift+Tab)

// 패키지 선언
//	test 라는 패키지에 포함된 소스코드라는 것을 알린다
//	프로그램을 구성하고 있는 코드들을 모아놓는 폴더(꾸러미)
// 비슷한 기능, 목적이 같은 코드들을 구현할 때 같은 패키지에 모아놓는다

// 자바 프로젝트에는 반드시 1개 이상의 패키지로 구성되어야함
package test;	//패키지 테스트


// 클래스 정의
// 클래스, class : 자바 프로그램을 구성하는 가장 기본적인 요소(단위)
public class Test {	//퍼블릭 클래스 테스트 Test
	
	
	//메인 메소드 정의(Main Method)
	//	메인 메소드 : 자바 프로그램의 시작점 - 프로그램이 시작되는 위치
	//퍼블릭 스태틱 보이드 메인 (스트링 배열 args)
	public static void main(String [] args) {
		
		//시스템 점 아웃 점 프린트엘엔 or 프린트라인
		// 콘솔창에 문장을 출력하는 수행 코드
		System.out.println("Hello Java");
		System.out.println("안녕하세요");
		System.out.println("반가워요");
		System.out.println("HIHIHIHI");
		System.out.println("AHAHAHAH");
		
	} // 메인메소드 정의 끝, 프로그램의 중단점(Terminate) - 프로그램이 종료되는 위치

} // Test 클래스 정의 끝
