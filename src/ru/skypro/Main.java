package ru.skypro;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(2, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 1));
        List<String> words = new ArrayList<>(List.of("car","milk","tea", "coffee", "tea","car","milk"));
        getNums(nums);
        System.out.println();
        getNumsNoDouble(nums);
        System.out.println();
        getWords(words);
        System.out.println();
        getCountDoubleWords(words);
    }

    public static void getNums(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num);
            }
        }
    }

    public static void getNumsNoDouble(List<Integer> nums) {
        List<Integer> nums2 = new ArrayList<>(Set.copyOf(nums));
        Collections.sort(nums2);
        for (Integer num : nums2) {
            if (num % 2 == 0)
                System.out.print(num);
        }
    }

    public static void getWords(List<String> words){
        Set<String> words2 = new HashSet<>(Set.copyOf(words));
        for (String i : words2) {
            System.out.print(i + " ");
        }
    }

    public static void getCountDoubleWords(List<String> words){
        Set<String> words2 = new HashSet<>(words);
        System.out.println((words.size() - words2.size()) * 2);
    }
}
