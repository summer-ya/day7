package java04_control.loop;

public class For_07_1 {
	public static void main(String[] args) {
		
		// �ʱ��, �����Ŀ��� ���� ���� �ڵ带 ����� �� �ִ�.
		// �� �ڵ�� �޸�,�� �����ؼ� �ۼ�
		//----------------------------------------------------
			
			int account = 0; 
			
			for(int day=0, money=10; day<15; day++) { 
				//account������ ���� ���ϴ� ������ for���� ������ account ������ ������� ������
				// ���� account�ݾ��� ����� �׷��� ���λ���
				
			
				account += money;
				
				money *= 2;
				
				
				
				// int account = 0;
				// for(int day=0, money=10; day<15; day++, account+=money, money*=2);
				//System.out.println("������ �� �ݾ� : " + account + "��"); //���� ����
				
			}
			System.out.println("������ �� �ݾ� : " + account + "��");
		
	}

}
