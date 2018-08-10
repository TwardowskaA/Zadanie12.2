import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        try (Scanner scan = new Scanner(System.in)){
            Math.scanReader(scan,numbers);
        }

        Math.sum(numbers);
    }


}
