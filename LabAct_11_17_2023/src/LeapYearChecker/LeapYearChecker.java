package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.time.Year.isLeap;

public class LeapYearChecker extends JFrame{
    private JPanel mainPanel;
    private JTextField tfYear;
    private JButton btncheckYear;
    private JLabel lableMessage;

    public LeapYearChecker(){
        btncheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(isLeap(Integer.parseInt(tfYear.getText()))){
                        JOptionPane.showMessageDialog(null, "Leap year");
                    }else{
                        JOptionPane.showMessageDialog(null, "Not a leap year");
                    }
                }catch(NumberFormatException err){
                    JOptionPane.showMessageDialog(null, "Invalid Input");
                }
            }
        });
    }

    public static void main(String[] args) {
        LeapYearChecker window = new LeapYearChecker();
        window.setSize(500, 500);
        window.setTitle("Leap Year Checker");
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setContentPane(window.mainPanel);
        window.setVisible(true);


    }
}
