package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import IntroToArrayLists.GuestBook;

public class LogSearch implements ActionListener {
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	
	JFrame frame = new JFrame(); 
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Add Entry"); 
	JButton button2 = new JButton("Search by ID");
	JButton button3 = new JButton("View List"); 
	JButton button4 = new JButton("Remove Entry");
	HashMap<Integer, String> idNumbers = new HashMap<Integer, String>();
	
	public static void main(String[] args) {
		
		LogSearch log = new LogSearch(); 
		log.createUI();
	
	}
	
	void createUI() {
		
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		frame.setVisible(true);
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(button1)) {
			String id = JOptionPane.showInputDialog("Add an ID number: ");
			String n = JOptionPane.showInputDialog("Add a name: ");
			
			int idInt = Integer.parseInt(id);
			
			idNumbers.put(idInt, n);
			
		}

		if(e.getSource().equals(button2)) {
			String id = JOptionPane.showInputDialog("Search for an ID number: ");
			int idInt = Integer.parseInt(id);
			
			if (idNumbers.get(idInt) != null) {
				JOptionPane.showMessageDialog(null,"ID: " + idInt + " Name: " + idNumbers.get(idInt));
			} else {
				JOptionPane.showMessageDialog(null,"There is no entry for ID " + idInt + ". ");
			}
			
		}	
		
		if(e.getSource().equals(button3)) {
			
			String fullList = "";
			
			for(Integer i : idNumbers.keySet()) {
				fullList += "ID: " + i + " Name: " + idNumbers.get(i) + "\n";
			}
			
			JOptionPane.showMessageDialog(null, fullList);
			
		}
		
		if(e.getSource().equals(button4)) {
			String id = JOptionPane.showInputDialog("Remove an entry with ID: ");
			int idInt = Integer.parseInt(id);
			
			if (idNumbers.get(idInt) != null) {
				idNumbers.remove(idInt); 
			} else {
				JOptionPane.showMessageDialog(null,"There is no entry for ID " + idInt + ". ");
			}
			
		}
		
	}
	
	
}
