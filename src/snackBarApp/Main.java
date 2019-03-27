
package snackBarApp;

public class Main
{
    private static void workWithData()
    {
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine Office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, 1);
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, 1);
        Snack pretzel = new Snack("Pretzel", 30, 2.00, 1);

        Snack drink = new Snack("Soda", 24, 2.50, 2);
        Snack drink = new Snack("Water", 20, 2.75, 2);
    }

    public static void main(String[] args)
    {
        workWithData()
    }
}