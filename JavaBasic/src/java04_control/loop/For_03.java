package java04_control.loop;

public class For_03 {
	public static void main(String[] args) {
		
		for (int num = 10; num>=1; num--) {
			System.out.println(num);
		}
		
		// num������ 10���� �����ؼ� 1���� ũ�ų� ���� ���� 1�� ����
		// �ݺ�Ƚ�� : 10��
		// �ݺ����� : 10 ~ 1
		System.out.println("------------------");
		
		for(int i=0; i<10; i+=2) {
			System.out.println(i);
		}
		
		// i ������ 0���� 10���� ���� ���� 2�� ����
		// �ݺ�Ƚ�� : 5��
		// �ݺ����� : 0 2 4 6 8
	}

}
