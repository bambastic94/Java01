import java.util.ArrayList;
import java.util.LinkedList;

public class Siminar4_1 {
    public static void main(String[] args) {
        ArrayList<Integer> arList = new ArrayList<>();
        LinkedList<Integer> llList = new LinkedList<>();
        long time_start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arList.add(0, i);
        }
        long time_stop = System.currentTimeMillis();
        long time_al = time_stop - time_start;
        System.out.println(time_al);
        time_start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            llList.add(i);
        }
        time_stop = System.currentTimeMillis();
        long time_ll = time_stop - time_start;
        System.out.println(time_ll);
    }
}
