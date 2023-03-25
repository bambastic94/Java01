package Homework5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
Добавить функции 1) Добавление номера
2) Вывод всего
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

        while (true) {
            System.out.println("Введите команду: 1 - Добавление номера, 2 - Вывод всего, 0 - Выход");
            int command = iScanner.nextInt();
            iScanner.nextLine();

            switch (command) {
                case 0:
                    iScanner.close();
                    System.exit(0);
                case 1:
                    System.out.println("Введите фамилию:");
                    String name = iScanner.nextLine();
                    System.out.println("Введите номер:");
                    String number = iScanner.nextLine();

                    if (phoneBook.containsKey(name)) {
                        ArrayList<String> numbers = phoneBook.get(name);
                        numbers.add(number);
                    }
                    else {
                        ArrayList<String> numbers = new ArrayList<>();
                        numbers.add(number);
                        phoneBook.put(name, numbers);
                    }
                    break;
                case 2:
                    System.out.println("Все контакты:");
                    for (String nameBook : phoneBook.keySet()) {
                        System.out.print(nameBook + ": ");
                        ArrayList<String> numbers = phoneBook.get(nameBook);
                        for (String numberName : numbers) {
                            System.out.print(numberName + ", ");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Повторите ввод");
                    break;
            }
        }

    }
}
