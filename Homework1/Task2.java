package Homework1;
/*
 * Вывести все простые числа от 1 до 1000
 */
public class Task2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0 & count <=2) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.printf("%d ", i);
            }
            count = 0;
        }
    }
}
