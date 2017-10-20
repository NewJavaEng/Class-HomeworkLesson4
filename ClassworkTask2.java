package by.http.lesson4;

public class ClassworkTask2 {
	
	public static void main(String[] args) {
		
		double myCollect[] = { 327, 381, 891, 918, 212, 848, 770, 363, 416, 736 };
		double max = myCollect[0];
		
		//выводи изначальный массив
		for (int i = 0; i < myCollect.length; i++)
			System.out.print(myCollect[i] + " ");
		
		System.out.println(" ");
		
		//находим максимальный элемент в массиве
		for(int i = 0; i < myCollect.length; i++){
			if (max < myCollect[i])
				max = myCollect[i];
			
		}
		
		System.out.println("Max = " + max);
		
		//делим все элементы массива на максимальное число
		//выводим результат
		for(int i = 0; i < myCollect.length; i++) {
			double res;
			res = myCollect[i] / max;
			System.out.println(res);
			
		}
		
	}
	
}

/*Задача 2
Все элементы массива поделить на значение наибольшего элемента этого массива.
Решение
Задача состоит из двух подзадач:
Поиск максимума.
Деление на него элементов массива.
Пример выполнения программы:
Исходный массив:  327 381 891 918 212 848 770 363 416 736
Максимум: 918
Частные:   0.36  0.42  0.97  1.00  0.23  0.92  0.84  0.40  0.45  0.80*/