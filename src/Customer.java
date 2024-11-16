

import java.util.ArrayList;
import java.util.List;

public class Customer {
    public String customerId;
    public String name;
    public String email;
    public String phone;
    private List<Order> orderHistory = new ArrayList<>();

    public Customer(String customerId, String name, String email, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void placeOrder(Order order) {

        orderHistory.add(order);
        System.out.println("Order Placed Successfully. Order ID: " + order.orderId);
    }

    public List<Order> viewOrders() {
        return orderHistory;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
}






