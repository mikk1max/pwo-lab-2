import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = null;
        Login login = new Login();
        Registration registration = new Registration();

        // main cycle program
        while (true) {
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    user = login.login(scanner);
                    if (user != null) {
                        new Dashboard(user).showDashboard();
                    } else {
                        System.out.println("Invalid login!");
                    }
                    break;
                case 2:
                    registration.register(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
