package GUIdesign;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class TextAnalyzer extends Frame implements ActionListener {

    // ------------------------------------------
    // Declare class variables that are accessible from all methods in the class
    // ------------------------------------------
   public JFrame frame = new JFrame();;
    JTextField textField;
    JButton button, button2;
    JLabel label;
    JButton fileButton;
    JFileChooser fc = new JFileChooser();
    JTextArea textArea = new JTextArea();
    JLabel statusLabel = new JLabel();
    public TextAnalyzer() {
       // JFrame frame = new JFrame(); // constructor

        // ------------------------------------------
        // Create a panel (container) to hold our components
        // ------------------------------------------
        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        panel.setLayout(new BorderLayout());
        frame.getContentPane().add(panel);

        // ------------------------------------------
        // adding buttons
        // ------------------------------------------
        button = new JButton("Pick a file");
        button.setPreferredSize(new Dimension(100, 30));
        button.addActionListener(this);
        panel.add(button, BorderLayout.PAGE_START);

        // ------------------------------------------
        // creating a text area
        // ------------------------------------------
        textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(false);
        panel.add(textArea);

        // ------------------------------------------
        // creating scroll
        // ------------------------------------------
        JScrollPane scroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        panel.add(scroll, BorderLayout.CENTER);
        JPanel statusPanel = new JPanel();

        // ------------------------------------------
        // creating status bar (fix later with file title and file size)
        // ------------------------------------------
        statusPanel.setBorder((Border) new BevelBorder(BevelBorder.LOWERED));
        frame.add(statusPanel, BorderLayout.SOUTH);
        statusPanel.setPreferredSize(new Dimension(frame.getWidth(), 16));
        statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.X_AXIS));
        statusPanel.add(statusLabel);

        // ------------------------------------------
        // Setting up the frame
        // ------------------------------------------

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ability to
                                                                // close frame
        frame.getContentPane().add(panel);
        frame.setSize(400, 300); // size of the frame
        frame.setVisible(true); // make the frame visible // everything must be
                                // done before this statement
  
        frame.setLocationRelativeTo(null);
    }

    public static void main(String args[]) {
        TextAnalyzer demo = new TextAnalyzer();
        System.out.println(demo);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        // ------------------------------------------
        // getting the text from text field
        // ------------------------------------------

        int returnVal = fc.showOpenDialog(frame);

        // ------------------------------------------
        // If file was really selected, do something with it
        // ------------------------------------------
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            // ------------------------------------------
            // Get the file the user selected
            // ------------------------------------------
            File file = fc.getSelectedFile();
            int words = 0;
				int lines = 0;
				int chars = 0;
			    double averageSen=0;
			    double average = 0;
            //-----------------------------------------
            // Calculating lines, words, and charcters count
            //-----------------------------------------
            try {
				Scanner in = new Scanner(file);
		     
				
			    // count occurrences
		     
		        while (in.hasNext()) {
		        	
		        	 String line = in.nextLine();
		           
		        	//----------------------------------
		        	lines++;
					   
					   for(int i=0;i<line.length();i++)
					    {
					        if(line.charAt(i)!=' ' && line.charAt(i)!='\n')
					        chars ++;
					       
					    }
					    words += new StringTokenizer(line, " ,").countTokens();
					    average= (chars*1.0/words);
					    averageSen = words/lines;
		        }
					 
				
					System.out.println("Average word length = " + average);
					System.out.println("Average sentence = " + averageSen);
		            System.out.println("Number of lines: " + lines);
		            System.out.println("Number of words: " + words);
		            System.out.println("Number of characters: " + chars);
		            
		            
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            
            Scanner input;
			try {
				input = new Scanner(file);
				 Map<String, Integer> wordCounts = new TreeMap<String, Integer>();
		            while (input.hasNext()) {
		                String next = input.next().toLowerCase();
		                if (!wordCounts.containsKey(next)) {
		                    wordCounts.put(next, 1);
		                } else {
		                    wordCounts.put(next, wordCounts.get(next) + 1);
		                }
		            }

		            //  report frequencies
		          	           
		            for (String word : wordCounts.keySet()) {
		                int count = wordCounts.get(word);
		                
		                    System.out.println(count + "\t" + word);
		            }
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
           
            String name = file.getName();
            frame.setTitle(file.getName());
            
            //---------------------------------------
            //getting size of the file
            //---------------------------------------
            double bytes= file.length();
            double kilobytes = (bytes/1024);
            
           
            String info = "file name: " + name +"   "+"size: "+kilobytes;
            statusLabel.setText(info);
            
            

            // ------------------------------------------
            // String builder
            // ----------- ------------------------------

            StringBuilder sb = new StringBuilder();
            // ------------------------------------------
            // Create a scanner to the file
            // ------------------------------------------

            Scanner input1;
            try {
                input1 = new Scanner(file);

                // ------------------------------------------
                // read text from file
                // ------------------------------------------
                while (input1.hasNext()) {
                    sb.append(input1.nextLine());
                    sb.append("\n");
                }
                System.out.println(input1);
                input1.close();
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            textArea.setText(sb.toString());
            // ------------------------------------------
            // Do something with the file path (display it, use it to open,
            // etc.)
            // ------------------------------------------
         
         

        } else {
            System.out.println("No file was selected");
        }

    }

}