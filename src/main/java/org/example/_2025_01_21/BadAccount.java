package org.example._2025_01_21;

public class BadAccount {
    private int balance;
    private int hold;

    public BadAccount(int balance, int hold) {
        this.balance = balance;
        this.hold = hold;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getHold() {
        return hold;
    }

    public void setHold(int hold) {
        this.hold = hold;
    }
}
