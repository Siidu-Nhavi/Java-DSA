import javax.swing.*;

public class MyGui extends JFrame{
	MyGui(){
		setTitle("My first gui program");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("WELOCOME TO SWING !!");
		JButton button = new JButton("Click me!");
		JTextArea a = new JTextArea();
		JColorChooser c = new JColorChooser();
		
		panel.add(label);
		panel.add(button);
		panel.add(a);
		add(panel);
		
		
		setVisible(true);
	}
	
	public static void main(String args[]){
		new MyGui();
	}
}