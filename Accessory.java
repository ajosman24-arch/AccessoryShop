import java.util.ArrayList;
import java.util.Scanner;

class Accessory {

    // variables

    private int id;
    private String company;
    private int type; // 1: Mouse, 2: Keyboard, 3: Monitor, 4: Printer
    private int quantity;
    private double price;

    // constructor

    public Accessory(int id, String company, int type, int quantity, double price) {
        this.id = id;
        this.company = company;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
    }

    // Getter & Setter 

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

   
    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }


    public int getType() { return type; }
    public void setType(int type) { this.type = type; }


    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

  
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // display info method

    public void displayInfo() {
        String typeName = "";
        switch (type) {
            case 1: typeName = "Mouse"; break;
            case 2: typeName = "Keyboard"; break;
            case 3: typeName = "Monitor"; break;
            case 4: typeName = "Printer"; break;
            default: typeName = "Unknown";
        }
        System.out.println("ID: " + id + " | Company: " + company + " | Type: " + typeName + " | Quantity: " + quantity + " | Price: $" + price);
    }
}