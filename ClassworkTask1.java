package by.http.lesson4;

public class ClassworkTask1 {
	
	public static void main(String[] args) {
		
		int myCollect[] = { 7, 50, 13, 1, 15, 88, 99, 5 };
		int max = myCollect[0];
		int min = myCollect[0];
		int minNumber = 0;
		int maxNumber = 0;
		
		//находим макс значение
		//длинна массива = 8
		for(int i = 0; i < myCollect.length; i++){
			if (max < myCollect[i]) {
				max = myCollect[i];
				//i - это индекс, переменная maxNumber принимает значение индекса максимального числа
				maxNumber = i;
				
			}
			
		}
		
		System.out.println("Max = " + max);
		
		//находим мин значение
		for(int i = 0; i < myCollect.length; i++){
			if (min > myCollect[i]) {
				min = myCollect[i];
				//i - это индекс, переменная minNumber принимает значение индекса минимального числа
				minNumber = i;
				
			}
			
		}
		
		System.out.println("Min = " + min);
		
		//выводим изначальное положение чисел в массиве
		for (int i = 0; i < myCollect.length; i++) {
			System.out.print(myCollect[i] + " ");
			
		}
		
		//буферная переменная buff принимает значение минимального числа, чтобы оно не потерялось
		int buff = myCollect[minNumber];
		//минимальное становится максимальным
		myCollect[minNumber] = myCollect[maxNumber];
		//максимальное принимает значение переменной buff, т.е. становится минимальным
		myCollect[maxNumber] = buff;
		
		System.out.println(" ");
		
		//выводим положение чисел в массиве после того, как поменяли макс и мин местами
		for (int i = 0; i < myCollect.length; i++) {
			System.out.print(myCollect[i] + " ");
			
		}
		
	}
	
}