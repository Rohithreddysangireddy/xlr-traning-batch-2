
public class Demo064 {

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        if (array.length > 1) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
            System.out.println("Array after swapping first and last elements:");
            for (int i : array) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Array should have at least two elements.");
        }
    }
}
