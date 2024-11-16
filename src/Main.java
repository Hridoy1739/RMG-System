public class Main {
    public static void main(String[] args) {

        // IMPLEMENTATION FOR GARMENT CLASS.
        Garment dekoGarment = new Garment("number1","T-shirt", "Polo T-shirt","Availabe S,M,L, XL","Red, Gree, Blue, Black",1500.00,100);
dekoGarment.updateStock(50);
        System.out.println("After 2nd shifting, Quantity is: "+dekoGarment.stockQuantity);
        double discountedPrice = dekoGarment.calculateDiscountPrice(10);
        System.out.println("Discount Price: "+ discountedPrice);

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
    }
}