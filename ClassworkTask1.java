package by.http.lesson4;

public class ClassworkTask1 {
	
	public static void main(String[] args) {
		
		int myCollect[] = { 7, 50, 13, 1, 15, 88, 99, 5 }; 
		int max = myCollect[0];
		int min = myCollect[0];
		int minNumber = 0;
		int maxNumber = 0;
		
		for(int i = 0; i < myCollect.length; i++){
			if (max < myCollect[i]) {
				max = myCollect[i];
				maxNumber = i;
				}
		} 
	    System.out.println("Max=" + max);
	    
	    for(int i = 0; i < myCollect.length; i++){
			if (min > myCollect[i]) {
				min = myCollect[i];
				minNumber = i;
				}
		} 
	    System.out.println("Min=" + min);
	    	    
	    for (int i = 0; i < myCollect.length; i++)
            System.out.print(myCollect[i] + " ");
	    
	    int buff = myCollect[minNumber];
	    myCollect[minNumber] = myCollect[maxNumber];
	    myCollect[maxNumber] = buff;
	    
	    System.out.println(" ");
	    	    
        for (int i = 0; i < myCollect.length; i++)
            System.out.print(myCollect[i] + " ");
	    
	}

}

/*Задача 1
В массиве найти минимальный и максимальный элементы, поменять их местами.
Решение
При поиске минимального и максимального элемента следует запоминать их индексы, а не значения. 
Поиск выполняется в цикле for, в котором с помощью условного оператора проверяется каждый элемент массива. 
Если он больше (или меньше), чем элемент по индексу, который сохранен в соответствующей переменной, 
то следует в эту переменную записать в индекс текущего элемента.
После цикла необходимо значение максимального элемента поставить в место массива, 
имеющее индекс минимального элемента. 
Чтобы не потерять при этом минимум, следует сохранить его в отдельной (буферной) переменной. 
Это значение потом будет присвоено по индексу максимального элемента.
Пример выполнения программы:
  0.92  1.00  0.42  0.40  0.48
  0.92  0.40  0.42  1.00  0.48*/
