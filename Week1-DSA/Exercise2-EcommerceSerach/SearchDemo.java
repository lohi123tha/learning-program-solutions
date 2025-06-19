import java.util.Arrays;
import java.util.Comparator;

public class SearchDemo {
    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products, String name) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = products[mid].productName.compareToIgnoreCase(name);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shampoo", "Health"),
            new Product(103, "Keyboard", "Electronics"),
            new Product(104, "Chair", "Furniture"),
            new Product(105, "Mouse", "Electronics")
        };
        Product result1 = linearSearch(products, "Chair");
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
        Product result2 = binarySearch(products, "Chair");
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}
