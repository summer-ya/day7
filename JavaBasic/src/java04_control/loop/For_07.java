package java04_control.loop;

public class For_07 {
	public static void main(String[] args) {
//		int sum = 10;
//
//		for(int i = 0; i<=14; i++) {
//		
//
//		}
//			System.out.println(sum);
//			
			
			
			
			//1. �ݺ�����
		    //   15�� ���� �ݺ�
			//2. ���� �����ؾ��ϴ� �۾�
			//	 ���ݾ� 2��� ����� (ù�� 10��)
			//	 ���ݾ��� �� �ݾ׿� ���ϱ�
			//--------------------------------------
			// ���� �ذῡ �ʿ��� ����
			// ��¥      int day
			// ���ݾ�    int money
			// �ѱݾ�    int account
			
			// �ݺ��� - 15�� ���� �ݺ�
			// �ݺ�Ƚ�� : 15��
			// �ݺ����� : 0 ~14
			// �ʱ�� : int day = 0;
			// ���ǽ� : day<15
			// ������ : day++
			//---------------------------------------------
			int day = 0;
			int money = 10; //���ݾ� (ù�� 10��) �ʱ�ȭ
			int account = 0; //�ѱݾ� �ʱ�ȭ
			
			// 15�� ���� �ݺ�
			for(day=0; day<15; day++) { // 15�� �ݺ��Ǵ� ��¥ �ݺ���
				
				// ���ݾ��� �� �ݾ׿� ���ϱ�
				account += money;
				
				// ���ݾ��� 2��� ����� (ù�� 10��)
				money *= 2;
				System.out.println((day+1) +"���� ����� : " + account + "��");
			}
			System.out.println();
			System.out.println("������ �� �ݾ� : " + account + "��");
		
	}

}
