package study.ch09.entity;

class BankAccount {
    String owner;
    int balance;

    BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족");
        } else {
            balance -= amount;
        }
    }

    void printBalance() {
        System.out.println(owner + ": 잔액 " + balance + "원");
    }
}

/*public class Main {
    public static void main(String[] args) {
        BankAccount o1 = new BankAccount("진혜정", 6055);
    }
}*/
