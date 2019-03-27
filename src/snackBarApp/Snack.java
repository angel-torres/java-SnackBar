package snackBarApp;

public class Snack
{
    private static int maxId = 0;

    private int id;

    private String name;

    private int quantity = 0;

    private double cost;

    private int machineId;

    public Snack (String name, int quantity, double cost, int machineId)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.machineId = machineId;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void addQuantity(int addedQuantity)
    {
        quantity += addedQuantity;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public int buySnack(int boughtQuantity)
    {
        quantity -= boughtQuantity;
        return quantity;
    }

    public double cost(double boughtQuantity)
    {
        return boughtQuantity * cost;
    }

}