package ATM_Machine;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

public abstract class Transaction
{
    private int accountNumber; // indicates account involved
    protected Screen screen; // ATM's screen
    private BankDatabase bankDatabase; // account info database

    // Transaction constructor invoked by subclasses using super()
    public Transaction(int userAccountNumber, Screen atmScreen,
                       BankDatabase atmBankDatabase)
    {
        accountNumber = userAccountNumber;
        screen = atmScreen;
        bankDatabase = atmBankDatabase;
    } // end Transaction constructor

    // return account number
    public int getAccountNumber()
    {
        return accountNumber;
    } // end method getAccountNumber

    // return reference to screen
    public Screen getScreen()
    {
        return screen;
    } // end method getScreen

    // return reference to bank database
    public BankDatabase getBankDatabase()
    {
        return bankDatabase;
    } // end method getBankDatabase

    // perform the transaction (overridden by each subclass)
    abstract public void execute();
}

// BalanceInquiry.java
// Represents a balance inquiry ATM transaction

class BalanceInquiry extends Transaction
{
    // BalanceInquiry constructor
    public BalanceInquiry(int userAccountNumber, Screen atmScreen,
                          BankDatabase atmBankDatabase)
    {
        super(userAccountNumber, atmScreen, atmBankDatabase);
    } // end BalanceInquiry constructor

    // performs the transaction
    @Override
    public void execute()
    {
        // get references to bank database and screen
        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();

        // get the available balance for the account involved
        double availableBalance =
                bankDatabase.getAvailableBalance(getAccountNumber());

        // get the total balance for the account involved
        double totalBalance =
                bankDatabase.getTotalBalance(getAccountNumber());

        // display the balance information on the screen


        screen.creatBalanceGUI();
        screen.messageJLabel2.setText("Avaliable Balance: " + availableBalance);
        screen.messageJLabel3.setText("Total Balance: " + totalBalance);
        screen.Mainframe.revalidate();

    } // end method execute
}

// Deposit.java
// Represents a deposit ATM transaction

class Deposit extends Transaction
{
    private double amount; // amount to deposit
    private Keypad keypad; // reference to keypad
    private DepositSlot depositSlot; // reference to deposit slot
    private final static int CANCELED = 0; // constant for cancel option

    // Deposit constructor
    public Deposit(int userAccountNumber, Screen atmScreen,
                   BankDatabase atmBankDatabase, Keypad atmKeypad,
                   DepositSlot atmDepositSlot)
    {
        // initialize superclass variables
        super(userAccountNumber, atmScreen, atmBankDatabase);

        // initialize references to keypad and deposit slot
        keypad = atmKeypad;
        depositSlot = atmDepositSlot;
    } // end Deposit constructor

    // perform transaction
    @Override
    public void execute()
    {
        promptForDepositAmount();
    }
    public void makedeposit(double amount){
        BankDatabase bankDatabase = getBankDatabase(); // get reference
        Screen screen = getScreen(); // get reference
        // get deposit amount from user

        // check whether user entered a deposit amount or canceled
        if (amount != CANCELED)
        {
            // request deposit envelope containing specified amount
            screen.messageJLabel2.setText( "\nPlease insert a deposit envelope containing " + amount);

            // receive deposit envelope
            boolean envelopeReceived = depositSlot.isEnvelopeReceived();

            // check whether deposit envelope was received
            if (envelopeReceived)
            {
                screen.messageJLabel2.setText("\nYour envelope has been " +
                        "received.\nNOTE: The money just deposited will not ");
                screen.messageJLabel3.setText("be available until we verify the amount of any " +
                        "enclosed cash and your checks clear.");

                // credit account to reflect the deposit
                bankDatabase.credit(getAccountNumber(), amount);
            } // end if
            else // deposit envelope not received
            {
                screen.messageJLabel2.setText("\nYou did not insert an " +
                        "envelope, so the ATM has canceled your transaction.");
            } // end else
        } // end if
        else // user canceled instead of entering amount
        {
            screen.messageJLabel2.setText("\nCanceling transaction...");
        } // end else
    } // end method execute

    // prompt user to enter a deposit amount in cents
    private void promptForDepositAmount()
    {
        Screen screen = getScreen(); // get reference to screen

        // display the prompt
        screen.CreateDepositGUI(); // receive input of deposit amount
        screen.Mainframe.add( keypad.addkeypad(), BorderLayout.CENTER);
        Depositcheck check1 = new Depositcheck();
        keypad.BEnter.addActionListener( check1 );
        screen.Mainframe.revalidate();
        // check whether the user cancelled or entered a valid amount

        // return dollar amount
    } // end else
    // end method promptForDepositAmount

