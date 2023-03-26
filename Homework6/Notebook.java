package Homework6;

import java.util.HashMap;
import java.util.Map;

public class Notebook extends Option {

    public Notebook(int ramSize, int driveSize, String osType, String color) {
        super(ramSize, driveSize, osType, color);
    }
    
    public static Map<Integer, Notebook> listOfNotes() {
    
        Map<Integer, Notebook> notes = new HashMap<>();
        Notebook note1 = new Notebook(1, 128, "Win 10", "black");
        Notebook note2 = new Notebook(2, 256, "Win 10", "grey");
        Notebook note3 = new Notebook(2, 256, "Win 11", "white");
        Notebook note4 = new Notebook(4, 256, "Win 11", "grey");
        Notebook note5 = new Notebook(4, 512, "Win 11", "black");
        Notebook note6 = new Notebook(8, 512, "Win 11", "red");
        Notebook note7 = new Notebook(8, 1024, "Win 11", "black");
        Notebook note8 = new Notebook(16, 1024, "Linux", "red");
        notes.put(1, note1);
        notes.put(2, note2);
        notes.put(3, note3);
        notes.put(4, note4);
        notes.put(5, note5);
        notes.put(6, note6);
        notes.put(7, note7);
        notes.put(8, note8);
        System.out.println("Список доступных моделей ноутбуков (ОЗУ, объём SSD, операционная система, цвет корпуса) ");
        System.out.println(notes);
        return notes;
    }

    @Override
    public String toString() {
        return (" ramSize \t" + ramSize + " ГБ \t" + " | driveSize \t" + driveSize + " ГБ " + " | osType \t" + osType + " | color \t" + color + "\n");
    }
}
