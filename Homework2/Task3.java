package Homework2;
import java.io.FileWriter;
/*
 * К калькулятору из предыдущего дз добавить логирование.
 */
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число : ");
        Integer num1 = iScanner.nextInt();
        System.out.print("Введите знак : ");
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
        String text = num1 + " " + sign + " " + num2 + " " + "=" + " " + res;
        System.out.printf("%d %s %d = %d", num1, sign, num2, res);
            try {
                FileWriter writer = new FileWriter("log3.txt", true);
                writer.write(text + "\n");
                writer.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
    }
    
}