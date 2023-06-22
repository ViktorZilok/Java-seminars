import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class Seminar4 {
    public static void main(String[] args) {

        ArrayList<String> people = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        System.out.print("how many people: ");
        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("secondname, name, surname: ");
            String name = console.nextLine();
            System.out.println("age, gender: ");
            String age = console.nextLine();
            people.add(name + " " + age);
            // people.add(age);
        }
        System.out.println(people);
        console.close();
        // вывод в формате Фамилия И. О., возраст, пол - Иванов И. И., 27, муж.
        for (int i = 0; i < people.size(); i++) {
            System.out.println();
            String[] arr = people.get(i).split(" ");
            System.out.println(arr[0] + " " + arr[1].toUpperCase().charAt(0) + "." +
                    arr[2].toUpperCase().charAt(0) + " " + arr[3]);
        }
        // добавить возможность выхода или вывода списка отсортированного по возрасту
        people.sort(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1.split(" ")[3]) - Integer.parseInt(o2.split(" ")[3]);
            }
        });
        for (

                int i = 0; i < people.size(); i++) {
            System.out.println();
            String[] arr = people.get(i).split(" ");
            System.out.println(arr[0] + " " + arr[1].toUpperCase().charAt(0) + "." +
                    arr[2].toUpperCase().charAt(0) + " " + arr[3]);
        }
    }
}
