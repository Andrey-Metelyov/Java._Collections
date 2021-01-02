// You can experiment here, it won’t be checked

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task {
  public static void main(String[] args) {
    // put your code here
    List<Integer> numbers = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    Collections.replaceAll(numbers, 4, 5);
    Collections.min(list);
    Collections.sort(list);
    Collections.frequency(list, 10);
    Collections.unmodifiableCollection(numbers);
    Collections.addAll(numbers, 2, 3);
  }
}
