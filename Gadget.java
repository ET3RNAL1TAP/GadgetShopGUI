// Gadget class represents electronic gadgets with various attributes.
class Gadget {
    // Attributes of the gadget
    private String model;// Stores the model of the gadget
    private double price;// Stores the price of the gadget
    private int weight;// Stores the weight of the gadget in grams
    private String size;// Stores the size of the gadget

    //Constructor to initialize the attributes of the gadget
    public Gadget(String model, double price, int weight, String size) {
        this.model = model;// Assigns the model
        this.price = price;// Assigns the price
        this.weight = weight;// Assigns the weight
        this.size = size;// Assigns the size
    }

    //Accessor method to retrieve the model of the gadget
    public String getModel() {
        return model;// Returns the model of the gadget
    }
    // Accessor method to retrieve the price of the gadget
    public double getPrice() {
        return price;// Returns the price of the gadget
    }

    public int getWeight() {// Accessor method to retrieve the weight of the gadget
        return weight;// Returns the weight of the gadget
    }
    // Accessor method to retrieve the size of the gadget
    public String getSize() {
        return size;// Returns the size of the gadget
    }

    // Method to display the details of the gadget
    public void display() {
     // Displays the model, price, weight, and size of the gadget   
        System.out.println("Model: " + model);
        System.out.println("Price: £" + price);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Size: " + size);
    }
}