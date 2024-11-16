public class Main {
    public static void main(String[] args) {
        Garment dekoGarment = new Garment("number1","T-shirt", "Polo T-shirt","Availabe S,M,L, XL","Red, Gree, Blue, Black","500.00","100");
dekoGarment.updateStock(50);
        System.out.println("After 2nd shifting, Quantity is: "+dekoGarment.stockQuantity);
        double discountedPrice = dekoGarment.calculateDiscountPrice(10);
        System.out.println("Discount Price: "+ discountedPrice);
    }
}