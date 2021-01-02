import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //put your code here
        //put your code here
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0) {
                deque.addFirst(number);
            } else {
                deque.addLast(number);
            }
        }
        for (Integer n : deque) {
            System.out.println(n);
        }
    }
}