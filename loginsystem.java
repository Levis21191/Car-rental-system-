import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        String correctUsername = "admin";
        String correctPassword = "pass123";
        int attempts = 3;

        Scanner scanner = new Scanner(System.in);

        while (attempts > 0) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            // Masking password as *
            System.out.print("Password received: ");
            for (int i = 0; i < password.length(); i++) {
            	System.out.print("*");
            }
            System.out.println();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful!");
                return;
            } else {
                attempts--;
                System.out.println("Invalid credentials. Attempts left: " + attempts);
            }
        }

        System.out.println("Access denied. Too many failed attempts.");
        scanner.close();
    }
}