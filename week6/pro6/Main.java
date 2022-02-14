import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] accounts = new Account[10];
        for(int i = 0; i<10 ; i++){
            accounts[i] = new Account(i,100);
        }
        int id;
        while (true) {


            while (true) {
                System.out.print("Enter an id: ");
                id = scanner.nextInt();
                if (id >= 0 && id <= accounts.length - 1)
                    break;
            }
            int choice;
            while (true) {
                System.out.println("Main menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.println("Enter a choice: ");
                choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("The balance is " + accounts[id].getBalance());
                    break;
                } else if (choice == 2) {
                    System.out.print("Enter an amount to withdraw: ");
                    accounts[id].withdraw(scanner.nextDouble());
                    break;
                } else if (choice == 3) {
                    System.out.print("Enter an amount to deposit: ");
                    accounts[id].deposit(scanner.nextDouble());
                    break;
                } else if (choice == 4) {
                    System.out.print("End of Program.");
                    break;
                } else
                    break;

            }
            if (choice == 4) {
                break;
            }
        }

    }
}
