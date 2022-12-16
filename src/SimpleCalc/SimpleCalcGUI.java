package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI() {
        lblResult.setEditable(false);
        lblResult.setFocusable(false);
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String text = String.format("%.2f", calculator());
                    lblResult.setText(text);
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(btnCompute, "Invalid Input. Please Input a Number!");
                }catch(ArithmeticException ex){
                    JOptionPane.showMessageDialog(btnCompute,"Invalid Input. Cannot Divide By Zero!");
                }
            }
        });
    }

    public double calculator(){
        double num1 = Integer.parseInt(tfNumber1.getText());
        double num2 = Integer.parseInt(tfNumber2.getText());
        String operation = (String) cbOperations.getSelectedItem();
        assert operation != null;
            if (operation.equals("+")) {
                return num1 + num2;
            } else if (operation.equals("-")) {
                return num1 - num2;
            } else if (operation.equals("*")) {
                return num1 * num2;
            } else if(num2 == 0 && operation.equals("/")){
                throw(new ArithmeticException());
            } else
        return num1 / num2;
    }
    public static void main(String[] args) {
        SimpleCalcGUI calc = new SimpleCalcGUI();
        calc.setContentPane(calc.panel1);
        calc.setSize(500,600);
        calc.setTitle("Simple Calculator");
        calc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calc.setVisible(true);
    }
}