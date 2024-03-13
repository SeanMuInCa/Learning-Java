package COSC603.Class0313;

import java.io.*;

public class TestAccount
{
    public static void main(String[] args)
    {
        Account a1 = new Account("no.1", 1001,100);
        Account a2 = new Account("no.2", 1002,200);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("accounts.dat")));)
        {
            /*dos.writeBytes(a1.toString() + "\n");
            dos.writeBytes(a2.toString());*/
            /*dos.writeLong(a1.accountId);
            dos.writeDouble(a1.balanced);
            dos.writeUTF(a1.accountName);

            dos.writeLong(a2.accountId);
            dos.writeDouble(a2.balanced);
            dos.writeUTF(a2.accountName);*/
            oos.writeObject(a1);
            oos.writeObject(a2);
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }

        try( ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("accounts.dat")));)
        {
            /*long id = dis.readLong();
            double balance = dis.readDouble();
            String name = dis.readUTF();

            Account a3 = new Account(name, id, balance);*/
            Account a3 = (Account) ois.readObject();
            Account a4 = (Account) ois.readObject();


            System.out.println(a3);
            System.out.println(a4);
        } catch (ClassNotFoundException | IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
