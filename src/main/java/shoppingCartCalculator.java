import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class shoppingCartCalculator {
    public static double calculateTotal(int price, int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select language: ");
        System.out.println("1. English");
        System.out.println("2. Finnish");
        System.out.println("3. Japanese");
        System.out.println("4. Swedish");

        int choice = scanner.nextInt();

        Locale locale;

        switch (choice) {
            case 1:
                locale = new Locale("en", "US");
                break;
            case 2:
                locale = new Locale("fi", "FI");
                break;
            case 3:
                locale = new Locale("ja", "JP");
                break;
            case 4:
                locale = new Locale("sv", "SE");
                break;
            default:
                System.out.println("Invalid choice. Defaulting to English (US)");
                locale = new Locale("en", "US");
                break;
        }

        ResourceBundle rb;

        try {
            rb = ResourceBundle.getBundle("messages", locale);
        } catch (Exception e) {
            System.out.println("Invalid choice. Defaulting to English (US)");
            rb = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        }

        System.out.println(rb.getString("enterNumberOfItems"));
        int n = scanner.nextInt();

        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.println(rb.getString("priceOfItem"));
            int price = scanner.nextInt();

            System.out.println(rb.getString("quantityOfItem"));
            int quantity = scanner.nextInt();

            total += calculateTotal(price, quantity);
        }

        System.out.println(rb.getString("totalCost") + total);
    }
}