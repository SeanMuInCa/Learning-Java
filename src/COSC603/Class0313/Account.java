package COSC603.Class0313;

import java.io.*;

public class Account implements Serializable
{
    //private static final long serialVersionUID = -68497970754667710L;
    private String accountName;
    private long accountId;
    private double balanced;

    public Account(String accountName, long accountId, double balanced)
    {
        this.accountName = accountName;
        this.accountId = accountId;
        this.balanced = balanced;
    }

    public String getAccountName()
    {
        return accountName;
    }

    public long getAccountId()
    {
        return accountId;
    }

    public double getBalanced()
    {
        return balanced;
    }

    public void setAccountName(String accountName)
    {
        this.accountName = accountName;
    }

    public void setAccountId(long accountId)
    {
        this.accountId = accountId;
    }

    public void setBalanced(double balanced)
    {
        this.balanced = balanced;
    }

    @Override
    public String toString()
    {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", accountId=" + accountId +
                ", balanced=" + balanced +
                '}';
    }


}
