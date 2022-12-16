package FoodOrdering;

import javax.swing.*;

public class FoodOrderGUI extends JFrame {
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton orderButton;
    private JCheckBox cBurger;
    private JCheckBox cSoftDrinks;
    private JCheckBox cSundae;
    private JCheckBox cTea;
    private JCheckBox cFries;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public static void main(String[] args) {
        FoodOrderGUI order = new FoodOrderGUI();
        order.setContentPane(order.panel1);
        order.setSize(440,500);
        order.setTitle("Food Ordering System");
        order.setDefaultCloseOperation(EXIT_ON_CLOSE);
        order.setVisible(true);
    }
}
