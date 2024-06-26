package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        int sum = 0;
        String positiveNumbers = "PositiveNumbers: ";

        // Generating array

        for(int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            int upperBound = 10;
            numbers[i] = random.nextInt(upperBound);
        }
        // Printing sum

        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (sum > 5 && sum < 45) {
                System.out.println("Sum =" + sum + " (After plus element with index " + i + "( value = " + numbers[i] + "))");
            }
        }

        // Printing positive numbers

        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] > 0 && !positiveNumbers.contains(",")) {
                positiveNumbers = positiveNumbers + numbers[i];
            }

            if (numbers[i] % 2 == 0 && numbers[i] > 0) {
                positiveNumbers = positiveNumbers + ", " + numbers[i];
            }

            if (i == numbers.length - 1) {
                positiveNumbers = positiveNumbers + ";";
            }
        }

        // Sorting with "for"

        int[] sortedArrays = Arrays.copyOf(numbers, numbers.length);

        for(int i = 1; i < sortedArrays.length; i++) {
                int value = sortedArrays[i];
                int j = i-1;
                while (j >= 0 && sortedArrays[j] < value){
                    sortedArrays[j+1] = sortedArrays[j];
                    j--;
                }
            sortedArrays[j+1] = value;
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(positiveNumbers);
        // Sorting
        System.out.println(Arrays.toString(Arrays.stream(numbers).sorted().toArray()));
        System.out.println(Arrays.toString(sortedArrays));
    }
}