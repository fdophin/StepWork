
package stepwork;

import static java.lang.System.out;

public class stepwork15 {
    public static void main(String args[]) { 
  // Новый масив с длиной 10 int[] x = {10};
  /*      int ar[] = new int [5];
   ar [0] = 10;  // обращение к элементу ar + 0 * 4
   ar [1] = 15;  //ar + 1 * 4
   
   int temp = ar [0]; // запись в переменную
    
   System.out.println(ar [1]);*/
        
     /*   int month_days[];
		month_days = new int[12];

		month_days[0] = 31;
		System.out.println(month_days[0]);
		System.out.println(month_days[1]);

		// ////////////////////////////////////////

		int size = 15;
		int array[] = new int[size];
		// System.out.println(array[20]); // ArrayIndexOutOfBoundsException!

		// ////////////////////////////////////////

		int ar[], br[], cr[];
		int[] dr, er, fr;

		// ////////////////////////////////////////

		// int mass[] = new int[10];
		// int[] mass = new int[10];*/
        
        int size = 10;
		int[] mass = new int[size];

		// заполнение
		for (int i = 0; i < size; i++)
			mass[i] = i + 1; //заполнение масива щт 0 до 9

		// показать в обратном порядке
		for (int i = size - 1; i >= 0; i--)
			out.print(mass[i] + "  ");
		out.println();

		// показать только чётные элементы
		for (int i = 0; i < size; i++)
			if (mass[i] % 2 == 0)
				out.print(mass[i] + "  ");
		out.println();

		// поиск минимального значения
		int min = mass[0];
		for (int i = 1; i < mass.length; i++)
			if (mass[i] < min)
				min = mass[i];
		out.println(min);

		// поиск максимального значения
		int max = mass[0];
		for (int i = 1; i < mass.length; i++)
			if (mass[i] > min)
				max = mass[i];
		out.println(max);

		// вычисление среднего арифметического
		double avg = 0;
		double sum = 0;
		for (int i = 0; i < mass.length; i++)
			sum += mass[i];
		avg = sum / mass.length;
		out.println(avg);

		// инверсия массива (перевернуть значения местами - первый с последним и
		// тд)
		for (int i = 0, j = mass.length - 1; i < mass.length / 2; i++, j--) {
			int temp = mass[i];
			mass[i] = mass[j];
			mass[j] = temp;
		}
		for (int i = 0; i < size; i++)
			out.print(mass[i] + "  ");
		out.println();

		// сравнение массивов
		int equal = 0;
		int[] ar = new int[size];
		for (int i = 0; i < size; i++) {
			ar[i] = (int) (Math.random() * 10 + 1);
			out.print(ar[i] + "  ");
			if (ar[i] == mass[i])
				equal++;
		}
		out.println();
		if (equal == mass.length)
			out.println("arrays are equal!");
		else
			out.println("arrays are not equal!");

		// массив | массив, массив & массив, массив ^ массив
		for (int i = 0; i < size; i++) {
			out.println(mass[i] + " | " + ar[i] + " = " + (mass[i] | ar[i]));
			out.println(mass[i] + " & " + ar[i] + " = " + (mass[i] & ar[i]));
			out.println(mass[i] + " ^ " + ar[i] + " = " + (mass[i] ^ ar[i]));
		}

		// сортировка по возрастанию
		QuickSort(ar, 0, size - 1);
		for (int i = 0; i < size; i++)
			out.print(ar[i] + "  ");
		out.println();
	}

	public static void QuickSort(int[] mass, int start, int end) {
		int L = start, R = end;
		int M = mass[(start + end) / 2];
		do {
			while (mass[L] < M)
				L++;
			while (mass[R] > M)
				R--;

			if (L <= R) {
				int temp = mass[L];
				mass[L] = mass[R];
				mass[R] = temp;
				L++;
				R--;
			}

		} while (L <= R);

		if (start < R)
			QuickSort(mass, start, R);
		if (L < end)
			QuickSort(mass, L, end);

    
    
}
}
