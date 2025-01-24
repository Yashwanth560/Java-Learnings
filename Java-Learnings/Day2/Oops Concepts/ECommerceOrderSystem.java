class Customer {
    int customerId;
    String name;
    String address;

    public Customer(int customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }
}

class Order {
    int orderId;
    String orderDate;
    List<String> orderedItems;

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderedItems = new ArrayList<>();
    }

    public void addItem(String item) {
        orderedItems.add(item);
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId + ", Date: " + orderDate);
        System.out.println("Ordered Items: " + orderedItems);
    }
}

public class ECommerceOrderSystem {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Alice", "123 Main St");
        Order order = new Order(101, "2025-01-24");
        order.addItem("Laptop");
        order.addItem("Headphones");

        System.out.println("Customer: " + customer.name + ", Address: " + customer.address);
        order.displayOrderDetails();
    }
}
