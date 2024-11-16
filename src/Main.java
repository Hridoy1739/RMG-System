import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Creating Fabric instance (to be passed as the last argument in Garment constructor)
        Fabric fabric1 = new Fabric();
        fabric1.id = "1001";
        fabric1.type = "Silk A1 Grade";
        fabric1.color = "Red, Green, Blue";
        fabric1.pricePerMeter = 100;

        // IMPLEMENTATION FOR GARMENT CLASS.
        Garment dekoGarment = new Garment("number1", "T-shirt", "Polo T-shirt", "Available S,M,L, XL", "Red, Green, Blue, Black", 1500.00, 100, fabric1);
        dekoGarment.updateStock(50);
        System.out.println("\n");
        System.out.println("After 2nd shifting, Quantity is: " + dekoGarment.stockQuantity);
        double discountedPrice = dekoGarment.calculateDiscountPrice(10);
        System.out.println("Discount Price: " + discountedPrice);
        System.out.println("\n");

        //IMPLEMENTATION FOR FABRIC CLASS
        Fabric fabric = new Fabric();
        fabric.id = "1001";
        fabric.type = "Silk A1 Grade";
        fabric.color = "Red, White, Black and Blue";
        fabric.pricePerMeter = 100;

        System.out.println("Fabric Details:");
        System.out.println("Fabric ID: " + fabric.id);
        System.out.println("Fabric Type: " + fabric.type);
        System.out.println("Fabric Color Options: " + fabric.color);
        System.out.println("Price Per Meter: " + fabric.pricePerMeter);

        double fabricCost = fabric.calculateCost(50);
        System.out.println("Cost for 10 meters: " + fabricCost);
        System.out.println("\n");


        //SUPPLIER CLASS IMPLEMENTATION
        Supplier supplier = new Supplier();
        supplier.id = "1";
        supplier.name = "Md. Shanawaz Fahim Hridoy";
        supplier.contactInfo = "Mobile: +88018 6077 1414";

        Fabric fabric02 = new Fabric();
        fabric02.id = "1002";
        fabric02.type = "Cotton A1 Grade";
        fabric02.color = "Red, White, Black and Blue";
        fabric02.pricePerMeter = 150.0;
        supplier.addFabric(fabric);
        System.out.println("Supplier: \n" + supplier.name + ",\n " + supplier.contactInfo);

        System.out.println("\nFabrics Supplied:");
        for (Fabric f : supplier.getSuppliedFabrics()) {
            System.out.println("Fabric ID: " + f.id);
            System.out.println("Fabric Type: " + f.type);
            System.out.println("Fabric Color Options: " + f.color);
            System.out.println("Price Per Meter: " + f.pricePerMeter);
        }

        System.out.println("\n");
        Date orderDate = Date.from(ZonedDateTime.now().toInstant());
        Garment garment1 = new Garment("G001", "T-shirt", "Polo T-shirt", "Available S,M,L, XL", "Red, Green", 1500.00, 50, fabric1);
        Garment garment2 = new Garment("G002", "Pants", "Casual Pants", "Available M,L, XL", "Black, Blue", 1200.00, 30, fabric1);
        Order order = new Order("1", orderDate);
        order.addGarment(garment1);
        order.addGarment(garment2);
        order.printOrderDetails();
    }
}
