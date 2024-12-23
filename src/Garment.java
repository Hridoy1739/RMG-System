public class Garment {

    public String id;
    public String name;
    public String description;
    public String size;
    public String color;
    public double price;
    public int stockQuantity;
    public Fabric fabric;

    public Garment(String id, String name, String description, String size, String color, double price, int stockQuantity,Fabric fabric){
        this.id = id;
        this.name = name;
        this.description = description;
        this.size = size;
        this.color = color;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }


    void updateStock(int quantity){
        this.stockQuantity += quantity;
    }


    double calculateDiscountPrice(double discountPercentage){
        return price - (price * discountPercentage / 100);
    }
}
