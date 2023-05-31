package GUI;

import javax.swing.*;
import java.awt.*;

public class TimX extends JFrame {

    public TimX() {
        init();
        setVisible(true);
    }

    private JPanel[] jPanel;
    private JLabel[] jLabel;
    private JTextField[] jTextFields;
    private JButton[]  buttons;

    public void init(){
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        jPanel = new JPanel[10];
        jLabel = new JLabel[10];
        jTextFields = new JTextField[10];
        buttons = new JButton[10];
        for(int i = 0 ; i < 10; i++) {
            jPanel[i] = new JPanel();
            jLabel[i] = new JLabel();
            jTextFields[i] = new JTextField();
            buttons[i] = new JButton();
        }
        jPanel[0].setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        jPanel[0].setPreferredSize(new Dimension(500,300));
        setContentPane(jPanel[0]);

        jPanel[1].setPreferredSize(new Dimension(500,50));
        jPanel[0].add(jPanel[1]);

        jLabel[0].setPreferredSize(new Dimension(500,50));
        jLabel[0].setFont(new Font("Times New Roman", Font.BOLD, 16));
        jLabel[0].setHorizontalAlignment(SwingConstants.CENTER);
        jLabel[0].setText("Tính biểu thức S");
        jPanel[1].add(jLabel[0]);

        jPanel[2].setPreferredSize(new Dimension(500,50));
        jPanel[0].add(jPanel[2]);

        jLabel[1].setPreferredSize(new Dimension(100,50));
        jLabel[1].setFont(new Font("Times New Roman", Font.BOLD, 16));
        jLabel[1].setHorizontalAlignment(SwingConstants.CENTER);
        jLabel[1].setText("Nhap N");
        jPanel[2].add(jLabel[1]);

        jTextFields[0].setPreferredSize(new Dimension(300,35));
        jTextFields[0].setFont(new Font("Times New Roman", Font.BOLD, 16));
        jPanel[2].add(jTextFields[0]);

        jPanel[3].setPreferredSize(new Dimension(500,50));
        jPanel[0].add(jPanel[3]);

        jLabel[2].setPreferredSize(new Dimension(100,50));
        jLabel[2].setFont(new Font("Times New Roman", Font.BOLD, 16));
        jLabel[2].setHorizontalAlignment(SwingConstants.CENTER);
        jLabel[2].setText("Nhap X");
        jPanel[3].add(jLabel[2]);

        jTextFields[1].setPreferredSize(new Dimension(300,35));
        jTextFields[1].setFont(new Font("Times New Roman", Font.BOLD, 16));
        jPanel[3].add(jTextFields[1]);

        jPanel[4].setPreferredSize(new Dimension(500,50));
        jPanel[0].add(jPanel[4]);

        jLabel[3].setPreferredSize(new Dimension(100,50));
        jLabel[3].setFont(new Font("Times New Roman", Font.BOLD, 16));
        jLabel[3].setHorizontalAlignment(SwingConstants.CENTER);
        jLabel[3].setText("Ket Qua");
        jPanel[4].add(jLabel[3]);

        jTextFields[2].setPreferredSize(new Dimension(300,35));
        jTextFields[2].setFont(new Font("Times New Roman", Font.BOLD, 16));
        jPanel[4].add(jTextFields[2]);

        jPanel[5].setLayout(new FlowLayout(FlowLayout.CENTER,10,15));
        jPanel[5].setPreferredSize(new Dimension(700,50));
        jPanel[0].add(jPanel[5]);

        buttons[0].setPreferredSize(new Dimension(80,35));
        buttons[0].setBackground(new Color(0x70E149));
        buttons[0].setFont(new Font("Times New Roman", Font.BOLD, 16));
        buttons[0].setHorizontalAlignment(SwingConstants.CENTER);
        buttons[0].setText("Tinh");
        jPanel[5].add(buttons[0]);

        buttons[1].setPreferredSize(new Dimension(80,35));
        buttons[1].setBackground(new Color(0x70E149));
        buttons[1].setFont(new Font("Times New Roman", Font.BOLD, 16));
        buttons[1].setHorizontalAlignment(SwingConstants.CENTER);
        buttons[1].setText("Dong");
        jPanel[5].add(buttons[1]);


    }

    public static void main(String []args) {
        TimX timX = new TimX();
    }
}
