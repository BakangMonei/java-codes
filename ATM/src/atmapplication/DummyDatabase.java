package atmapplication;

public class DummyDatabase
{
    String accNumberOne = "12345";
    String accNumberTwo = "12346";

    String [] account = new String[10];
    String [] accountPin = new String[10];

    String accOnePin = "0000";
    String accTwoPin = "0001";

    double accBalance = 2500;

    private String[] AccountList(){
        account[1] = "01";
        account[2] = "02";
        account[3] = "03";
        account[4] = "04";
        account[5] = "05";
        account[6] = "06";

        return account;
    }

    private String[] AccountPinList(){
        accountPin[1] = "01";
        accountPin[2] = "02";
        accountPin[3] = "03";
        accountPin[4] = "04";
        accountPin[5] = "05";
        accountPin[6] = "06";

        return accountPin;
    }
}
