
package genericsearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenericSearch {

    public static <T> boolean searchElement(List<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        // Input elements
        try (Scanner scanner = new Scanner(System.in)) {
            // Input elements
            List<String> stringList = new ArrayList<>();
            System.out.print("Enter the number of strings in the list: ");
            int numStrings = scanner.nextInt();
            System.out.println("Enter the strings:");
            for (int i = 0; i < numStrings; i++) {
                stringList.add(scanner.next());
            }
            System.out.print("Enter a string to search: ");
            String searchString = scanner.next();
            boolean isStringFound = searchElement(stringList, searchString);
            if (isStringFound) {
                System.out.println("String found in the list.");
            } else {
                System.out.println("String not found in the list.");
            }
            
            List<Integer> integerList = new ArrayList<>();
            System.out.print("Enter the number of integers in the list: ");
            int numIntegers = scanner.nextInt();
            System.out.println("Enter the integers:");
            for (int i = 0; i < numIntegers; i++) {
                integerList.add(scanner.nextInt());
            }
            System.out.print("Enter an integer to search: ");
            int searchInteger = scanner.nextInt();
            boolean isIntegerFound = searchElement(integerList, searchInteger);
            if (isIntegerFound) {
                System.out.println("Integer found in the list.");
            } else {
                System.out.println("Integer not found in the list.");
            }
        }
    }
}

