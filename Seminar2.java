//  1. Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

//  2. Дана json-строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

//  3. *Сравнить время выполнения замены символа "а" на "А" любой строки содержащей >1000 символов средствами String и StringBuilder.
//  4. *Дана строка: ".3 + 1.56 = " подсчитать результат и добавить к строке.

public class Seminar2 {
    public static void main(String[] args) {
        // 1. Задание
        System.out.println("Задание 1: ");

        String str = "select * from students where ";
        String inpuString = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":null}";
        StringBuilder builder = new StringBuilder(0);

        String[] changedString = inpuString.replaceAll("[{}\"]", "").split(", ");
        for (String i : changedString) {
            String[] keyValue = i.split(":");
            String key = keyValue[0].trim();
            String value = keyValue[1].trim();

            if (!value.equalsIgnoreCase("null")) {
                if (builder.length() > 0) {
                    builder.append(" ; ");
                }
                builder.append(key).append(" = ").append(value);
            }
        }

        str += ": " + builder.toString();
        System.out.println(str);

        // 2. Задание
        System.out.println("Задание 2: ");
        changed();

    }

    public static void changed() {

        String str = "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}";
        StringBuilder sBuild = new StringBuilder();

        String[] arrString = str.replaceAll("[{}\"]", "").split(",");

        for (String i : arrString) {
            String[] changed = i.split(":");
            if (changed[0].equals("фамилия")) {
                sBuild.append("Студент ").append(changed[1]).append(" ");
            } else if (changed[0].equals("оценка")) {
                sBuild.append("получил ").append(changed[1]).append(" ");
            } else if (changed[0].equals("предмет")) {
                sBuild.append("по предмету ").append(changed[1]).append(".\n");
            }
        }
        System.out.println(sBuild.toString());
    }

}
