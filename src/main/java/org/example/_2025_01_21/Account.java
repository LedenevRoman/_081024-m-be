package org.example._2025_01_21;

public class Account {
    private int balance;
    private int hold;

    public Account(int balance, int hold) {
        this.balance = balance;
        this.hold = hold;
    }

    public void makePay(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("amount не может быть отрицательным");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("недостаточно средств");
        }
        balance -= amount;
        hold += amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", hold=" + hold +
                '}';
    }
}
