package BankingSystemOriginal;

public class BankTester {
    public static void main(String[] args){

        Savings sav1 = new Savings(001, "Wesly Koothupile" ,100.00, "Gabs");
        Checking chk1 = new Checking(002, "Max Lejage", 0.00, "Gabs");

        System.out.println(sav1.toString());

        System.out.println(chk1.toString());

        sav1.deposit(100.00);
        System.out.println("Transaction for " + sav1.getAccHolder() + " has been succesful, new balance is "+ sav1.getBalance());

        sav1.payInterest(0.3);
        System.out.println(sav1.getBalance());


        // Connect to the JDBC file*****

    }
}
