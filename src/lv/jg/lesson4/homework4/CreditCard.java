package lv.jg.lesson4.homework4;

public class CreditCard {
    private String cardNumber, pinCode;
    private double debitBalance, creditLimit = 500, creditUsed, amount;

    public CreditCard(String cardNumber) {
        this.cardNumber=cardNumber;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
    public double getDebitBalance() {
        return this.debitBalance;
    }
    public double getCreditUsed() {
        return creditUsed;
    }
    public double getAmount() {
        return amount;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public boolean compare() {
        if (pinCode == "0000" && cardNumber == "123-456-789") {
            return true;
        } else {
            return false;
        }
    }

    private void startingAccountStatus() {
        if (compare() == true) {
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<< Pin Correct >>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("<<<<<<<<<<<<<<<<<<<<<< Starting Account Status >>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Debit balance: " + getDebitBalance() + "       Credit used: " + getCreditUsed() + "       Credit limit: " + getCreditLimit());
        }
    }

    public void topUp(double amount, String pinCode) {
        setPinCode(pinCode);
        startingAccountStatus();
        this.amount = amount;

        if (compare() == false) {
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< INCORRECT PIN >>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println(" ");

        } else if (amount <= 0) {
            System.out.println("Deposit Amount: " + getAmount());
            System.out.println("<<<<<<<<<<<<<<<<<<<<<< ERROR INCORRECT AMOUNT >>>>>>>>>>>>>>>>>>>>>>");
            System.out.println(" ");

        } else if (creditUsed > 0 && amount >= creditUsed) {
            debitBalance = amount - creditUsed;
            creditUsed = 0;
            System.out.println("Deposit Amount: " + getAmount());
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<< Account Status >>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Debit balance: " + getDebitBalance() + "      Credit used: " + getCreditUsed());
            System.out.println(" ");
        } else if (creditUsed > 0 && amount < creditUsed){
            creditUsed = creditUsed - amount;
            System.out.println("Deposit Amount: " + getAmount());
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<< Account Status >>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Debit balance: " + getDebitBalance() + "      Credit used: " + getCreditUsed());
            System.out.println(" ");
        } else if (debitBalance >= 0){
            debitBalance = debitBalance + amount;
            System.out.println("Deposit Amount: " + getAmount());
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<< Account Status >>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Debit balance: " + getDebitBalance() + "      Credit used: " + getCreditUsed());
            System.out.println(" ");

        } else {
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< SYSTEM ERROR >>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println(" ");
        }
    }

    public void withdraw(double amount, String pinCode) {
        setPinCode(pinCode);
        startingAccountStatus();
        this.amount = amount;

        if (compare() == false) {
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< INCORRECT PIN >>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println(" ");

        } else if (amount <= 0) {
            System.out.println("Withdraw Amount: " + getAmount());
            System.out.println("<<<<<<<<<<<<<<<<<<<<<< ERROR INCORRECT AMOUNT >>>>>>>>>>>>>>>>>>>>>>");
            System.out.println(" ");

        } else if (amount > debitBalance + creditLimit - creditUsed) {
            System.out.println("Withdraw Amount: " + getAmount());
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<< INSUFFICIENT FUNDS >>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println(" ");

        } else if (amount <= debitBalance + creditLimit - creditUsed
                && debitBalance - amount <= creditLimit - creditUsed
                && amount >= debitBalance) {
            creditUsed = amount - debitBalance;
            debitBalance = 0;
            System.out.println("Withdraw Amount: " + getAmount());
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<< Account Status >>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Debit balance: " + getDebitBalance() + "      Credit used: " + getCreditUsed());
            System.out.println(" ");

        } else if (amount <= debitBalance) {
            debitBalance = debitBalance - amount;
            System.out.println("Withdraw Amount: " + getAmount());
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<< Account Status >>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Debit balance: " + getDebitBalance() + "      Credit used: " + getCreditUsed());
            System.out.println(" ");

        } else {
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< SYSTEM ERROR >>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println(" ");
        }
    }

}