    private class Depositcheck implements ActionListener
    {
        public void actionPerformed( ActionEvent e )
        {

            double input = Integer.parseInt( screen.Inputfield2.getText() );
            double amount = input / 100;

            makedeposit(amount);

        }
    }
}

// Withdrawal.java
// Represents a withdrawal ATM transaction

class Withdrawal extends Transaction
{
    private int amount; // amount to withdraw
    private Keypad keypad; // reference to keypad
    private CashDispenser cashDispenser; // reference to cash dispenser

    // constant corresponding to menu option to cancel
    private final static int CANCELED = 6;

    // Withdrawal constructor
    public Withdrawal(int userAccountNumber, Screen atmScreen,
                      BankDatabase atmBankDatabase, Keypad atmKeypad,
                      CashDispenser atmCashDispenser)
    {
        // initialize superclass variables
        super(userAccountNumber, atmScreen, atmBankDatabase);

        // initialize references to keypad and cash dispenser
        keypad = atmKeypad;
        cashDispenser = atmCashDispenser;
    } // end Withdrawal constructor

    // perform transaction
    @Override
    public void execute()
    {
        // amount available for withdrawal

        // get references to bank database and screen


        // loop until cash is dispensed or the user cancels
        displayMenuOfAmounts();
    }
    public void transaction(int amount){
        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();
        boolean cashDispensed = false; // cash was not dispensed yet
        double availableBalance;
        // check whether user chose a withdrawal amount or canceled

        // get available balance of account involved
        availableBalance =
                bankDatabase.getAvailableBalance(getAccountNumber());

        // check whether the user has enough money in the account
        if (amount <= availableBalance)
        {
            // check whether the cash dispenser has enough money
            if (cashDispenser.isSufficientCashAvailable(amount))
            {
                // update the account involved to reflect the withdrawal
                bankDatabase.debit(getAccountNumber(), amount);

                cashDispenser.dispenseCash(amount); // dispense cash
                cashDispensed = true; // cash was dispensed

                // instruct user to take cash
                screen.messageJLabel7.setText("\nYour cash has been" +
                        " dispensed. Please take your cash now.");
            } // end if
            else // cash dispenser does not have enough cash
                screen.messageJLabel7.setText(
                        "\nInsufficient cash available in the ATM." +
                                "\n\nPlease choose a smaller amount.");
        } // end if
        else // not enough money available in user's account
        {
            screen.messageJLabel7.setText(
                    "\nInsufficient funds in your account." +
                            "\n\nPlease choose a smaller amount.");
        } // end else
    } // end if
    // end else


    // end method execute

    // display a menu of withdrawal amounts and the option to cancel;
    // return the chosen amount or 0 if the user chooses to cancel
    private void displayMenuOfAmounts()
    {

        int userChoice = 0; // local variable to store return value

        Screen screen = getScreen(); // get screen reference
        screen.createWithdrawGUI();
        screen.Mainframe.add( keypad.addkeypad(), BorderLayout.CENTER);
        withdraw1 check1 = new withdraw1();
        withdraw2 check2 = new withdraw2();
        withdraw3 check3 = new withdraw3();
        withdraw4 check4 = new withdraw4();
        withdraw5 check5 = new withdraw5();
        Keypad.B1.addActionListener(check1);
        Keypad.B2.addActionListener(check2);
        Keypad.B3.addActionListener(check3);
        Keypad.B4.addActionListener(check4);
        Keypad.B5.addActionListener(check5);



        screen.Mainframe.revalidate();
    }

    public class withdraw1 implements ActionListener
    {
        public void actionPerformed( ActionEvent e )
        {
            transaction(20);
        }
    }
    public class withdraw2 implements ActionListener
    {
        public void actionPerformed( ActionEvent e )
        {
            transaction(40);
        }
    }
    public class withdraw3 implements ActionListener
    {
        public void actionPerformed( ActionEvent e )
        {
            transaction(60);
        }
    }
    public class withdraw4 implements ActionListener
    {
        public void actionPerformed( ActionEvent e )
        {
            transaction(100);
        }
    }
    public class withdraw5 implements ActionListener
    {
        public void actionPerformed( ActionEvent e )
        {
            transaction(200);
        }
    }
}
