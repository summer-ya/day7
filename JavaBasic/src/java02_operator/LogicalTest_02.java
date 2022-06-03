package java02_operator;

public class LogicalTest_02 {
	public static void main(String[] args) {
		int a = 5, b = 6, c = 10;

		boolean res1;
		res1 = a<b || --a>c++;
		System.out.println("a="+a+",b="+b+",c="+c);
		//논리연산자의 단축연산 (Shortcut)
		// a<b가 true이므로 ||는 or 둘중에 하나만 참이어도 전체가 true임, 뒤의 조건은 계산할 필요X
		
		
		
		

		
		boolean res2;
		res2 = c<b++ && c-->++a; 
		System.out.println("a="+a+",b="+b+",c="+c);
		// && 은 둘다 true여야 true, c<b++은 false이므로 조건은 false
		
		// AND 연산은 왼쪽 피연산자가 false라면 오른쪽항의 연산을 하지 않는다
		// OR 연산은 왼쪽 피연산자가 true라면 오른쪽항의 연산을 하지 않는다
	}

}
