package web;

import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

public class browser extends JFrame {
	//setting up everything
	private TextField field = new TextField();
	private JEditorPane display = new JEditorPane();
	private JScrollPane panee = new JScrollPane(display);// creating new scroll bar on editor pane
	
	public static void main(String agrs[]){
		browser file = new browser();
		file.frameHandler();
	}

	public void frameHandler() {
		// frame settings
		setTitle("Browser");
		setSize(1280,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false); 
		setLayout(null); 
		addComponentsToFrame(getContentPane());
				
	}
	public void addComponentsToFrame(Container pane){
		//putting it all together
		Insets insets = getInsets(); // location of the edges in a frame
		pane.add(field);
		pane.add(panee);
		
		Font font = new Font("Menlo", Font.PLAIN, 12);
		
		field.setFont(font);
		
		//separating the two borders. One for the web adress the other for the screen 
		field.setBounds(8- insets.left, 30 - insets.top, 1268, 20);
		panee.setBounds( 8- insets.left, 52 - insets.top, 1268, 830);
		
		actionListenerCalls();
	}
	private void actionListenerCalls(){
		field.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				loadData("http://" + e.getActionCommand()); // this addeds "http:" so we don't have to do it
			}
		});
		
		display.addHyperlinkListener(new HyperlinkListener(){
public void hyperlinkUpdate(HyperlinkEvent e) { // begin getting the url
				if(e.getEventType()== HyperlinkEvent.EventType.ACTIVATED){
					loadData(e.getURL().toString());
				}
			}
		});
		
		
	}
	private void loadData(String text){
		try{
			display.setPage(text);
		}catch(Exception e){
			System.out.println("NNOOOOO!!!");
		}
		}
	}
//}
