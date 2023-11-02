import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.Color;


public class JLayeredPaneTest extends JFrame{
    private static final long serialVersionUID = 1L;
    public JLayeredPaneTest(){
        super("test 2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();

        Figure figure1 = new Figure(Color.orange, 0, "Figure redddddxd");
        Figure figure2 = new Figure(Color.green, 0, "figure white");
        Figure figure3 = new Figure(Color.cyan, 0, "figure берюзовый");

        figure1.setBounds(10, 40, 120, 120);
        figure2.setBounds(60, 120, 160, 180);
        figure3.setBounds(90, 55, 250, 180);

        lp.add(figure1, JLayeredPane.POPUP_LAYER);
        lp.add(figure2, JLayeredPane.PALETTE_LAYER);
        lp.add(figure3, JLayeredPane.PALETTE_LAYER);

        lp.setPosition(figure3, 0);
        setSize(800, 800);
        setVisible(true);
    }
}
