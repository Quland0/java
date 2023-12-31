import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;

class Figure extends JComponent {
    private static final long serialVersionUID = 1L;
    private Color color;
    private int type;
    private String text;
    Figure(Color color, int type, String text){
        this.color = color;
        this.type = type;
        this.text = text;
        setOpaque(false);
    }
    public void paintComponent(Graphics g){
        g.setColor(color);
        switch (type) {
            case 0:
                g.fillOval(0, 0, 90, 90);
                break;

            case 1:
                g.clearRect(0, 0, 130, 80);
                break;
        }
        g.setColor(Color.yellow);
        g.drawString(text, 10, 35);
    }

}
