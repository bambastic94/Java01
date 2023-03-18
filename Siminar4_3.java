import java.util.Scanner;
import java.util.Stack;

/*
 Реализовать консольное приложение, которое:
 * 1. Принимает от пользователя и запоминает строки.
 * 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
*/

public class Siminar4_3 {
    public static void main(String[] args) {
        Scanner iscan = new Scanner(System.in);
        Stack<String> llist = new Stack<>();
        while(true) {
            String text = iscan.nextLine();
            if (text.equals("stop")) {
                break;
            } 
            if (text.contains("print")) {
                while (!llist.isEmpty()) {
                    System.out.println(llist.pop());
                }
//                int count = llist.size();
//                for (int i = 0; i < count; i++) {
//                    System.out.println(llist.pop());
//                }
            } else {
                llist.push(text);
            }
                 
        }
    }
}
