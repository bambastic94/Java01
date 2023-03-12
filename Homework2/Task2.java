package Homework2;


import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

/*
 * Дана строка (получение через обычный текстовый файл!!!)

"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"

Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */
public class Task2 {
    public static void main(String[] args) {
        String result = fileRead("students.txt");

        result = result.replaceAll("\"", " ");
        result = result.replaceAll(":", "");
        result = result.replaceAll(",", "");
        result = result.replaceAll("  ", " ");
        

        String[] arr = result.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        StringBuilder report = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("фамилия")) {
                report.append("Студент " + arr[i + 1] + " ");
            } else if (arr[i].equals("оценка")) {
                report.append("получил " + arr[i + 1] + " ");
            } else if (arr[i].equals("предмет")) {
                report.append("по предмету " + arr[i + 1] + "\n");
            }
        }
        System.out.println(report);
    }

    static String fileRead(String path) {
        String result = new String();
        File file = new File(path);
        try (FileReader fr = new FileReader(file)) { 
            char[] chars = new char[(int) file.length()];
            fr.read(chars);

            result = new String(chars);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("А тут ошибка!");
        }
        return result;
    }

    
}
// В итоге задание получилось, но мне непонятны несколько вещей:
// 1. В методе fileRead, когда информация из файла попадает в char, то тогда первым элементом появляется пустой элемент,
// впоследствии он становится вопросом(?). Почему так и как с этим боротся?
// 2. Пока я не поменял replaceAll, массив chars очень странно выводился - по идее в нём 12 элементов, а он на
// char.lenght говорил что их 11, при этом если вывести chars в терминал то были все элементы на месте(строка 33),
// но я решил проверить поэлементно и элемент "фамилия"(chars[6], по идее) отсутствовал. Совсем не понял почему так