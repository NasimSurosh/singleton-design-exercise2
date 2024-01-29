package linkesList;

import java.util.LinkedList;

class GroceryItem {
    String name;
    double price;
    public GroceryItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
class GroceryList {
    LinkedList<GroceryItem> itemList = new LinkedList<>();
    public void addItem(String name, double price) {
        GroceryItem item = new GroceryItem(name, price);
        itemList.add(item);
    }
    public void displayList() {
        System.out.println("Grocery List:");
        for (int i = 0; i < itemList.size(); i++) {
            GroceryItem item = itemList.get(i);
            System.out.println((i + 1) + ". " + item.name +
                    " - $" + item.price);
        }
    }
}
public class Assignment1 {

    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();
        groceryList.addItem("Malako", .95);
        groceryList.addItem("Milk", 2.49);
        groceryList.addItem("Bread", 2.05);
        System.out.println("Initial Grocery List:");
        groceryList.displayList();
    }
}