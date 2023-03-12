package Homework2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/*
 * Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), результат после каждой итерации запишите в лог-файл.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[] {5,6,3,8,1,4,7,2,6,8,4};
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    System.out.println(Arrays.toString(arr));
                    String text = Arrays.toString(arr);
                    try {
                        FileWriter writer = new FileWriter("log1.txt", true);
                        writer.write(text + "\n");
                        writer.close();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        }
    }
}
