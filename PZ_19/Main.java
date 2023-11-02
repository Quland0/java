import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    public static void createGUI() {
        JFrame frame = new JFrame("Q test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("some text");
        frame.getContentPane().add(label);
        frame.setPreferredSize(new Dimension(1000, 680));

        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createGUI();
            }
        });
    }
}
