package pack1;

/**
 * Created by student on 2015/02/13.
 */
public class AccountHolder {

    private String accountNumber;
    private float balance;
    private float amount;
    private int activity;

    public AccountHolder()
    {}

    public void setAccountNumber(String accNum)
    {
        accountNumber = accNum;
    }

    public void setBalance(float bal) {

        balance = bal;
    }

    public void setAmount(float amnt) {

        amount = amnt;
    }

    public void setActivity(int act)
    {
        activity = act;
    }
    public String getAccountNumber()
    {
        return accountNumber;
    }

    public float getBalance()
    {
        return balance;
    }

    public float getAmount()
    {
        return amount;
    }

    public int getActivity()
    {
        return activity;
    }

    public float calcDepositAmount()
    {
        return balance + amount;
    }

    public float calWithdrawalAmount()
    {
        return balance - amount;
    }
}
