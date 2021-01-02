import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    int low = scanner.nextInt();
    int high = scanner.nextInt();
    int size = scanner.nextInt();
    SortedMap<Integer, String> map = new TreeMap<>();
    for (int i = 0; i < size; i++) {
      int key = scanner.nextInt();
      String value = scanner.next();
      map.put(key, value);
    }

    for (Map.Entry<Integer, String> entry : map.subMap(low, high + 1).entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }
}