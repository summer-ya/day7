package java04_control.loop;

public class For_08 {
	public static void main(String[] args) {
		
		// ��� ��ø���� ����ϱ�
		// for���� if�� ��ø
		
		for(int i=0; i<10; i++) { //i, 0~9, 10�� �ݺ�
			if(i%2==0 ) { //¦���� ���
				System.out.println("¦�� : " + i);
			}
		}
		
		System.out.println("--------------------");
		
		for(int i=0; i<10; i+=2) { //i, 0 2 4 6 8 , 5�� �ݺ�
			System.out.println("¦�� : " + i);
		}
	}

}
