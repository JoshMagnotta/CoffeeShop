public class Coffee {
    private int itemID;
    private String itemName;
    private double itemPrice;

    public Coffee() {

    }

    public Coffee(int ID, String Name, double Price) {
        this.itemID = ID;
        this.itemName = Name;
        this.itemPrice = Price;
    }

    public int getItemID() {
        return itemID;
    }

    public String getName() {
        return itemName;
    }

    public double getPrice() {
        return itemPrice;
    }

    public String toString() {
        return "#" + itemID + " >> " + itemName + " >> $" + itemPrice;
    }

}
