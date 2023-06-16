package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        int n = 15;
        int min = 0;
        int max = 100;
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(min, max));
        }
        System.out.println(list);
        System.out.println("Min and Max: " + Arrays.toString(findMinAndMax(list)));
        System.out.println("Arithmetic mean: " + findArithmeticMean(list));
        System.out.println("Remove even numbers: " + removeEvenNumbers(list));
    }

    public static int[] findMinAndMax(List<Integer> list) {
        int max = list.get(0);
        int min = list.get(0);
        int[] minAndMax = new int[2];
        for (Integer integer : list) {
            if (integer > max) {
                max = integer;
            }
            if (integer < min) {
                min = integer;
            }
        }
        minAndMax[0] = min;
        minAndMax[1] = max;
        return minAndMax;
    }

    public static double findArithmeticMean(List<Integer> list) {
        double sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum / list.size();
    }

    public static List<Integer> removeEvenNumbers(List<Integer> list) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
            i++;
        }
        return list;
    }
}
