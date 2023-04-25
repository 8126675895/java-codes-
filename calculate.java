import java.util.Arrays;

public class calculate {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 7, 2, 8, 4, 7, -9,22,33,44,55,66,77,88,99,0,1,22,3453};

        
        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println("Maximum value: " + max);

        
        int min = Arrays.stream(numbers).min().getAsInt();
        System.out.println("Minimum value: " + min);

        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum of values: " + sum);

     
        double average = Arrays.stream(numbers).average().getAsDouble();
        System.out.println("Average value: " + average);
    }
}
