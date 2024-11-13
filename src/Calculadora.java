import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JButton btn0;
    private JButton btn1;
    private JButton btnMais;
    private JButton btn2;
    private JButton btn3;
    private JButton btnSomar;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btnDiminui;
    private JButton btnLimpar;
    private JButton btnDiv;
    private JButton btnMultiplicacao;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JPanel panelMain;
    private JTextField txtTela;
    private String expressao = "";


    public Calculadora() {


        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtTela.setText(txtTela.getText() + 0);
            }
        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtTela.setText(txtTela.getText() + 1);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            txtTela.setText(txtTela.getText() + 2);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            txtTela.setText(txtTela.getText() + 3);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtTela.setText(txtTela.getText() + 4);
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtTela.setText(txtTela.getText() + 5);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtTela.setText(txtTela.getText() + 6);
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtTela.setText(txtTela.getText() + 7);
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtTela.setText(txtTela.getText() + 8);
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtTela.setText(txtTela.getText() + 9);
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            expressao += "/";
            txtTela.setText(expressao);
            }
        });
        btnMultiplicacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            expressao += "*";
            txtTela.setText(expressao);
            }
        });
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expressao = "";
                txtTela.setText("");;
            }
        });
        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnDiminui.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expressao += "-";
            }
        });
        btnMais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expressao += "+";
            }
        });
        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
    public static void main(String[] args) {

        JFrame frame = new JFrame("Minha Caluculadora");
        frame.setContentPane(new Calculadora().panelMain);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
