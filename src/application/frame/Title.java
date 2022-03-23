package application.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.nio.charset.StandardCharsets;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import application.word.WordType;
import application.word.Word;
import application.word.Words;

public class Title extends JFrame implements ActionListener {
    private JLabel titleLabel = new JLabel();
    private JButton manageButton = new JButton();
    private JButton startButton = new JButton();

    public Title() {
        Font titleFont = new Font("Microsoft JhengHei UI", Font.BOLD, 36);
        Font subtitleFont = new Font("Microsoft JhengHei UI", Font.PLAIN, 24);

        titleLabel.setText("日本語の単語");
        titleLabel.setFont(titleFont);
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        manageButton.setText("管理單字");
        manageButton.setFont(subtitleFont);
        manageButton.setBackground(Color.WHITE);
        manageButton.addActionListener(this);

        startButton.setText("開始");
        startButton.setFont(subtitleFont);
        startButton.setBackground(Color.WHITE);
        startButton.addActionListener(this);
        
        Box hbox = new Box(BoxLayout.X_AXIS);
        Box vBox = new Box(BoxLayout.Y_AXIS);
        vBox.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        ImageIcon icon = new ImageIcon(getClass().getResource("../../resources/images/icon.png"));
        this.setIconImage(icon.getImage());
        this.setTitle("日本語の単語");
        this.setSize(360, 480);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout(20, 20));
        this.setResizable(false);
        
        hbox.add(manageButton);
        hbox.add(Box.createHorizontalStrut(20));
        hbox.add(startButton);
        vBox.add(titleLabel);
        vBox.add(Box.createVerticalStrut(20));
        vBox.add(hbox);
        this.add(vBox, BorderLayout.CENTER);
        this.pack(); // auto-size
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == manageButton) {
            setVisible(false);
            JFrame management = new Management();
            management.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    setVisible(true);
                    super.windowClosing(e);
                }
            });
        }
        if (e.getSource() == startButton) {
            
        }
    }
}
