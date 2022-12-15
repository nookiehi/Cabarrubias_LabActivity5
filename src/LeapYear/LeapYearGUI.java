package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,checkLeapYear());
            }
        });
    }

    public String checkLeapYear() {
        try {
            GregorianCalendar calendar = new GregorianCalendar();
            int year = Integer.parseInt(tfYear.getText());
            if (calendar.isLeapYear(year)) {
                return "Leap Year";
            }
            return "Not a Leap Year";
        } catch (Exception e) {
            return "Invalid input. Not an integer";
        }
    }

    public static void main(String[] args){
        LeapYearGUI gui = new LeapYearGUI();
        gui.setContentPane(gui.panel1);
        gui.setSize(200,300);
        gui.setTitle("Leap Year Checker");
        gui.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gui.setVisible(true);
    }
}
