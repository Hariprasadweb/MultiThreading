package oops.bank;

import oops.Employe;

public class HdfcBank {
    private Person person;

    public HdfcBank(String name, double amount) {
        this.person = new Person(name, amount);
    }

    public void creditAmount(double amount) {
        synchronized (this.person) {
            double currentBalance = person.getBalance();
            person.setBalance(currentBalance + amount);
        }
    }

    public double debitAmount(double amount) {
        synchronized (this.person) {
            double currentBalance = person.getBalance();
            double remainingBalance = currentBalance - amount;
            person.setBalance(remainingBalance);
            return remainingBalance;
        }
    }

    public Person getPerson(){
        return this.person;
    }
}

