import java.util.Queue;
import java.util.Scanner;

public class Math {

    static void scanReader(Scanner scan, Queue<Integer> numbers){
        System.out.println("Podaj 10 liczb:");
        for (int i = 0; i < 10; i++) {
            numbers.offer(scan.nextInt());
        }
    }
    static void sum(Queue<Integer> numbers){
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i : numbers){
            sb.append(i);
            sb.append('+');
            sum = sum + i;
        }
        sb.replace(sb.length() - 1, sb.length(), "=");
        sb.append(sum);
        System.out.println(sb.toString());
    }
}
