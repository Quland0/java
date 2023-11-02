import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class ContentPaneReplace extends JFrame {
    private static final long serialVersionID = 1L;

    public ContentPaneReplace(){
        super("test3");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contens = new JPanel();
        contens.add(new JButton("спасти девушку"));
        contens.add(new JButton("спасти бабки"));
        setContentPane(contens);
        setSize(500, 300);
        setVisible(true);


    }
}
