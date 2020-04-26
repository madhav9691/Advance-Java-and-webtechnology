import java.io.*;
import java.awt.*;
import java.applet.*;
public class paramapplet extends Applet
{
String eno,ename;
double sal,tax;
public void init()
{
eno=getParameter("No");
ename=getParameter("Name");
sal=Double.parseDouble(getParameter("salary"));
if(sal<=250000)
tax=0.0;
else if(sal>250000&&sal<=500000)
tax=(sal*5)/100;
else
tax=(sal*10)/100;
}
public void paint(Graphics g)
{
g.drawString("Empno="+eno+"\n"+"Name="+ename,20,200);
g.drawString("Taxvalue="+String.valueOf(tax),100,100);
}
}
/*<applet code="paramapplet.class" width=300 height=300>
<param name="No" value="23">
<param name="Name" value="Ravali">
<param name="salary" value="300000">
</applet>*/