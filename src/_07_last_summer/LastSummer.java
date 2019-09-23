package _07_last_summer;

import javax.swing.JOptionPane;

public class LastSummer {
public static void main(String[] args) {
	String personName = JOptionPane.showInputDialog("What's your name?");
	String summerStalker =  "I know that you went to the beach last summer, "+ personName +"!";
	JOptionPane.showMessageDialog(null, summerStalker);
}
}
