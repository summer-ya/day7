package java04_control.loop;

public class For_04 {
	public static void main(String[] args) {
		
		// "Hello"를 7번 출력
		// 반복 횟수 : 7
		// 반복 구간 : 0 ~ 7
		
		// 초기식 : int i = 0;  (i변수 선언, 반복구간의 시작값으로 대입한다)
		// 조건식 : i <=6; or i<7;     (i변수 판별, 반복횟수보다 작은 조건으로 설정)
		// 증감식 : i++				   (1씩 증가)
		
		
		for(int i =0; i<=6; i++) {
			System.out.println("Hello");
		}
	}

}
