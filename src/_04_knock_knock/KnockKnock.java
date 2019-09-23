package _04_knock_knock;

import javax.swing.JOptionPane;

public class KnockKnock {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Knock Knock!");
	String x = JOptionPane.showInputDialog("Type in a response");
	if(x.equals("who's there")) {
		JOptionPane.showMessageDialog(null, "Cow!");
		String y = JOptionPane.showInputDialog("Type in a response");
		if(y.equals("cow who"))
		{
			JOptionPane.showMessageDialog(null, "Cow Mooooooo!");
		}
	}
	else {
		JOptionPane.showMessageDialog(null, "that wasn't nice.");
	}
	}
}

