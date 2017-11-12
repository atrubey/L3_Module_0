package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel; 

public class GuestBook implements ActionListener {
	
	JFrame frame = new JFrame(); 
	JPanel panel = new JPanel();
	JButton button1 = new JButton("View Names"); 
	JButton button2 = new JButton("Add Names");
	ArrayList<String> names = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		GuestBook book = new GuestBook(); 
		book.createUI();
	
	}
	
	void createUI() {
		
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		
		frame.setVisible(true);
		frame.setSize(500, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(button2)) {
			String n = JOptionPane.showInputDialog("Add a name: ");
			names.add(n);
		}

		if(e.getSource().equals(button1)) {
			String output = ""; 
			
			for(int i = 0; i < names.size(); i++) {
				String s = names.get(i);
				output = output + "Guest #" + (i+1) + ": " + s + "\n";
			}
			
			JOptionPane.showMessageDialog(null, output);
		}
		
	}
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
