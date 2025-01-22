
public class lt 

    code2{

    public static boolean isPalindrome(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {

            reversedHalf = reversedHalf * 10 + x % 10;

            x /= 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {

        int x1 = 121;
        int x2 = -121;
        int x3 = 10;

        System.out.println("Is " + x1 + " a palindrome? " + isPalindrome(x1)); // true
        System.out.println("Is " + x2 + " a palindrome? " + isPalindrome(x2)); // false
        System.out.println("Is " + x3 + " a palindrome? " + isPalindrome(x3)); // false
    }
}
