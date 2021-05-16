import java.util.Scanner;

public class WordFrequencies {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUMARRAY = 20;
      String[] userInput = new String[NUMARRAY];
      int[] userFrequency = new int[NUMARRAY];
      int i;
      int j;
      int userElements;
      int count;

      userElements = scnr.nextInt();

      for (i = 0; i < userElements; ++i) {
         userInput[i] = scnr.next();
      }

      for (i = 0; i < userElements; ++i) {
         count = 0;
         for (j = 0; j < userElements; ++j) {
            if (userInput[i].equals(userInput[j])) {
               count = count + 1;
            }
         }
         userFrequency[i] = count;
      }

      for (i = 0; i < userElements; ++i) {
         System.out.println(userInput[i] + " - " + userFrequency[i]);
      }
   }
}