package java04_control.loop;

public class For_09 {
	public static void main(String[] args) {
		
		// for�� ��ø, 2�� for��
		// �ٱ��� �ݺ����� �ݺ� Ƚ��, ������ ���� ���� �ݺ����� �ݺ� Ƚ��, ���� �����ϱ�
		//-----------------------------------------------------------------------------
		
		for(int i=0; i<3; i++) { //i, 0~2, 3��
			for(int j=0; j<3; j++) { //j, 0~2, 3��
				System.out.println("i:" + i + ", j:" + j); //9�� ����
			}
		}
		System.out.println("-----------------");
	}

}
