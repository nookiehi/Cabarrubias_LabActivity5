package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cSoftDrinks;
    private JCheckBox cSundae;
    private JCheckBox cTea;
    private JCheckBox cFries;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public FoodOrderGUI() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String price = String.format("%.2f",price());
                JOptionPane.showMessageDialog(panel1,"The total price is Php " + price);
            }
        });
    }
    public double price(){
        double price = 0;
        if(cPizza.isSelected()){
            price += 100;
        }
        if(cBurger.isSelected()){
            price += 80;
        }
        if(cFries.isSelected()){
            price += 65;
        }
        if(cSoftDrinks.isSelected()){
            price += 55;
        }
        if(cTea.isSelected()){
            price += 50;
        }
        if(cSundae.isSelected()){
            price += 40;
        }
        if(rbNone.isSelected()){
            price -= 0;
        }else if(rb5.isSelected()){
            price -= 0.05 * price;
        }else if(rb10.isSelected()){
            price -= 0.10 * price;
        }else if(rb15.isSelected()){
            price -= 0.15 * price;
        }
        return price;
    }

    public static void main(String[] args) {
        FoodOrderGUI order = new FoodOrderGUI();
        order.setContentPane(order.panel1);
        order.setSize(440,500);
        order.setTitle("Food Ordering System");
        order.setDefaultCloseOperation(EXIT_ON_CLOSE);
        order.setVisible(true);
    }
}
