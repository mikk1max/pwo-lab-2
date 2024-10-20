import java.util.HashMap;
import java.util.Scanner;

public class Login {
    private static HashMap<String, String> usersDatabase = Registration.getUsersDatabase();

    public User login(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        //comment 1
        String password = scanner.nextLine();

        if (usersDatabase.containsKey(username) && usersDatabase.get(username).equals(password)) {
            return new User(username);
        }
        return null;
    }
}