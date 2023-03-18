package Homework4;

import java.util.LinkedList;
import java.util.Arrays;

/*
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
 */

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list_ll = new LinkedList<>(Arrays.asList(3,4,5,7,8,9,34,3,1,2,3,4,5,7,67));
        System.out.println(list_ll);
        list_ll = ListReverse(list_ll);
        System.out.println(list_ll);
    }

    public static LinkedList<Integer> ListReverse(LinkedList<Integer> list) {
        LinkedList<Integer> list_rev = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            list_rev.add(list.get(list.size()-i-1));
        }
        return list_rev;
    }
}
