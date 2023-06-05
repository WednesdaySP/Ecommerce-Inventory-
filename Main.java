import java.util.ArrayList;
import java.util.List;

abstract class Product {
    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void updateStock(int quantity) {
        stock += quantity;
    }

    public abstract void displayProductInfo();
}

class InventoryManagementSystem {
    private List<Product> products;

    public InventoryManagementSystem() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (product == null) {
            System.out.println("Invalid product.");
            return;
        }

        for (Product p : products) {
            if (p.getName().equals(product.getName())) {
                System.out.println("Product already exists.");
                return;
            }
        }

        products.add(product);
        System.out.println("Product added successfully.");
    }

    public void updateProductStock(String name, int quantity) {
        if (quantity <= 0) {
            System.out.println("Invalid quantity.");
            return;
        }

        for (Product product : products) {
            if (product.getName().equals(name)) {
                product.updateStock(quantity);
                System.out.println("Stock updated successfully.");
                return;
            }
        }

        System.out.println("Product does not exist.");
    }

    public void removeProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getName().equals(name)) {
                products.remove(i);
                System.out.println("Product removed successfully.");
                return;
            }
        }

        System.out.println("Product does not exist.");
    }

    public int getAvailableStock(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product.getStock();
            }
        }

        System.out.println("Product does not exist.");
        return -1;
    }
}

class Phone extends Product {
    private String brand;

    public Phone(String name, int stock, String brand) {
        super(name, stock);
        this.brand = brand;
    }

    @Override
    public void displayProductInfo() {
        System.out.println("Product: " + getName());
        System.out.println("Brand: " + brand);
        System.out.println("Stock: " + getStock());
    }
}

public class Main {
    public static void main(String[] args) {
        InventoryManagementSystem inventorySystem = new InventoryManagementSystem();

        // Add products
        Product iphone = new Phone("iPhone", 10, "Apple");
        inventorySystem.addProduct(iphone);

        Product samsung = new Phone("Samsung Galaxy", 5, "Samsung");
        inventorySystem.addProduct(samsung);

        // Update stock
        inventorySystem.updateProductStock("iPhone", -3); // Invalid quantity

        inventorySystem.updateProductStock("iPhone", 5); // Increase stock
        inventorySystem.updateProductStock("Samsung Galaxy", -2); // Decrease stock

        // Check stock
        int iphoneStock = inventorySystem.getAvailableStock("iPhone");
        System.out.println("iPhone stock: " + iphoneStock);

        int samsungStock = inventorySystem.getAvailableStock("Samsung Galaxy");
        System.out.println("Samsung Galaxy stock: " + samsungStock);

        // Remove product
        inventorySystem.removeProduct("Samsung Galaxy");

        // Display product info
        iphone.displayProductInfo();
    }
}
