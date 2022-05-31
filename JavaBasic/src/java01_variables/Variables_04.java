package java01_variables;

public class Variables_04 {
	public static void main(String[] args) {
		
		int data1;
		int data2;
		int data3;
		
		
		
		//---------------------------------------------------
		// 줄 복사 ctrl + alt +방향키(위/아래)
		//alt+방향키 줄 이동
		//ctrl+방향키 커서는 가만히 화면창만 위아래로 움직임
		//ctrl+D 한줄삭제
		// 한 단어 선택하기 : 더블클릭
		// 여러 단어 선택하기 : 더블클릭 + 드래그
		// 한 줄 선택 : 트리플클릭
		// 이클립스 단축키 목록 불러오기 : ctrl + shift + l
		// 이모지 단축키 : win + .
		//---------------------------------------------------
		
		
		
		
		
		//같은 자료형의 변수를 여러 개 만들 때는 ,(콤마)로 구분해서 선언 가능
		//선언과 동시에 초기화도 수행 가능
		int  data5=55, data6=77;
		
		
		//연결된 이름(ex.변수명) 한꺼번에 변경하는 단축키 : alt + shift + r(Refactor-Rename)
		double height; // 사람의 키
		
		height = 200.5;
		
		System.out.println("height 변수의 값은" +  height);
		System.out.println("height 변수의 값은 " + 200.5); // 변수의 값 활용(불러오기)
		System.out.println("height 변수의 값은 200.5"); // 하나의 문장으로 합치기
		// +기호: 문장 연결 기능
		
		//---------------------------------------------------
		
		char alpha;
		alpha = 'P';
		System.out.println("alpha : " + alpha);
		//---------------------------------------------------
		
		boolean isRight;
		isRight = true;
		System.out.println("올바른가? " + isRight);
		//---------------------------------------------------
		
		
	}

}
