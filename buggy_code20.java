import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class BuggyCode {

    public static int findMax(List<Integer> nums) {
        if (nums.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        int max = nums.get(0);
        for (int num : nums) {
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

        List<Integer> nums = new Vector<>(data);
        nums.add(5);

        // Sum calculation with enhanced for loop
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        System.out.println("Sum: " + total);

        // Handle average with division by zero check
        double average = 0.0;
        if (!nums.isEmpty()) {
            average = (double) total / nums.size();
        }
        System.out.println("Average: " + average);

        // File writing with try-with-resources
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write("Writing to file\n");
        } catch (IOException e) {
            System.err.println("Failed to write to file: " + e.getMessage());
        }

        // Fix division by zero
        int x = 0;
        if (x != 0) {
            int result = total / x;
            System.out.println("Result: " + result);
        } else {
            System.err.println("Division by zero!");
        }

        // Correct method usage
        int value = getValue();
        System.out.println("Value: " + value);

        // Swap variables without redeclaration
        int p = 5, q = 10;
        int temp = p;
        p = q;
        q = temp;
        System.out.println("p: " + p + ", q: " + q);
    }
}