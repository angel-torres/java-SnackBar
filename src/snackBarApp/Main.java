
package snackBarApp;

public class Main
{
    private static void workWithData()
    {
        Customer customer1 = new Customer("Jane", 45.25);
        Customer customer2 = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine Office = new VendingMachine("Office");

        Snack snack1 = new Snack("Chips", 36, 1.75, 1);
        Snack snack2 = new Snack("Chocolate Bar", 36, 1.00, 1);
        Snack snack3 = new Snack("Pretzel", 30, 2.00, 1);

        Snack snack4 = new Snack("Soda", 24, 2.50, 2);
        Snack snack5 = new Snack("Water", 20, 2.75, 2);

        System.out.println("*** Query Data *** \n");
        System.out.println(food);

        System.out.println("\n *** 1 *** \n");
        snack4.buySnack(3);
        customer1.buy(7.50);
        System.out.println("Customer 1 cash on hand: " + customer1.getCash());
        System.out.println("Snack 4 quantity: " + snack4.getQuantity());

        System.out.println("\n *** 2 *** \n");
        snack3.buySnack(1);
        customer1.buy(2.00);
        System.out.println("Customer 1 cash on hand: " + customer1.getCash());
        System.out.println("Snack 3 quantity: " + snack3.getQuantity());

        System.out.println("\n *** 3 *** \n");
        snack4.buySnack(2);
        customer2.buy(5.00);
        System.out.println("Customer 2 cash on hand: " + customer2.getCash());
        System.out.println("Snack 4 quantity: " + snack4.getQuantity());

        System.out.println("\n *** 4 *** \n");
        customer1.addCash(10.00);
        System.out.println("Customer 1 cash on hand: " + customer1.getCash());

        System.out.println("\n *** 5 *** \n");
        snack2.buySnack(1);
        customer1.buy(1.00);
        System.out.println("Customer 1 cash on hand: " + customer1.getCash());
        System.out.println("Snack 2 quantity: " + snack2.getQuantity());

        System.out.println("\n *** 6 *** \n");
        snack3.addQuantity(12);
        System.out.println("Snack 3 quantity: " + snack3.getQuantity());

        System.out.println("\n *** 7 *** \n");
        snack3.buySnack(3);
        customer2.buy(6.00);
        System.out.println("Customer 2 cash on hand: " + customer2.getCash());
        System.out.println("Snack 3 quantity: " + snack3.getQuantity());
    }

    public static void main(String[] args)
    {
        workWithData();
    }
}

// javac snackBarApp/*.java (this compiles code into .class file)
// jar cvfe SnackBarApp.jar snackBarApp.Main snackBarApp/*.class  (this creates jar file from all .class files)
// java -jar SnackBarApp.jar (executes jar file)
