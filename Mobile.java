import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// Mobile class represents mobile phones, a subclass of Gadget.
class Mobile extends Gadget {
    // Additional attribute specific to mobile phones
    private int callingCredit;// Stores the calling credit of the mobile phone in minutes

    // Constructor to initialize Mobile attributes
    public Mobile(String model, double price, int weight, String size, int callingCredit) {
        super(model, price, weight, size);// Invokes the superclass constructor to initialize common attributes
        this.callingCredit = callingCredit;// Initializes the calling credit specific to Mobile
    }

    // Accessor method to retrieve the calling credit of the mobile phone
    public int getCallingCredit() {
        return callingCredit;// Returns the calling credit of the mobile phone
    }

    // Method to add calling credit to the mobile phone
    public void addCallingCredit(int credit) {
        
        if (credit > 0)
            callingCredit += credit;// Adds the credit to the calling credit
        else
            JOptionPane.showMessageDialog(null, "Please enter a positive amount for credit.");// Displays a message if the credit amount is not positive
    }

    // Method to make a phone call from the mobile phone
    public void makeCall(String phoneNumber, int duration) {
        // Checks if there is enough calling credit to make the call
        if (callingCredit >= duration) {
            JOptionPane.showMessageDialog(null, "Calling " + phoneNumber + " for " + duration + " minutes.");// Displays a message indicating the call
            callingCredit -= duration;// Deducts the call duration from the calling credit
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient credit to make the call.");// Displays a message if there's insufficient credit
        }
    }

    // Display method to show mobile phone details, including calling credit
    @Override
    public void display() {
        super.display();// Calls the superclass display method to display common gadget details
        System.out.println("Calling Credit: " + callingCredit + " minutes");// Displays calling credit specific to Mobile

    }
}