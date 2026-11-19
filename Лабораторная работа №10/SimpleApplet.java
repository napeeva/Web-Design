import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class SimpleApplet extends Applet {
    public void init() {
        String color = getParameter("bgcolor");
        if (color != null) {
            setBackground(Color.decode(color));
        }
    }

    public void paint(Graphics g) {
        g.drawString("Привет из апплета!", 30, 50);
    }
}