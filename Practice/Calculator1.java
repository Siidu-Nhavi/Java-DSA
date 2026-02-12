import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.script.*;
class Calculator1 extends JFrame
{
 JTextField display;
  public Calculator1()
  {
    setSize(300,450);
    setLocation(300,150);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false); 
    setLayout(null);
    display=new JTextField();
   display.setBounds(10,20,265,50);
   display.setHorizontalAlignment(SwingConstants.RIGHT);
   display.setEditable(false);
   add(display);
   // Buttons panel
    JPanel btnPanel = new JPanel();
    // Set size and position (x, y, width, height)
    btnPanel.setBounds(10, 90, 265, 300);
    // 4 rows x 4 columns (we may add more later)
    btnPanel.setLayout(new GridLayout(4, 4, 5, 5)); 
   // (rows, columns, horizontal gap, vertical gap)
   //Add panel to frame
   add(btnPanel);
   // Create button labels
   String[] btnNames = {"7", "8", "9", "/",
                     "4", "5", "6", "*",
                     "1", "2", "3", "-",
                     "C", "0", "=", "+"};

   // Loop to create and add buttons
   for (String name : btnNames) 
{
    JButton btn = new JButton(name);
    btn.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
    // Add action listener

    btn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String btnVal = e.getActionCommand();

            if (btnVal.equals("C")) {
                display.setText("");
            } 
        else if (btnVal.equals("=")) {
    try {
        // Evaluate the expression using ScriptEngine
        javax.script.ScriptEngineManager mgr = new 	javax.script.ScriptEngineManager();
        javax.script.ScriptEngine engine = 	mgr.getEngineByName("JavaScript");
        String result = engine.eval(display.getText()).toString();
        display.setText(result);
   	}
     catch (Exception ex) 
     {
        display.setText("Error");
     }
  }
            else {
                   display.setText(display.getText() + btnVal);
     
            }
        }
    });


    btnPanel.add(btn);
}


   setVisible(true);
  }
  public static void main(String agrs[])
  {
    new Calculator1();
  }
}
	