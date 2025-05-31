import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class buggy_code8 {

    public static int findMax(List<Integer> nums) {
        if (nums == null) {
            throw new IllegalArgumentException("List is null");
        }
        if (nums.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        Iterator<Integer> iterator = nums.iterator();
        int max = iterator.next();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int getValue() {
        return 10;
    }

    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(-4, -2, -7, -1);
        System.out.println("Max: " + findMax(data));

        List<Integer> nums = new ArrayList<>(data);
        nums.add(5);

        int total = 0;
        for (int num : nums) {
            total += num;
        }
        System.out.println("Sum: " + total);

        double average = 0.0;
        if (!nums.isEmpty()) {
            average = (double) total / nums.size();
        }
        System.out.println("Average: " + average);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Writing to file");
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Failed to write to file: " + e.getMessage());
        }

        int x = 0;
        if (x != 0) {
            int result = total / x;
            System.out.println("Result: " + result);
        } else {
            System.err.println("Division by zero!");
        }

        int value = getValue();
        System.out.println("Value: " + value);

        int p = 5, q = 10;
        int temp = p;
        p = q;
        q = temp;
        System.out.println("p: " + p + ", q: " + q);
    }
}