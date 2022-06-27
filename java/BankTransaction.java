package excpetion;

class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);

    }

    public InsufficientBalanceException() {
        super("Insufficient Balance in your savings account");

    }

}

class IllegalBankTransactionException extends RuntimeException {
    public IllegalBankTransactionException(String message) {
        super(message);

    }

    public IllegalBankTransactionException() {
        super("Amount entered cannot be less than zero");

    }
}

public class BankTransaction {

    public static void main(String[] args) {

        int amount = -30000;

        int balance = 5000;

        try {

            if (amount > balance) {

                throw new InsufficientBalanceException();
            }

            else if (amount < 0) {

                throw new IllegalBankTransactionException();

            }

            else {

                balance = balance - amount;

                System.out.println("Your Transaction is Successful!!!");

            }

        }

        catch (InsufficientBalanceException e) {

            e.printStackTrace();

        }

        catch (IllegalBankTransactionException e) {
            e.printStackTrace();

        }
    }
}