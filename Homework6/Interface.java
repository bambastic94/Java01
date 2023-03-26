package Homework6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Interface{
    
    public static Map<Integer, String> userChoice() {      
        Map<Integer, String> print = new HashMap<>();
        print.put(1, " ОЗУ");
        print.put(2, " объём SSD");
        print.put(3, " операционная система");
        print.put(4, " цвет");
        
        Map<Integer, String> filtersOfUserMap = new HashMap<>();
        for (int i = 1; i < 5; i++) {
            Scanner sc1 = new Scanner(System.in);
            System.out.print(" при необходимости введите критерий фильтрации " + print.get(i) + "->  ");
            filtersOfUserMap.put(i, sc1.nextLine());
            System.out.println();
        }
        System.out.println("Вы выбрали следующие критерии " + filtersOfUserMap);
        return filtersOfUserMap;
    }

    public static Map<Integer, Notebook> filteredMap(Map<Integer, Notebook> listOfNotes, Map<Integer, String> userChoice) {
        Map<Integer, Notebook> filteredList = new HashMap<>();
        Iterator<Map.Entry<Integer, Notebook>> itr = listOfNotes.entrySet().iterator();        
        int counter = 1;
        while (itr.hasNext()) {
            Map<Integer, Notebook> tmpMap = new HashMap<>();
            tmpMap.put(1, itr.next().getValue());

            int currentRamSize = (tmpMap.get(1).ramSize);
            int currentDriveSize = (tmpMap.get(1).driveSize);
            String currentOsType = (tmpMap.get(1).osType);
            String currentColor = (tmpMap.get(1).color);

            int userChoiceRamSize =  (!userChoice.get(1).equals("")) ? (Integer.parseInt(userChoice.get(1))) : 0;
            int userChoiceDriveSize = (!userChoice.get(2).equals("")) ? (Integer.parseInt(userChoice.get(2))) : 0;
            String userChoiceOsType = (userChoice.get(3));
            String userChoiceColor = (userChoice.get(4));

            int resultCounter = 0;
            if (userChoiceRamSize > 0){
                if (currentRamSize >= userChoiceRamSize)  {
                    resultCounter++;
                };
            }
            else resultCounter++;

            if (userChoiceDriveSize > 0){
                if (currentDriveSize >= userChoiceDriveSize){
                    resultCounter++;
                }
            }
            else resultCounter++;

            if (!userChoiceOsType.equals("")){
                if (userChoiceOsType.equals(currentOsType)){
                    resultCounter++;
                }
            }
            else resultCounter++;

            if (!userChoiceColor.equals("")){
                if (userChoiceColor.equals(currentColor)){
                    resultCounter++;
                }
            }
            else resultCounter++;
            if (resultCounter == 4){
                filteredList.put(counter, listOfNotes.get(counter));
            }
            counter++;
        }
        System.out.println("по вашим криетриям доступны следующие модели: ");
        return filteredList;
    }

}