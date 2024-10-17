import java.util.HashMap;
import java.util.Scanner;

public class Registration {
    private static HashMap<String, String> usersDatabase = new HashMap<>();

    public void register(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        if (usersDatabase.containsKey(username)) {
            System.out.println("Username already exists!");
            return;
        }

        System.out.print("Enter password: ");//getting password from user
        String password = scanner.nextLine();
        usersDatabase.put(username, password);
        System.out.println("Registration successful!");
    }

    public static HashMap<String, String> getUsersDatabase() {
        return usersDatabase;
    }
}