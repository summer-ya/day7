package java04_control.loop;

public class For_10 {
	public static void main(String[] args) {
		
		//           2~9�� ������
		//  1. �ٱ��� for�� : 2~9�� �ݺ�
		//     dan ����, 2~9, 8�� �ݺ�
		//  2. ���� for�� : �� �ܼ����� ������ �ݺ�
		//     i����, 1~9, 9��
		//----------------------------------------------
		
		
		for(int dan = 2; dan<=9; dan++) {
			for(int i = 1; i<=9; i++) {
				System.out.println(dan + " x " + i + " = " + dan * i);
			}
			System.out.println(); // �� ���� ��µǰ��� �ٹٲ�
		}
	}

}
