package day3;
import javax.swing.JOptionPane;

public class Greeter {public Greeter() {
	// TODO Auto-generated constructor stub
}public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("do you like dogs?");
	JOptionPane.showMessageDialog(null, "nice");
	JOptionPane.showInputDialog("what's your name?");
	JOptionPane.showMessageDialog(null, "my name is mychal, but you can call me m-dizzle. ;)");
	JOptionPane.showInputDialog("what's your favorite color?");
	JOptionPane.showMessageDialog(null, "my favorite color is purple");
}
}
