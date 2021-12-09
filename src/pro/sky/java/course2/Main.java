package pro.sky.java.course2;

import pro.sky.java.course2.Data.DoubleWords;
import pro.sky.java.course2.Service.ServiceList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new LinkedList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        ServiceList list1 = new ServiceList(nums);
        System.out.println(list1.getOddItems());
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        ServiceList list2 = new ServiceList(nums2);
        System.out.println(list2.getEvenItemsDistinct());
        List<String> words = new ArrayList<String>(List.of("слово", "честное","самое","честное","слово", "одно", "слово", "заменить", "слово", "последнее", "слово"));
        ServiceList list3 = new ServiceList(words);
        System.out.println(list3.getWordsDistinct());
        ServiceList list4 = new ServiceList(words);
        System.out.println("Повторов - "+list4.getCoutDoubleWords());


    }
}
