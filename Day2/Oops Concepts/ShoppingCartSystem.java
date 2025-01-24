class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public void displayProduct() {
        System.out.println(name + " - $" + price + " x " + quantity);
    }
}

class Cart {
    List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Added: " + product.name);
    }

    public void removeProduct(String productName) {
        products.removeIf(product -> product.name.equalsIgnoreCase(productName));
        System.out.println("Removed: " + productName);
    }

    public void displayCart() {
        System.out.println("Your Cart:");
        for (Product product : products) {
            product.displayProduct();
        }
    }

    public void calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getTotalPrice();
        }
        System.out.println("Total Price: $" + total);
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addProduct(new Product("Laptop", 800, 1));
        cart.addProduct(new Product("Mouse", 20, 2));
        cart.displayCart();
        cart.calculateTotal();
        cart.removeProduct("Mouse");
        cart.displayCart();
        cart.calculateTotal();
    }
}
