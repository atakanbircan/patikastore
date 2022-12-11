import java.util.UUID;

public abstract class Product {
    private String id= UUID.randomUUID().toString();
    private int price;
    private String discount;
    private int stock;
    private String productName;
    private String productBrand;
    int ram;
    int storage;
    double screenSize;

    String color;

    int battery;



    public Product(int price, String discount, int stock, String productName, String productBrand, int ram,
                   int storage, double screenSize) {

        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.productName = productName;
        this.productBrand = productBrand;
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }
    public Product(int price, String discount, int stock, String productName, String productBrand, int ram,
                   int storage, double screenSize,String color,int battery){
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.productName = productName;
        this.productBrand = productBrand;
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
        this.color=color;
        this.battery=battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    //employees.removeIf(e -> e.getId().equals(id));
    public abstract void addProduct();





}
