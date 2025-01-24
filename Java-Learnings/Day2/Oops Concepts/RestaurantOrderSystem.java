class MenuItem {
    String itemName;
    double itemPrice;
    String itemCategory;

    public MenuItem(String itemName, double itemPrice, String itemCategory) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCategory = itemCategory;
    }

    public void displayMenuItem() {
        System.out.println(itemName + " - $" + itemPrice + " (" + itemCategory + ")");
    }
}

class Restaurant {
    List<MenuItem> menu;

    public Restaurant() {
        menu = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (MenuItem item : menu) {
            item.displayMenuItem();
        }
    }

    public void takeOrder(String itemName, int quantity) {
        for (MenuItem item : menu) {
            if (item.itemName.equalsIgnoreCase(itemName)) {
                System.out.println("Order placed: " + itemName + " x " + quantity);
                System.out.println("Total Cost: $" + (item.itemPrice * quantity));
                return;
            }
        }
        System.out.println("Item not found in menu.");
    }
}

public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.addMenuItem(new MenuItem("Pizza", 12.99, "Main Course"));
        restaurant.addMenuItem(new MenuItem("Coke", 1.99, "Beverage"));
        restaurant.addMenuItem(new MenuItem("Ice Cream", 3.99, "Dessert"));

        restaurant.displayMenu();
        restaurant.takeOrder("Pizza", 2);
        restaurant.takeOrder("Coke", 3);
    }
}
