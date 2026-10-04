public class Sale {

    // Sell Accessory

    public void sell(Accessory accessory, int quantity) {

        // Check if quantity is valid
        if (quantity <= 0) {
            System.out.println("Invalid quantity.");
            return;
        }

        // Check if requested quantity is available
        if (quantity > accessory.getQuantity()) {

            System.out.println("Not enough quantity available.");

            return;
        }

        // Calculate total price
        double totalPrice = quantity * accessory.getPrice();

        // Update stock
        accessory.setQuantity(
                accessory.getQuantity() - quantity);

        // Display sale information
        System.out.println("\n===== Sale Completed =====");

        System.out.println("Accessory ID: " + accessory.getId());

        System.out.println("Quantity Sold: " + quantity);

        System.out.println("Unit Price: $" + accessory.getPrice());

        System.out.println("Total Price: $" + totalPrice);

        System.out.println("Remaining Quantity: " + accessory.getQuantity());
    }
}