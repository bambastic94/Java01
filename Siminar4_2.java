import java.util.LinkedList;
import java.util.Scanner;

/*
 * Реализовать консольное приложение, которое:
 * Принимает от пользователя строку вида
 * text
 * Нужно сохранить текст в связный список.
 * Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */
public class Siminar4_2 {
    public static void main(String[] args) {
        Scanner iscan = new Scanner(System.in);
        LinkedList<String> llist = new LinkedList<>();
        while(true) {
            String text = iscan.nextLine();
            if (text.equals("stop")) {
                break;
            } 
            if (text.contains("print~")) {
                String[] temp = text.split("~");
                int a = Integer.parseInt(temp[1]);
                llist.remove(a);
            } else if (text.contains("print") & !(text.contains("print~"))) {
                System.out.println(llist);
            } else {
                llist.add(text);
            }
                 
        }
        
    }
}
