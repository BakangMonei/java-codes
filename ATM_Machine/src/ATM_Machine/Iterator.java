package ATM_Machine;

import java.util.ArrayList;
import java.util.ArrayList;

public interface Iterator {
    //This is the interface for the Iterator pattern.
    boolean hasNext(int position);
    Object next(int position);
    boolean hasPrev(int position);

}

class AccountIterator implements Iterator {
    ArrayList<Account> accounts;

    public AccountIterator(ArrayList<Account> accounts2) {
        this.accounts = accounts2;
    }
    //This function returns true if the ArrayList has a space next to the current one
    public boolean hasNext(int position) {
        if (position >= accounts.size()) {
            return false;
        } else {
            return true;
        }
    }
    @Override //This function iterates to the next position in the ArrayList.
    public Object next(int position) {
        Account AccountItem = accounts.get(position);
        return AccountItem;
    }
    @Override
    //This function checks when the position is at 0, and prevents the user from going back even further.
    public boolean hasPrev(int position) {
        if(position == 0)
            return false;
        else
            return true;
    }
}
