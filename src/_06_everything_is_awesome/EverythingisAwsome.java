package _06_everything_is_awesome;

import javax.swing.JOptionPane;

public class EverythingisAwsome {
public static void main(String[] args) {
	String x = JOptionPane.showInputDialog("What do you like");
	JOptionPane.showMessageDialog(null, x + " is/are awesome!");
}
}
