public class Main {

    public static void main(String[] args) {
        // Default Constructor called
        Product product1 = new Product();

        // Full Constructor called
        Product product2 = new Product(1, "Laptop", "Asus Laptop", 1500, 3, "Black");

        // Copy Constructor called
        Product product3 = new Product(product2);

    }
}
