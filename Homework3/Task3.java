package Homework3;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.
 */
public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 5, 6, 7, 26, 35, 84, 5, 122, 18, 29, 54, 33));
        int min = nums.get(0);
        int max = nums.get(0);
        int mean = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (min < nums.get(i)) {
                min = nums.get(i);
            }
            if (max > nums.get(i)) {
                max = nums.get(i);
            }
            mean += nums.get(i);
        }
        mean = mean / nums.size();
        System.out.println("Минимальное - " + min + " Максимальное - " + max + " и среднее арифметическое - " + mean);
    }
}
