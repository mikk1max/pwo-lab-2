public class Dashboard {
    private User user;

    public Dashboard(User user) {
        this.user = user;
    }

    public void showDashboard() {
        System.out.println("Welcome to the Dashboard, " + user.getUsername() + "!");
    }
}
