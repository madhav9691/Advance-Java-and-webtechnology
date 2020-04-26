import java.awt.*;
import java.awt.event.*;
class MyButton extends Frame implements ActionListener
{
Button b1,b2;
MyButton()
{
setLayout(null);
b1=new Button("red");
b2=new Button("yellow");
b1.setBounds(100,50,75,40);
b2.setBounds(100,120,75,40);
b1.addActionListener(this);
b2.addActionListener(this);
add(b1);
add(b2);
addWindowListener(new WindowAdapter()
 {
  public void windowClosing(WindowEvent we)
   {
     System.exit(0);
    }
 });
}
public void actionPerformed(ActionEvent ae)
 {
String str=ae.getActionCommand();
if(str.equals("red"))
 setBackground(Color.red);
if(str.equals("yellow"))
 setBackground(Color.yellow);
}
public static void main(String args[])
 {
 MyButton ob=new MyButton();
 ob.setSize(500,200);
 ob.setTitle("Buttons...!");
 ob.setVisible(true);
 }
}