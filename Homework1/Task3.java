package Homework1;

/*
 * Реализовать простой калькулятор (+ - / *)
Ввод числа ->
Ввод знака ->
Ввод числа ->
 */

import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;
public class Task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число : ");
        Integer num1 = iScanner.nextInt();
        System.out.print("Введите число : ");
        String sign = iScanner.next();
        System.out.print("Введите число : ");
        Integer num2 = iScanner.nextInt();
        iScanner.close();
        int res = 0;
        switch (sign) {
            case ("+"):
                res = num1 + num2;
                break;
            case ("-"):
                res = num1 - num2;
                break;
            case ("/"):
                res = num1 / num2;
                break;
            case ("*"):
                res = num1 * num2;
                break;
        }
        System.out.printf("%d %s %d = %d", num1, sign, num2, res);
    }
    
}
