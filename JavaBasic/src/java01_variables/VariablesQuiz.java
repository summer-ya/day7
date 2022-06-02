package java01_variables;

public class VariablesQuiz {
	public static void main(String[] args) {
		String name = "Alice";
		
		int age = 99;
		
		char gender = '남';
				
		double height = 222.66;
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("키 : " + height);
		
		System.out.println("------------------------------------------------");
		
		System.out.println("이름 : " +name + ", 나이 : " + age + ", 성별 : " + gender + ", 키 : " + height);
		System.out.println("------------------------------------------------");
		
//		System.out.println("AAAAA");
//		System.out.println("BBBBB");
		
		System.out.print("AAAAA");
		System.out.println("BBBBB");
		//System.out.println(); - 주어진 데이터를 출력하고 줄바꿈(개행)한다
		//System.out.print(); - 주어진 데이터를 출력한다, 줄바꿈(개행)은 하지 않는다
		//System.out.println(); //줄바꿈 수행 코드
		//("------------------------------------------------");
		// \n : 줄바꿈 문자, 개행 문자
		System.out.println("Hi\nHELLO\nHOLA");
	}

}