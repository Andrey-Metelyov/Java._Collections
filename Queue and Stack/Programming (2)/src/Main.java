import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //put your code here
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        Deque<String> deque = new ArrayDeque<>();
        for (int i = 0; i < count; i++) {
            deque.add(scanner.nextLine());
        }
        while (!deque.isEmpty()) {
            System.out.println(deque.pollLast());
        }
    }
}