
    import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.*;


    public class Coffee {

        public static void main(String[] args){

            JFrame frame = new JFrame();
            frame.setLayout(new GridLayout(6,0));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500,500);
            frame.setLocation(500,500);
            frame.setTitle("Заказ кофе");
            frame.setVisible(true);


            final JComboBox selectcoffe = new JComboBox<String>(new String[] {"Американо", "Капучино"});
            final JTextField countcup = new JTextField(" ");
            final JRadioButton countsugar = new JRadioButton("Нужен сахар");
            final JCheckBox cream = new JCheckBox("Нужен сливки");
            final JButton endbutton = new JButton("Сформировать заказ");
            final JTextField resultfield= new JTextField("Стоимость заказа");

            frame.add(selectcoffe);
            frame.add(countcup);
            frame.add(countsugar);
            frame.add(cream);
            frame.add(endbutton);

            endbutton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    float result = 0;
                    float cup = Float.parseFloat(countcup.getText());
                    if (selectcoffe.getSelectedItem().equals("Американо")) result+=200*cup;
                    else if(selectcoffe.getSelectedItem().equals("Капучино")) result+=350*cup;
                    if (countsugar.isSelected()) result+=20*cup;
                    if (cream.isSelected()) result+=10*cup;

                    frame.add(resultfield);
                    resultfield.setText(String.valueOf(result));
                }
            });
        }

    }

