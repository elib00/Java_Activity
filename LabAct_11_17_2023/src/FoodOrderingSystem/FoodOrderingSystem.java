package FoodOrderingSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame {
    private JPanel mainPanel;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JCheckBox cFries;
    private JRadioButton rb10;
    private JCheckBox cSoftDrinks;
    private JRadioButton rb15;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JButton btnOrder;
    private JCheckBox cBurger;

    public FoodOrderingSystem(){
        JCheckBox foodChoices[] = {cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae};
        JRadioButton discountChoices[] = {rbNone, rb5, rb10, rb15};
        double[] prices = {100, 80, 65, 55, 50, 40};
        double[] deductions = {1, 0.95, 0.90, 0.85};

        for(JRadioButton choice : discountChoices){
            choice.setBackground(new Color(247, 246, 220));
        }

        rbNone.setSelected(true);

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                float total = 0;
                boolean choseSomething = false;
                for(int i = 0; i < foodChoices.length; i++){
                    if(foodChoices[i].isSelected()){
                        choseSomething = true;
                        total += prices[i];
                    }
                }

                if(!choseSomething){
                    JOptionPane.showMessageDialog(null, "Please select an item");
                    return;
                }

                for(int i = 0; i < discountChoices.length; i++){
                    if(discountChoices[i].isSelected()){
                        total *= deductions[i];
                        break;
                    }
                }

                JOptionPane.showMessageDialog(null, String.format("The total price is Php %.2f", total));
                for(int i = 0; i < foodChoices.length; i++){
                    foodChoices[i].setSelected(false);
                }
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderingSystem window = new FoodOrderingSystem();
        window.setSize(500, 500);
        window.setTitle("Food Ordering System");
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setContentPane(window.mainPanel);
        window.setVisible(true);

    }
}
