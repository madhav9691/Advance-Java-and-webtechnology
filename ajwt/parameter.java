import java.awt.*;
import java.applet.*;
public class parameter extends Applet
{
String name,str;
float sal,tax;
public void init()
{
name=getParameter("t1");
str=getParameter("t2");
sal=Float.parseFloat(str);
calculatetax(sal);
}
public void calculatetax(float sal)
{
 if(sal<=100000)
 tax=0.0f;
else if(sal<=200000)
 tax=sal*0.1f;
 }
public void paint(Graphics g)
{
g.drawString("Name :"+name,20,100);
g.drawString("Your salary :"+sal,20,120);
g.drawString("Paytax :"+tax,20,140);
}
}
/*<applet code="parameter.class" height=400 width=300>
<param name="t1" value="aditya">
<param name="t2" value=150000.50>
</applet>*/
