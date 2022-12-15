package LeapYear;

import javax.swing.*;
import java.awt.*;

public class LeapYearGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public static void main(String[] args){
        LeapYearGUI gui = new LeapYearGUI();
        gui.setContentPane(gui.panel1);
        gui.setSize(200,300);
        gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gui.setVisible(true);

    }
}
