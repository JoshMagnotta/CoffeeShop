import java.util.Scanner;

public class Business {

    static String companyName = "Josh's Java Coffee Shop";
    static String myName = "Josh";

    public static void main(String[] args) throws InterruptedException {

        
        Scanner scnr = new Scanner(System.in);
        String decorativeLine = "******************************";

        System.out.println(decorativeLine);
        System.out.println("Welcome to " + companyName + "!");
        System.out.println("I'm " + myName + ". What's your name? ");
        String customerName = scnr.nextLine();
        System.out.println("Hey there, " + customerName + "!");
        Thread.sleep(100);
        System.out.println("Here's our menu, " + customerName + ". Have a look:");

        Coffee[] menuItemsList = new Coffee[10];
        menuItemsList[0] = new Coffee(1, "Latte", 5.49);
        menuItemsList[1] = new Coffee(2, "Cappuccino", 5.49);
        menuItemsList[2] = new Coffee(3, "Americano", 4.49);
        menuItemsList[3] = new Coffee(4, "Macchiato", 4.99);
        menuItemsList[4] = new Coffee(5, "Flat White", 4.49);
        menuItemsList[5] = new Coffee(6, "Irish", 3.99);
        menuItemsList[6] = new Coffee(7, "Medium Roast", 2.99);
        menuItemsList[7] = new Coffee(8, "Cold Brew", 2.99);
        menuItemsList[8] = new Coffee(9, "Espresso", 1.25);
        menuItemsList[9] = new Coffee(10, "Affogato", 3.49);

        // prints menu
        for (int i = 0; i < menuItemsList.length; i++) {
            System.out.println(menuItemsList[i].toString());
        }

        String thisItemID = "";
        double total = 0.0;
        System.out.println("How many coffees would you like to order?");
        int itemTotal = scnr.nextInt();
        Coffee[] orderedItemsList = new Coffee[itemTotal];
        scnr.nextLine(); // overflow

        System.out.println("Please ensure you correctly spell the name of the coffee.");

        // runs itemTotal times
        for (int i = 0; i < itemTotal;) {
            System.out.println("What would you like to order? ");

            // checks to make sure input is a valid menu item, then stores it
            String order = scnr.nextLine();
            for (int j = 0; j < menuItemsList.length; j++) {
                thisItemID = menuItemsList[j].getName();

                if (order.equalsIgnoreCase(thisItemID)) {
                    orderedItemsList[i] = menuItemsList[j];
                    i++;
                }

            }

        }

        // checkout 
        
        System.out.println("Thank you for placing your order!");
        System.out.print("You ordered a: ");
        for (int i = 0; i < itemTotal - 1; i++) {
            System.out.print(orderedItemsList[i].getName() + ", ");
        }
        System.out.println("and a " + orderedItemsList[orderedItemsList.length - 1].getName() +
                ".");

        for (int i = 0; i < orderedItemsList.length; i++) {
            total += orderedItemsList[i].getPrice();
        }
        System.out.println("Your total is: $" + total);
        System.out.println("Your order will be available shortly, have a great day " + customerName + "!");

        System.out.println(decorativeLine);
        scnr.close();

    }

}
