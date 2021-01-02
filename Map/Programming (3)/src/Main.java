import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    int size = Integer.parseInt(scanner.nextLine());
    HashSet<String> dict = new HashSet<>();
    for (int i = 0; i < size; i++) {
      dict.add(scanner.nextLine().toLowerCase());
    }
    size = Integer.parseInt(scanner.nextLine());
    HashSet<String> errors = new HashSet<>();
    for (int i = 0; i < size; i++) {
      String[] words = scanner.nextLine().toLowerCase().split(" ");
      for (String word : words) {
        if (!dict.contains(word)) {
          errors.add(word);
        }
      }
    }
    for (String error : errors) {
      System.out.println(error);
    }
  }
}