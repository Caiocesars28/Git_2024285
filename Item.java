package SuperMarket.item;

//@author Caio Cesar - Student Number: 2024285.
// The Item class represents a general item in the supermarket.
// This class will serve as the superclass for specific types of items.

public class Item {
    
 // Common properties for all items
    protected String name;  // The name of the item
    protected double price; // The price of the item in euros

    // Construtor for the Item Class.
    // Initializes the item with a name and a price
    // the name  of the item.
    // the price of the item.
     
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // The displayInfo() method prints the item's details to the console.
    // This method will be overridden by subclasses to provide specific information.
    public void displayInfo() {
        System.out.println("Item: " + name);
        System.out.println("Price: €" + price);
    }
}

    