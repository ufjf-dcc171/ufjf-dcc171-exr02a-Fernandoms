package exr02a;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame {

    private final JLabel textIntroduceNumber = new JLabel("Primeiro número:");
    private final JTextField jtfFirstNumber = new JTextField(15);
    private final JLabel textIntroduceSecondNumber = new JLabel("Segundo Número");
    private final JTextField jtfSecondNumber = new JTextField(15);
    private final JLabel sum = new JLabel();
    
    private int n1;
    private int n2;

    public Janela() throws HeadlessException {
        super("Soma");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(textIntroduceNumber);
        add(jtfFirstNumber);
        add(textIntroduceSecondNumber);
        add(jtfSecondNumber);
        add(sum);
        jtfFirstNumber.addActionListener(new FirstNumberEnter());
        jtfSecondNumber.addActionListener(new SecondNumberEnter());
    }

    private class SecondNumberEnter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            n2 = Integer.parseInt(jtfSecondNumber.getText());
            sum.setText(String.valueOf(n1+n2));
        }
    }

    private class FirstNumberEnter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            n1 = Integer.parseInt(jtfFirstNumber.getText());
            jtfSecondNumber.requestFocus();
        }
    }

}
