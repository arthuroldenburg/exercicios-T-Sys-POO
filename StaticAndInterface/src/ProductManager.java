import java.util.ArrayList;

public class ProductManager {
    private static ArrayList<Product> products = new ArrayList<>();


    public static void addProduct(Product product) {
        products.add(product);
    }

    public static void removeProduct(Product product) {
        products.remove(product);
    }

    public static void displayAllProducts() {
        for (Product product : products) {
            System.out.println("Product Name: " + product.name + " Price: " + product.price);
        }
    }

}
