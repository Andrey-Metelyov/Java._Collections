import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    int rows = scanner.nextInt();
    int cols = scanner.nextInt();
    List<int[]> table = new ArrayList<>();
    for (int i = 0; i < rows; i++) {
      int[] row = new int[cols];
      for (int j = 0; j < cols; j++) {
        row[j] = scanner.nextInt();
      }
      table.add(row);
    }
    int distance = scanner.nextInt();
    Collections.rotate(table, distance);
    for (int[] ints : table) {
      for (int n : ints) {
        System.out.print(n + " ");
      }
      System.out.println();
    }
  }
}