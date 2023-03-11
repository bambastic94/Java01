package Homework1;

/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
 */
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число : ");
        Integer num = iScanner.nextInt();
        iScanner.close();
        int temp = 0;

        for (int i = 0; i <= num; i++) {
            temp = temp + i;
        }
        System.out.println(temp);
        temp = 1;

        for (int i = 1; i <= num; i++) {
            temp = temp * i;
        }
        System.out.println(temp);
    }
    
}