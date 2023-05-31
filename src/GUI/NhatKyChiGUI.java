package GUI;

import BUS.NhatKyChiBUS;
import DTO.NhatKyChiDTO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;


public class NhatKyChiGUI extends  JFrame{
    private JPanel[] jPanel;
    private JLabel[] jLabel;
    private JTextField[] jTextFields;
    private JButton[]  buttons;

    public NhatKyChiGUI() {
        init();
        setVisible(true);
    }

    public void init(){
        setSize(500,450);
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
        jPanel[0].setPreferredSize(new Dimension(500,450));
        setContentPane(jPanel[0]);

        jPanel[1].setPreferredSize(new Dimension(500,50));
        jPanel[0].add(jPanel[1]);

        jLabel[0].setPreferredSize(new Dimension(500,50));
        jLabel[0].setFont(new Font("Times New Roman", Font.BOLD, 16));
        jLabel[0].setHorizontalAlignment(SwingConstants.CENTER);
        jLabel[0].setText("Nhat Ky Thu Chi");
        jPanel[1].add(jLabel[0]);

        jPanel[2].setPreferredSize(new Dimension(500,50));
        jPanel[0].add(jPanel[2]);

        jLabel[1].setPreferredSize(new Dimension(100,50));
        jLabel[1].setFont(new Font("Times New Roman", Font.BOLD, 16));
        jLabel[1].setHorizontalAlignment(SwingConstants.CENTER);
        jLabel[1].setText("ID");
        jPanel[2].add(jLabel[1]);

        jTextFields[0].setPreferredSize(new Dimension(300,35));
        jTextFields[0].setFont(new Font("Times New Roman", Font.BOLD, 16));
        jPanel[2].add(jTextFields[0]);

        jPanel[3].setPreferredSize(new Dimension(500,50));
        jPanel[0].add(jPanel[3]);

        jLabel[2].setPreferredSize(new Dimension(100,50));
        jLabel[2].setFont(new Font("Times New Roman", Font.BOLD, 16));
        jLabel[2].setHorizontalAlignment(SwingConstants.CENTER);
        jLabel[2].setText("Ngay");
        jPanel[3].add(jLabel[2]);

        jTextFields[1].setPreferredSize(new Dimension(300,35));
        jTextFields[1].setFont(new Font("Times New Roman", Font.BOLD, 16));
        jPanel[3].add(jTextFields[1]);

        jPanel[4].setPreferredSize(new Dimension(500,50));
        jPanel[0].add(jPanel[4]);

        jLabel[3].setPreferredSize(new Dimension(100,50));
        jLabel[3].setFont(new Font("Times New Roman", Font.BOLD, 16));
        jLabel[3].setHorizontalAlignment(SwingConstants.CENTER);
        jLabel[3].setText("Muc Chi");
        jPanel[4].add(jLabel[3]);

        jTextFields[2].setPreferredSize(new Dimension(300,35));
        jTextFields[2].setFont(new Font("Times New Roman", Font.BOLD, 16));
        jPanel[4].add(jTextFields[2]);

        jPanel[5].setPreferredSize(new Dimension(500,50));
        jPanel[0].add(jPanel[5]);

        jLabel[4].setPreferredSize(new Dimension(100,50));
        jLabel[4].setFont(new Font("Times New Roman", Font.BOLD, 16));
        jLabel[4].setHorizontalAlignment(SwingConstants.CENTER);
        jLabel[4].setText("So Tien");
        jPanel[5].add(jLabel[4]);

        jTextFields[3].setPreferredSize(new Dimension(300,35));
        jTextFields[3].setFont(new Font("Times New Roman", Font.BOLD, 16));
        jPanel[5].add(jTextFields[3]);

        jPanel[6].setPreferredSize(new Dimension(500,50));
        jPanel[0].add(jPanel[6]);

        jLabel[5].setPreferredSize(new Dimension(100,50));
        jLabel[5].setFont(new Font("Times New Roman", Font.BOLD, 16));
        jLabel[5].setHorizontalAlignment(SwingConstants.CENTER);
        jLabel[5].setText("Ghi chu");
        jPanel[6].add(jLabel[5]);

        jTextFields[4].setPreferredSize(new Dimension(300,35));
        jTextFields[4].setFont(new Font("Times New Roman", Font.BOLD, 16));
        jPanel[6].add(jTextFields[4]);


        jPanel[7].setPreferredSize(new Dimension(500,50));
        jPanel[0].add(jPanel[7]);

        jLabel[6].setPreferredSize(new Dimension(100,50));
        jLabel[6].setFont(new Font("Times New Roman", Font.BOLD, 16));
        jLabel[6].setHorizontalAlignment(SwingConstants.CENTER);
        jLabel[6].setText("Tong Muc Chi");
        jPanel[7].add(jLabel[6]);

        jTextFields[5].setPreferredSize(new Dimension(300,35));
        jTextFields[5].setFont(new Font("Times New Roman", Font.BOLD, 16));
        jPanel[7].add(jTextFields[5]);

        jPanel[8].setLayout(new FlowLayout(FlowLayout.CENTER,10,15));
        jPanel[8].setPreferredSize(new Dimension(700,50));
        jPanel[0].add(jPanel[8]);

        buttons[0].setPreferredSize(new Dimension(140,35));
        buttons[0].setBackground(new Color(0x70E149));
        buttons[0].setFont(new Font("Times New Roman", Font.BOLD, 16));
        buttons[0].setHorizontalAlignment(SwingConstants.CENTER);
        buttons[0].setText("Them");
        buttons[0].addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent mouseEvent) {
                nhatKyChiDTO = new NhatKyChiDTO(jTextFields[0].getText(), jTextFields[1].getText(), Double.parseDouble(jTextFields[2].getText()),
                        Double.parseDouble(jTextFields[3].getText()), jTextFields[4].getText());
                try {
                    nhatKyChiBUS = new NhatKyChiBUS();
                    nhatKyChiBUS.updateNhatKyCHi(nhatKyChiDTO);
                } catch (SQLException e) {

                }
            }
        });
        jPanel[8].add(buttons[0]);

        buttons[1].setPreferredSize(new Dimension(140,35));
        buttons[1].setBackground(new Color(0x70E149));
        buttons[1].setFont(new Font("Times New Roman", Font.BOLD, 16));
        buttons[1].setHorizontalAlignment(SwingConstants.CENTER);
        buttons[1].setText("Tong Muc Chi");
        jPanel[8].add(buttons[1]);


    }

    private NhatKyChiDTO nhatKyChiDTO;
    private NhatKyChiBUS nhatKyChiBUS;

    public static void main(String []args) {
        NhatKyChiGUI nhatKyChiGUI = new NhatKyChiGUI();
    }
}
