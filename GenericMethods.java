
package javaapplication51;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenericMethods {

    // Method to count the number of odd integers in an integer list
    public static <T extends Number> int countOddIntegers(List<T> list) {
        int count = 0;
        for (T item : list) {
            if (item.intValue() % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    // Method to exchange the positions of two different elements in an array
    public static <T> void exchangeElements(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IllegalArgumentException("Invalid indices");
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // Method to find the maximal element in the range [begin, end] of a list
    public static <T extends Comparable<T>> T findMaxInRange(List<T> list, int begin, int end) {
        if (begin < 0 || end >= list.size() || begin > end) {
            throw new IllegalArgumentException("Invalid range");
        }
        T max = list.get(begin);
        for (int i = begin + 1; i <= end; i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Count the number of odd integers in an integer list
        try (Scanner scanner = new Scanner(System.in)) {
            // Count the number of odd integers in an integer list
            System.out.print("Enter the number of integers in the list: ");
            int numIntegers = scanner.nextInt();
            List<Integer> integerList = new ArrayList<>();
            System.out.println("Enter the integers:");
            for (int i = 0; i < numIntegers; i++) {
                integerList.add(scanner.nextInt());
            }
            System.out.println("Number of odd integers: " + countOddIntegers(integerList));
            
            // Exchange the positions of two different elements in an array
            System.out.print("Enter the number of elements in the array: ");
            int numElements = scanner.nextInt();
            String[] array = new String[numElements];
            System.out.println("Enter the elements:");
            for (int i = 0; i < numElements; i++) {
                array[i] = scanner.next();
            }
            System.out.println("Enter the indices to exchange (0-" + (numElements - 1) + "):");
            int index1 = scanner.nextInt();
            int index2 = scanner.nextInt();
            exchangeElements(array, index1, index2);
            System.out.println("Array after exchanging elements: " + String.join(", ", array));
            
            // Find the maximal element in the range [begin, end] of a list
            System.out.print("Enter the number of elements in the list: ");
            int numElementsList = scanner.nextInt();
            List<Double> doubleList = new ArrayList<>();
            System.out.println("Enter the elements:");
            for (int i = 0; i < numElementsList; i++) {
                doubleList.add(scanner.nextDouble());
            }
            System.out.print("Enter the beginning index: ");
            int begin = scanner.nextInt();
            System.out.print("Enter the ending index: ");
            int end = scanner.nextInt();
            System.out.println("Max element in the range [" + begin + ", " + end + "]: " + findMaxInRange(doubleList, begin, end));
        }
    }
}

