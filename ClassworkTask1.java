package by.http.lesson4;

public class ClassworkTask1 {
	
	public static void main(String[] args) {
		
		int myCollect[] = { 7, 50, 13, 1, 15, 88, 99, 5 };
		int max = myCollect[0];
		int min = myCollect[0];
		int minNumber = 0;
		int maxNumber = 0;
		
		//������� ���� ��������
		//������ ������� = 8
		for(int i = 0; i < myCollect.length; i++){
			if (max < myCollect[i]) {
				max = myCollect[i];
				//i - ��� ������, ���������� maxNumber ��������� �������� ������� ������������� �����
				maxNumber = i;
				
			}
			
		}
		
		System.out.println("Max = " + max);
		
		//������� ��� ��������
		for(int i = 0; i < myCollect.length; i++){
			if (min > myCollect[i]) {
				min = myCollect[i];
				//i - ��� ������, ���������� minNumber ��������� �������� ������� ������������ �����
				minNumber = i;
				
			}
			
		}
		
		System.out.println("Min = " + min);
		
		//������� ����������� ��������� ����� � �������
		for (int i = 0; i < myCollect.length; i++) {
			System.out.print(myCollect[i] + " ");
			
		}
		
		//�������� ���������� buff ��������� �������� ������������ �����, ����� ��� �� ����������
		int buff = myCollect[minNumber];
		//����������� ���������� ������������
		myCollect[minNumber] = myCollect[maxNumber];
		//������������ ��������� �������� ���������� buff, �.�. ���������� �����������
		myCollect[maxNumber] = buff;
		
		System.out.println(" ");
		
		//������� ��������� ����� � ������� ����� ����, ��� �������� ���� � ��� �������
		for (int i = 0; i < myCollect.length; i++) {
			System.out.print(myCollect[i] + " ");
			
		}
		
	}
	
}