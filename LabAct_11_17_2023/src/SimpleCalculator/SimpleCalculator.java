package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {
    private JPanel mainPanel;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JLabel lblResult;

    SimpleCalculator(){
         btnCompute.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try {
                     int n1 = Integer.parseInt(tfNumber1.getText());
                     int n2 = Integer.parseInt(tfNumber2.getText());
                     int operation = cbOperations.getSelectedIndex();
                     float res = 0;
                     switch (operation){
                         case 0:
                             res = n1 + n2;
                             break;
                         case 1:
                             res = n1 - n2;
                             break;
                         case 2:
                             res = n1 * n2;
                             break;
                         case 3:
                             if(n1 >= 0 && n2 == 0){
                                 JOptionPane.showMessageDialog(null, "Undefined");
                             }
                             res = (float) n1 / n2;
                     }

                     lblResult.setText(String.valueOf(res));
                 }catch (NumberFormatException err){
                     JOptionPane.showMessageDialog(null, "Invalid Input");
                     tfNumber1.setText("");
                     tfNumber2.setText("");
                 }
             }
         });
    }

    public static void main(String[] args) {
        SimpleCalculator window = new SimpleCalculator();
        window.setSize(800, 500);
        window.setTitle("Simple Calculator");
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setContentPane(window.mainPanel);
        window.setVisible(true);
    }
}
