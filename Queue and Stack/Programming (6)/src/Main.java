import java.util.Scanner;
import java.util.Stack;

public class Main {

    static class MaxStack {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maximums = new Stack<>();

        public void pop() {
            int element = stack.pop();
            if (element == maximums.peek()) {
                maximums.pop();
            }
        }

        public void push(int element) {
            stack.push(element);
            if (maximums.isEmpty()) {
                maximums.push(element);
            } else if (element >= maximums.peek()) {
                maximums.push(element);
            }
        }

        public int max() {
            return maximums.peek();
        }
    }

    public static void main(String[] args) {
        //put your code here
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        MaxStack maxStack = new MaxStack();
        for (int i = 0; i < count; i++) {
            String command = scanner.nextLine();
            if (command.equals("max")) {
                System.out.println(maxStack.max());
            } else if (command.equals("pop")) {
                maxStack.pop();
            } else {
                String[] parameters = command.split(" ");
                if (parameters[0].equals("push")) {
                    maxStack.push(Integer.parseInt(parameters[1]));
                }
            }
        }
    }
}