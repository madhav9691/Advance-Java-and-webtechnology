import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
/*<applet code="treej.class" width=400 height=400></applet>*/
public class treej extends JApplet
{
 JTree t;
JTextField j;
public void init()
{
Container c=getContentPane();
c.setLayout(new BorderLayout());
DefaultMutableTreeNode top=new DefaultMutableTreeNode("Various Options");
DefaultMutableTreeNode x=new DefaultMutableTreeNode("s");
top.add(x);
DefaultMutableTreeNode x1=new DefaultMutableTreeNode("s1");
x.add(x1);
DefaultMutableTreeNode x2=new DefaultMutableTreeNode("s2");
x.add(x2);
DefaultMutableTreeNode y=new DefaultMutableTreeNode("p");
top.add(y);
DefaultMutableTreeNode y1=new DefaultMutableTreeNode("p1");
y.add(y1);
DefaultMutableTreeNode y2=new DefaultMutableTreeNode("p2");
y.add(y2);
JTree t=new JTree(top);
int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
JScrollPane jsp=new JScrollPane(t,v,h);
c.add(jsp,BorderLayout.CENTER);
j=new JTextField(20);
c.add(j,BorderLayout.SOUTH);
t.addMouseListener(new MouseAdapter()
 {
  public void mouseClicked(MouseEvent me)
   {
    doMouseClicked(me);
   }
 });
}
void doMouseClicked(MouseEvent me)
 {
  TreePath tp=t.getPathForLocation(me.getX(),me.getY());
  if(tp!=null)
  j.setText(tp.toString());
  else
  j.setText(" ");
}
}