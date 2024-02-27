package oops.bank;

public class Gpay extends Thread{


    HdfcBank hdfcBank;
    public Gpay(HdfcBank hdfcBank){
        this.hdfcBank=hdfcBank;
    }

    @Override
    public void run() {
       System.out.println("GPAY THREAD CALLED");
       hdfcBank.creditAmount(100);
    }
}
