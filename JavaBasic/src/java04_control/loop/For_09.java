package java04_control.loop;

public class For_09 {
	public static void main(String[] args) {
		
		// for문 중첩, 2중 for문
		// 바깥쪽 반복문의 반복 횟수, 구간에 맞춰 안쪽 반복문의 반복 횟수, 구간 생각하기
		//-----------------------------------------------------------------------------
		
		for(int i=0; i<3; i++) { //i, 0~2, 3번
			for(int j=0; j<3; j++) { //j, 0~2, 3번
				System.out.println("i:" + i + ", j:" + j); //9번 실행
			}
		}
		System.out.println("-----------------");
	}

}
