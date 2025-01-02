import java.util.Arrays;

public class GreatestThreeNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 19, 18, 25, 2, 8, 22};
        
        // Sort the array in ascending order
        Arrays.sort(numbers);
        
        int n = numbers.length;
        
        System.out.println("The three greatest numbers are: " + 
            numbers[n - 1] + ", " + numbers[n - 2] + ", and " + numbers[n - 3]);
    }
}
