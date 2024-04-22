import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class FileChooserExample_exp18 extends JFrame {

    public FileChooserExample_exp18() {
        setTitle("File Chooser Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button to open the file chooser
        JButton openButton = new JButton("Open File");
        openButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                
                // Set the current directory for the file chooser (optional)
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                
                // Show the file chooser dialog
                int result = fileChooser.showOpenDialog(FileChooserExample_exp18.this);
                
                // Process the selected file
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    JOptionPane.showMessageDialog(FileChooserExample_exp18.this, "Selected file: " + selectedFile.getAbsolutePath());
                }
            }
        });

        // Add the open button to the frame
        add(openButton);

        // Set frame size and visibility
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FileChooserExample_exp18::new);
    }
}
