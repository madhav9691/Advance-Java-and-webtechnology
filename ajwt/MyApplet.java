import java.applet.Applet;
import java.awt.*;
public class MyApplet extends Applet
{
String msg="";
public void init()
{
msg+="init";
}
public void start()
{
msg+=" start";
}
public void paint(Graphics g)
{
 g.drawString(msg,10,100);
}
public void stop()
{
 msg+=" stop";
}
public void destroy()
{
 msg+=" destroy";
}
}
/*<applet code="MyApplet.class" width=600 height=450>
</applet>*/
