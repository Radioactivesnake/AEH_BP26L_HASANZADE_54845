package pl.pp;

import java.util.*;

public class myTenthApp {
    public static void main(String[] args) {
        // Array declarations - for example
        int[] a = new int[100];
        long b[] = new long[10];
        String[] c = new String[5];
        c[0] = "Test 0";
        c[3] = "Test 3";

        System.out.println(c[0]);

        for (var i = 0; i < 100; i++) {
            a[i] = i;
        }
        for (var i = 0; i < 100; i++) {
            System.out.println(a[i]);
        }

        for (var i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        System.out.println("==================================================");
        for (var element : c) {
            System.out.println(element);
        }

        // Lists
        System.out.println("LISTS");
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(0, 5);
        list1.addAll(2, list2);

        for (var element : list1) {
            System.out.println(element);
        }
        System.out.println(list1.get(0));
        System.out.println(list1.get(3));

        System.out.println("Position of number 3 is: " + list1.indexOf(3));
        list1.remove(2);
        System.out.println("Position of number 3 is: " + list1.indexOf(3));

        list1.set(0, 10);
        System.out.println("First element of the collection: " + list1.get(0));

        System.out.println("Number of elements before clearing: " + list1.size());
        list1.clear();
        System.out.println("Number of elements after clearing: " + list1.size());

        // Sets
        System.out.println("SETS");
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(5);
        set2.add(4);

        set1.addAll(set2);

        System.out.println("Elements: ");
        for (var element : set1) {
            System.out.println(element);
        }

        System.out.println("Number of elements: " + set1.size());
        set1.remove(2);
        System.out.println("Number of elements: " + set1.size());

        set1.clear();
        System.out.println("Number of elements: " + set1.size());

        // Maps
        System.out.println("MAPS");
        Map<Integer, String> map1 = new TreeMap<>();
        Map<Integer, String> map2 = new HashMap<>();

        map1.put(1, "one");
        map1.put(2, "two");
        map1.put(3, "three");

        map2.put(5, "five");
        map2.put(4, "four");

        map1.putAll(map2);

        System.out.println("Keys: ");
        for (var key : map1.keySet()) {
            System.out.println(key);
        }

        System.out.println("Values: ");
        for (var value : map1.values()) {
            System.out.println(value);
        }

        System.out.println("Pairs: ");
        for (var entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("Number of elements: " + map1.size());
        map1.remove(2);
        System.out.println("Number of elements: " + map1.size());

        map1.clear();
        System.out.println("Number of elements: " + map1.size());

        // ── Task 2 test ──────────────────────────────────────────────
        System.out.println("TASK 2");
        int[] result = countAndSumElements(new int[]{1, 2, 3, 4, 5, -3, -2, -1});
        System.out.println("Negative count: " + result[0]); // expected: 3
        System.out.println("Positive sum:   " + result[1]); // expected: 15

        int[] empty = countAndSumElements(new int[]{});
        System.out.println("Empty input length: " + empty.length); // expected: 0

        int[] nullInput = countAndSumElements(null);
        System.out.println("Null input length:  " + nullInput.length); // expected: 0
    }

    // ── Task 2 ───────────────────────────────────────────────────────
    public static int[] countAndSumElements(int[] input) {
        if (input == null || input.length == 0) {
            return new int[]{};
        }

        int negativeCount = 0;
        int positiveSum = 0;

        for (int num : input) {
            if (num < 0) {
                negativeCount++;
            } else if (num > 0) {
                positiveSum += num;
            }
        }

        return new int[]{negativeCount, positiveSum};
    }
}
