package java04_control.loop;

public class For_02 {
	public static void main(String[] args) {
		
		// �ݺ��������� i ������ ���� ����Ѵ�
		// **iterate�� ù ���ڸ� ����ϴ� ��
		
		for(int i = 0; i<10; i++) { //���⼭ i�� for�� �ȿ����� �۵�
			System.out.println(i);
		}
		
		// i������ 0���� 10���� ���� ���ȿ� 1�� �����ϸ鼭 �ݺ��Ѵ�
		// �ݺ�Ƚ�� : 10�� 
		// �ݺ����� : 0 ~ 9
		System.out.println("------------------------");
		
		
		int i; // main local�� ������� �޼ҵ� ���� for���� i�� �и��Ǿ�����
		
		// for(int i = 0; i<11; i++) { <-������
		 for ( i =0; i<11; i++) { //<- int ���� ����
			System.out.println(i);
		}
	    System.out.println("------------------------");
	    
	    System.out.println("�ݺ����� ����� ������ i���� : " + i);
	}
}
