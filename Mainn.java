public class Mainn {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Isa", 500.0);

        System.out.println("Account Holder: " + acc.getAccountHolderName());
        System.out.println("Balance: " + acc.getBalance());

        acc.deposit(200.0);
        System.out.println("Balance after deposit: " + acc.getBalance());

        try {
            acc.withdraw(800.0);
            System.out.println("Balance after withdraw: " + acc.getBalance());
        } catch (InvalidAmountException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        acc.withdraw(300.0);
        System.out.println("Final Balance: " + acc.getBalance());
    }
}
