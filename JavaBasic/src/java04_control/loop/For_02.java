package java04_control.loop;

public class For_02 {
	public static void main(String[] args) {
		
		// 반복문에서는 i 변수를 많이 사용한다
		// **iterate의 첫 글자를 사용하는 것
		
		for(int i = 0; i<10; i++) { //여기서 i는 for문 안에서만 작동
			System.out.println(i);
		}
		
		// i변수가 0부터 10보다 작은 동안에 1씩 증가하면서 반복한다
		// 반복횟수 : 10번 
		// 반복구간 : 0 ~ 9
		System.out.println("------------------------");
		
		
		int i; // main local에 만들어진 메소드 위에 for문의 i와 분리되어있음
		
		// for(int i = 0; i<11; i++) { <-오류남
		 for ( i =0; i<11; i++) { //<- int 빼고 쓰기
			System.out.println(i);
		}
	    System.out.println("------------------------");
	    
	    System.out.println("반복문이 종료된 이후의 i변수 : " + i);
	}
}
