package GUIdesign; 
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class PushButtonDemo implements ActionListener
{
	// Declare class variables that are accessible from all methods in the class
	JFrame frame;
	JTextField textField;
	JButton button;
	JButton fileButton;
	JFileChooser fc = new JFileChooser();

	public PushButtonDemo()
	{
		// Declare a new push button
		button = new JButton("DO NOT PUSH THIS BUTTON");
		button.addActionListener(this);

		fileButton = new JButton("Pick a file");
		fileButton.addActionListener(this);

		// Create a text field and set its width
		textField = new JTextField("This is some random text", 20);

		// Create a panel (container) to hold our components
		JPanel panel = new JPanel();
		panel.add(textField);
		panel.add(button);
		panel.add(fileButton);

		// Create the application frame
		frame = new JFrame("Push Button Demo");

		// Set a reasonable initial size of the frame
		frame.setSize(300,  100);

		// Add the panel to the "content pane" of the frame
		frame.getContentPane().add(panel, BorderLayout.CENTER);

		// Set what happens when the user clicks the X in the upper right
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Show the frame on the screen
		frame.setVisible(true);
	}

	public static void main(String[] args)
	{
		// Instantiate our class
		PushButtonDemo demo = new PushButtonDemo();
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// What was pressed?
		//System.out.println(arg0.getSource()); // commented out

		// Get the text from the text field and button
		String message = textField.getText();
		String buttonText = button.getText();

		// Did the user click on the first button?
		if (arg0.getSource() == button)
		{
			// Pop up the text from the message
			JOptionPane.showMessageDialog(frame, message);
		}
		// Did the user click on the other button?
		else
		{
			// Pop open the file chooser
			int returnVal = fc.showOpenDialog(frame);

			// If file was really selected, do something with it
			if (returnVal == JFileChooser.APPROVE_OPTION)
			{
				// Get the file the user selected
				File file = fc.getSelectedFile();

				// Do something with the file path (display it, use it to open, etc.)
				System.out.println(file.getPath());
			}
			else
			{
				System.out.println("No file was selected");
			}
		}
	}

}
