package Homework3;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Пусть дан произвольный список целых чисел, удалить из него чётные числа
 */
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 5, 6, 7, 26, 35, 84, 1, 65, 18, 29, 54, 33));
        System.out.println(nums);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                nums.remove(i);
            }
        }
        System.out.println(nums);
    }
}
