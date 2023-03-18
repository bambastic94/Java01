package Homework4;

import java.util.LinkedList;

/*
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди,
 * dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 */
public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        enqueue(1,list);
        enqueue(2,list);
        enqueue(3,list);
        enqueue(4,list);
        enqueue(5,list);
        System.out.println(dequeue(list));
        System.out.println(list);
        System.out.println(first(list));
        System.out.println(list);
    }

    public static void enqueue(Integer num, LinkedList<Integer> list) {
        list.add(num);
        System.out.println(list);
    }

    public static Integer dequeue(LinkedList<Integer> list) {
        int num = list.get(0);
        list.remove(0);
        return num;
    }

    public static Integer first(LinkedList<Integer> list) {
        int num = list.get(0);
        return num;
    }
}
