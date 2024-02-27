package oops.bank;

public class DebitCard extends Thread{

    HdfcBank hdfcBank;

    public DebitCard(HdfcBank hdfcBank){
        this.hdfcBank=hdfcBank;
    }

    @Override
    public void run() {
      System.out.println("DEBIT CARD THREAD");
      hdfcBank.debitAmount(200);
    }
}
