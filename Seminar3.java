// Пусть дан произвольный список из 100 целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение
import java.util.*;


public class Seminar3 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        
        //Создаем ArrayList
        for (int i = 0; i < 10; i++) {
        arr.add(new Random().nextInt(10));
        }
        System.out.println(arr);

        //Находим среднее значение списка
         int sum = 0;
        int len = arr.size();
        int res = 0;
        for (Integer i : arr) {
            sum = sum + arr.get(i);
        }
        res = sum / len;
        System.out.println(res);

        //Находим нечетные элементы списка
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                arr.remove(i);
                i--;
            }
        }
        System.out.println(arr);

        //Находим минимальное и максимальное значения
        // System.out.println(Collections.max(arr));
        // System.out.println(Collections.min(arr));
        int min = arr.get(0);
        int max = arr.get(0);
        for (Integer i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println(min);
        System.out.println(max);   



        

    }

}

