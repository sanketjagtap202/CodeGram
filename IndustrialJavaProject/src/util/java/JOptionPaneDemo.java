package util.java;

import javax.swing.JOptionPane;

public class JOptionPaneDemo {

	public static void main(String[] args) {
		
		
		String message;
		
		message = JOptionPane.showInputDialog("Enter your message");
		
		JOptionPane.showMessageDialog(null, message);

	}

}
