import java.util.Scanner;

public class Customer extends User {
    private CheckingAccount checking;
    private SavingsAccount savings;
    private static Scanner input = new Scanner(System.in);

    public Customer(String username, String pin, CheckingAccount checking, SavingsAccount savings) {
        super(username, pin);
        this.checking = checking;
        this.savings = savings;
    }

    public String menu() {
        return "\nCustomer Menu\n" +
               "1) Checking Account\n" +
               "2) Savings Account\n" +
               "3) Quit\n\n" +
               "Enter 1-3: ";
    }

    public void start() {
        boolean done = false;
        while (!done) {
            System.out.print(menu());
            String choice = input.nextLine();
            switch (choice) {
                case "1":
                    checking.start();
                    break;
                case "2":
                    savings.start();
                    break;
                case "3":
                    done = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

