// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

// Пункты реализовать в методе main
// *Пункты реализовать в разных методах

// int i = new Random().nextInt(k); //это кидалка случайных чисел!)

import java.util.Random;


public class Seminar1 {
    
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int j = 0; j < arr.length; j++) {
            if (j > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[j]);
        }
        System.out.println("]");
    }
            
    public static int binar (int i) {
        int count = 0;
        if (i == 0) {
            return 0;
        }
        while (i > 0) {
            i = i >> 1; 
            count++;
        }
        return count - 1; 
    }
    
    
    public static void multiples(int n, int i) {
        short count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                count++;
            }
        }
        System.out.println("длина массива m1 =  " + count);
        int[] m1 = new int[count];
        count = 0;

        // заполнение массива m1
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1[count++] = j;
            }
        }
        // System.out.println("array m1: ");
        // printArray(m1);
    }

    public static void nonMultiples(int n, int i) {
        short temp = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n != 0) {
                temp++;
            }
        }
        System.out.println("длина массива m2 =  " + temp);
        int[] m2 = new int[temp];
        temp = 0;

        // заполнение массива m2
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n != 0) {
                m2[temp++] = j;
            }
        }
        // System.out.println("array m2: ");
        // printArray(m2);
    }

    public static void main(String[] args) {
        int i = new Random().nextInt(2000);
        //int i = 1024;        
        System.out.println("random number: " + i);        
        int n = binar(i);
        System.out.println("Номер старшего значения бита n =  " + n);
        multiples(n, i);
        nonMultiples(n, i);                
    }
     
}