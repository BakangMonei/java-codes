package BankingApplication;


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface RMIInterface extends Remote {
    int message(int var1, int var2) throws RemoteException;

    String registerCustomer(String var1, String var2, String var3, String var4, String var5) throws RemoteException;

    String registerStudent(String var1, String var2, String var3, String var4, String var5) throws RemoteException;

    String updateCustomer(String var1, String var2, String var3, String var4, String var5) throws RemoteException;

    String deleteCustomer(String var1) throws RemoteException;

    ArrayList searchCustomer(String var1) throws RemoteException;

    String login(String var1, String var2, String var3) throws RemoteException;

    ArrayList viewAllCustomers(int var1) throws RemoteException;

    ArrayList searchCustomerByID(int var1, String var2) throws RemoteException;
}

