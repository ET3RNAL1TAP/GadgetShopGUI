import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Gadget Shop class represents a GUI application for managing gadgets.
public class GadgetShop extends JFrame implements ActionListener {
    // Components
    private JTextField modelField, priceField, weightField, sizeField, creditField, memoryField, phoneNumberField, durationField, downloadSizeField, displayNumberField;
    private JButton addMobileButton, addMP3Button, clearButton, displayAllButton, makeCallButton, downloadMusicButton;
    private JTextArea displayArea;
    private java.util.ArrayList<Gadget> gadgets;

    // Constructor to initialize the gadget shop GUI
    public GadgetShop() {
        gadgets = new java.util.ArrayList<>();// Initializes the list of gadgets

        // Setting up GUI
        setTitle("Gadget Shop");// Sets the title of the window
        setSize(500, 400);// Sets the size of the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Sets the default close operation
        setLayout(new GridLayout(0, 2));// Sets the layout of the frame
        // Initializing components(setting up textfields and buttons)
        modelField = new JTextField();
        priceField = new JTextField();
        weightField = new JTextField();
        sizeField = new JTextField();
        creditField = new JTextField();
        memoryField = new JTextField();
        phoneNumberField = new JTextField();
        durationField = new JTextField();
        downloadSizeField = new JTextField();
        displayNumberField = new JTextField();
        displayArea = new JTextArea();
        addMobileButton = new JButton("Add Mobile");
        addMP3Button = new JButton("Add MP3");
        clearButton = new JButton("Clear");
        displayAllButton = new JButton("Display All");
        makeCallButton = new JButton("Make A Call");
        downloadMusicButton = new JButton("Download Music");
        // Adding components to the frame
        add(new JLabel("Model:"));
        add(modelField);
        add(new JLabel("Price:"));
        add(priceField);
        add(new JLabel("Weight:"));
        add(weightField);
        add(new JLabel("Size:"));
        add(sizeField);
        add(new JLabel("Initial Credit:"));
        add(creditField);
        add(new JLabel("Initial Memory:"));
        add(memoryField);
        add(new JLabel("Phone Number:"));
        add(phoneNumberField);
        add(new JLabel("Duration:"));
        add(durationField);
        add(new JLabel("Download Size:"));
        add(downloadSizeField);
        add(new JLabel("Display Number:"));
        add(displayNumberField);
        add(addMobileButton);
        add(addMP3Button);
        add(makeCallButton);
        add(downloadMusicButton);
        add(displayAllButton);
        add(clearButton);
        add(new JScrollPane(displayArea));

        // Adding action listeners to buttons
        addMobileButton.addActionListener(this);
        addMP3Button.addActionListener(this);
        makeCallButton.addActionListener(this);
        downloadMusicButton.addActionListener(this);
        displayAllButton.addActionListener(this);
        clearButton.addActionListener(this);

        setVisible(true);// Sets the frame visible
    }

    // Method to read text field contents and return as a string
    private String getInputText(JTextField field) {
        return field.getText().trim();// Returns trimmed text from the text field
    }
    // Method to read text field contents and return as double
    private double getInputDouble(JTextField field) {
        try {
            return Double.parseDouble(getInputText(field));// Parses text from text field to double
        } catch (NumberFormatException e) {
            return -1;// Returns -1 if parsing fails
        }
    }
    // Method to read text field contents and return as integer
    private int getInputInt(JTextField field) {
        try {
            return Integer.parseInt(getInputText(field));// Parses text from text field to integer
        } catch (NumberFormatException e) {
            return -1;// Returns -1 if parsing fails
        }
    }

    // Method to handle button clicks
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addMobileButton) {
            // Extracting input values
            String model = getInputText(modelField);
            double price = getInputDouble(priceField);
            int weight = getInputInt(weightField);
            String size = getInputText(sizeField);
            int credit = getInputInt(creditField);
            // Checking if all required fields are filled
            if (!model.isEmpty() && price != -1 && weight != -1 && !size.isEmpty() && credit != -1) {
                // Creating and adding mobile gadget
                gadgets.add(new Mobile(model, price, weight, size, credit));
                JOptionPane.showMessageDialog(null, "Mobile added successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Please fill all fields correctly.");
            }
        } else if (e.getSource() == addMP3Button) {
            // Extracting input values
            String model = getInputText(modelField);
            double price = getInputDouble(priceField);
            int weight = getInputInt(weightField);
        }
    }
} 