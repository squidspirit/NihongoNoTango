package application.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Management extends JFrame implements ActionListener {
    public Management() {
        ImageIcon icon = new ImageIcon(getClass().getResource("../../resources/images/icon.png"));
        this.setIconImage(icon.getImage());
        this.setTitle("日本語の単語 - 單字管理");
        this.setSize(360, 480);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout(20, 20));
        this.setResizable(false);

        // this.pack(); // auto-size
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
