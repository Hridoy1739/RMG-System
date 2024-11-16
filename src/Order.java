import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

   public String orderId;
    public Date orderDate;
    public List<Garment> garments;
    public double totalAmount;

public Order(String orderId, Date orderDate){
      this.orderId = orderId;
      this.orderDate = orderDate;
      this.garments =new ArrayList<>();
      this.totalAmount = 0;

}
    void addGarment(Garment garment){
          this.garments.add(garment);
          this.totalAmount += garment.price;
    }

    double calculateTotalAmount(){
       double total = 0;
       for (Garment garment : garments) {
              total += garment.price;
      }
       return total;
    }
    void printOrderDetails(){
       System.out.println("Order ID: " + this.orderId);
       System.out.println("Order Date: " + this.orderDate);
       System.out.println("Garments in the order:");
          for (Garment garment : garments) {
              System.out.println("Garment ID: " + garment.id + ", Name: " + garment.name + ", Price: " + garment.price);
          }
       System.out.println("Total Amount: " + this.calculateTotalAmount());
    }
}
