import java.awt.*;
class loginform
{
loginform()
{
Frame f=new Frame("loginform");
Label l1=new Label("username:");
Label l2=new Label("password:");
TextField t1=new TextField(20);
TextField t2=new TextField(20);
Button b1=new Button("submit");
f.setLayout(new FlowLayout());
f.add(l1);
f.add(l2);
f.add(t1);
f.add(t2);
}
public static void main(String args[])
{
loginform lf=new loginform();
}
}