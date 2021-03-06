import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window2 extends JFrame implements ActionListener{
 private Container pane;
 private JButton b;
 private JLabel l;
 private JTextField t;
 private JCheckBox c;

    public Window2() {
 this.setTitle("C to F converter");
 this.setSize(1200,8000);
 this.setLocation(100,100);
 this.setDefaultCloseOperation(EXIT_ON_CLOSE);


 pane = this.getContentPane();
 pane.setLayout(new FlowLayout());

 b = new JButton("All your degree are belong to us.");
 b.setActionCommand("x");
 b.addActionListener(this);
 l = new JLabel("Temperature: ",null,JLabel.CENTER);
 t = new JTextField(12);
 c = new JCheckBox("F to C");
 pane.add(l);
 pane.add(b);
 pane.add(t);
 pane.add(c);
 }

    public void actionPerformed(ActionEvent e){
	if(c.isSelected()){
	    if(t.getText().equals("")){
		t.setText("0");}
	    int C = Integer.parseInt(t.getText());
	    t.setText("" + ((C - 32)*5/9));}
	    else{
		if(t.getText().equals("")){
		    t.setText("0");}
		    int C = Integer.parseInt(t.getText());
		    t.setText("" + ((C * 9/5) + 32));}}

    public static void main(String[] args) {
        Window2 g = new Window2();
        g.setVisible(true);
    }
}
