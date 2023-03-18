import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
 * Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке.
 */

public class Siminar3_2 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>(Arrays.asList("Земля","Юпитер", "Венера","Юпитер", "Марс", "Юпитер", "Плутон", "Венера", "Земля", "Плутон", "Земля"));
        planets.sort(Comparator.naturalOrder());
        System.out.println(planets);
        int count = 1;
        for (int i = 0; i < (planets.size() - 1); i++) {
            if (planets.get(i).equals(planets.get(i + 1)) ) {
                count ++;
            } else {
                System.out.println(planets.get(i) + " " + count);
                count = 1;
            }
            if ((i == (planets.size() - 2))) {
                i ++;
                System.out.println(planets.get(i) + " " + count);
            }
        }
    }
}
