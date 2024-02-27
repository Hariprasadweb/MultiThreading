package oops.bank;

public class BankRunner {
    public static void main(String[] args) {
        HdfcBank Ramu= new HdfcBank("Ramu",500.0);
        HdfcBank Bheem= new HdfcBank("Bheem",600.0);

        Gpay gpay= new Gpay(Ramu);
        gpay.start();

        DebitCard debitCard=new DebitCard(Ramu);
        debitCard.start();


        try {
            gpay.join();
            debitCard.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Ramu remaining balance "+Ramu.getPerson().getBalance());

    }
}
