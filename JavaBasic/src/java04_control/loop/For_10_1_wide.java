package java04_control.loop;

public class For_10_1_wide {
	public static void main(String[] args) {

		
		for(int dan = 2; dan<=9; dan++) {
			for(int i = 1; i<=9; i++) {
				System.out.print(dan + " x " + i + " = " + dan * i + "\t");
			}
			System.out.println(); 
		}
	}

}
