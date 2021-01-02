import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //put your code here
        class Task {
            private Queue<Integer> queue = new ArrayDeque<>();
            private int totalLoad = 0;

            void addTask(int id, int load) {
                queue.add(id);
                totalLoad += load;
            }

            int getTotalLoad() {
                return totalLoad;
            }

            void printTasks() {
                System.out.println(queue.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(" ")));
            }
        }
        Task firstTask = new Task();
        Task secondTask = new Task();

        Scanner scanner = new Scanner(System.in);
        int numberOfTasks = scanner.nextInt();
        for (int i = 0; i < numberOfTasks; i++) {
            int id = scanner.nextInt();
            int load = scanner.nextInt();
            if (firstTask.getTotalLoad() > secondTask.getTotalLoad()) {
                secondTask.addTask(id, load);
            } else {
                firstTask.addTask(id, load);
            }
        }
        firstTask.printTasks();
        secondTask.printTasks();
    }
}