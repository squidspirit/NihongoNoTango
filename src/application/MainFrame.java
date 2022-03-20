package application;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainFrame extends JFrame {
    public MainFrame() {
        this.setTitle("日本語の単語");
        this.setSize(360, 480);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

        ImageIcon icon = new ImageIcon(getClass().getResource("../resources/icon.png"));
        this.setIconImage(icon.getImage());
    }
}
