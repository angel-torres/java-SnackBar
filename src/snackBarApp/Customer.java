
package snackBarApp;

public class Customer
{
    private static int maxId = 0;

    private int id;

    private String name;

    private double cash;

    public Customer(String name, double cash)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cash = cash;
    }

    public double addCash(double addedCash)
    {
        cash += addedCash;
        return cash;
    }

    public double buy(double totalPurchase)
    {
        cash -= totalPurchase;
        return cash;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getCash()
    {
        return cash;
    }

}