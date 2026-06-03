public class task33 {

    public static void main(String[] args) {

        int account1 = 10000;
        int account2 = 5000;
        int amount = 1000;

        System.out.println("Before Transfer");
        System.out.println("Account1: " + account1);
        System.out.println("Account2: " + account2);

        account1 -= amount;
        account2 += amount;

        System.out.println("\nAfter Transfer");
        System.out.println("Account1: " + account1);
        System.out.println("Account2: " + account2);

        System.out.println("Transaction Successful");
    }
}