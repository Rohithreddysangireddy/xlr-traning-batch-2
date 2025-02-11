
public class Demo060 {

    public static void main(String[] args) {
        int count = 20;
        int num1 = 0, num2 = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= count; i++) {
            System.out.print(num1 + " ");

            int nextTerm = num1 + num2;
            num1 = num2;
            num2 = nextTerm;
        }
    }
}
