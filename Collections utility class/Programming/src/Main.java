import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    List<String> list = new ArrayList<>();
    Collections.addAll(list, scanner.nextLine().split(" "));
    int size = scanner.nextInt();
    for (int i = 0; i < size; i++) {
      int first = scanner.nextInt();
      int second = scanner.nextInt();
      String tmp = list.get(first);
      list.set(first, list.get(second));
      list.set(second, tmp);
    }
    for (String s : list) {
      System.out.print(s + " ");
    }
  }
}