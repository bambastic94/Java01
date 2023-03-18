package Homework4;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * В калькулятор добавьте возможность отменить последнюю операцию.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        LinkedList<Integer> calc = new LinkedList<>();
        Integer num1 = null;
        Integer res = null;
        int count = -1;
        while (true) {
            if (num1 == null) {
                System.out.print("Введите число : ");
                String num1_s = iScanner.next();
                if (num1_s.equals("stop")) {
                    break;
                }
                num1 = Integer.parseInt(num1_s);
            }
            if (res != null){
                num1 = res;
            }

            System.out.print("Введите знак : ");
            String sign = iScanner.next();
            if (sign.equals("stop")) {
                break;
            } 
            while (sign.equals("Cancel")) {
                count --;
                num1 = calc.get(count);
                calc.remove(calc.size() - 1);
                System.out.println(num1);
                System.out.print("Введите знак : ");
                sign = iScanner.next();
                if (sign.equals("stop")) {
                  break;
                  }
            }

            System.out.print("Введите число : ");
            String num2_s = iScanner.next();
            if (num2_s.equals("stop")) {
                break;
            } 
            int num2 = Integer.parseInt(num2_s);
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
            calc.add(res);
            count ++;
            System.out.println(res);
        }
        iScanner.close();
    }

}
