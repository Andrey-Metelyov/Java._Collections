import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        //put your code here
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(checkMatch(string));
    }

    private static boolean checkMatch(String string) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            String ch = String.valueOf(string.charAt(i));
            if ("({[".contains(ch)) {
                stack.push(ch);
            } else if (")}]".contains(ch)) {
                if (stack.isEmpty()) {
                    return false;
                }
                String last = stack.pop();
                if ("({[".indexOf(ch) != ")}]".indexOf(last)) {
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}