import java.util.Scanner;

public class Demo8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String loginid = null;
        String password = null;
        String reply;
        do {
            System.out.println("Welcome to Mallareddy University");
            System.out.println("Have you visited our site earlier?");
            reply = sc.nextLine();
            if (reply.equals("no")) {
                System.out.println("Login here");
                System.out.println("Enter your ID and password");
                loginid = sc.nextLine();
                password = sc.nextLine();
            } else {
                System.out.println("You are our valued customer");
            }
        } while ((loginid.equals("Rohith")) && (password.equals("Rohith2807")));
    }
}
