import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// MP3 class represents MP3 players, a subclass of Gadget.
class MP3 extends Gadget {
    // Additional attribute specific to MP3 players
    private int availableMemory;// Stores the available memory of the MP3 player in MB

    // Constructor to initialize MP3 attributes
    public MP3(String model, double price, int weight, String size, int availableMemory) {
        super(model, price, weight, size);// Invokes the superclass constructor to initialize common attributes
        this.availableMemory = availableMemory;// Initializes the available memory specific to MP3
    }

    // Initializes the available memory specific to MP3
    public int getAvailableMemory() {
        return availableMemory;// Returns the available memory of the MP3 player
    }

    // Method to download music
    public void downloadMusic(int memoryRequired) {
        // Checks if there is enough memory to download music
        if (memoryRequired <= availableMemory)
            availableMemory -= memoryRequired;// Decreases the available memory after downloading
        else
            JOptionPane.showMessageDialog(null, "Not enough memory to download.");// Displays a message if there's not enough memory
    }

    // Method to delete music from the MP3 player and free up memory
    public void deleteMusic(int memoryFreed) {
        availableMemory += memoryFreed;// Increases the available memory after deleting music
    }

    // Display method to show MP3 player details, including available memory
    @Override
    public void display() {
        super.display();// Calls the superclass display method to display common gadget details
        System.out.println("Available Memory: " + availableMemory + " MB");// Displays available memory specific to MP3
    }
}