package Sorting;

import java.util.Arrays;

public class SelectionSort {
  public static void selectionSort(int[] input) {
    for (int i = 0; i < input.length; i++) {
      int min = i;
      for (int j = i + 1; j < input.length; j++) {
          System.out.println("\n" + Arrays.toString(input));
        if (input[j] < input[min]) {
          min = j;
        }
      }
      int c = input[min];
      input[min] = input[i];
      input[i] = c;
      System.out.print("\n " + input[i]);System.out.print(" " + input[min]);
    }
  }

  public static void main(String[] args) {
    int[] b = {3, 9, 8, 3, 5, 2, 1};
    selectionSort(b);
    System.out.println(b);
  }
}
