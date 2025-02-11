
public class Demo063 {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        if (array.length > 1) {
            int sum = array[0] + array[array.length - 1];
            System.out.println("The sum of the first and last elements is: " + sum);
        } else {
            System.out.println("Array should have at least two elements.");
        }
    }
}
