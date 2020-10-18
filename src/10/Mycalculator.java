import javax.swing.*;

public class Mycalculator extends JFrame {

    public Mycalculator() {

        setTitle("Калькулятор");
        setSize(320, 310);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JTextField a = new JTextField();
        JTextField b = new JTextField();
        JButton slButton = new JButton("+");
        JButton raznButton = new JButton("-");
        JButton prButton = new JButton("*");
        JButton delButton = new JButton("/");
        JLabel result = new JLabel();
        JLabel firstnumber = new JLabel();
        JLabel secondnumber = new JLabel();
        JLabel resulttext = new JLabel();

        firstnumber.setText("Первое");
        secondnumber.setText("Второе");
        resulttext.setText("Р е з у л ь т а т :");
        a.setBounds(20, 40, 80, 30);
        add(a);
        b.setBounds(200, 40, 80, 30);
        add(b);
        result.setBounds(130, 200, 300, 30);
        add(result);
        slButton.setBounds(20, 110, 45, 30);
        add(slButton);
        raznButton.setBounds(92, 110, 45, 30);
        add(raznButton);
        prButton.setBounds(164, 110, 45, 30);
        add(prButton);
        delButton.setBounds(236, 110, 45, 30);
        add(delButton);
        firstnumber.setBounds(38,15,60,15);
        add(firstnumber);
        secondnumber.setBounds(220,15,60,15);
        add(secondnumber);
        resulttext.setBounds(110,170,120,15);
        add(resulttext);

        slButton.addActionListener(action -> {
            try {
                result.setText(String.format("%.2f", Double.parseDouble(a.getText()) + Double.parseDouble(b.getText())));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Некорректный ввод!");
            }
        });

        raznButton.addActionListener(action -> {
            try {
                result.setText(String.format("%.2f", Double.parseDouble(a.getText()) - Double.parseDouble(b.getText())));
            } catch (Exception E) {
                JOptionPane.showMessageDialog(null, "Некорректный ввод!");
            }
        });

        prButton.addActionListener(action -> {
            try {
                result.setText(String.format("%.2f", Double.parseDouble(a.getText()) * Double.parseDouble(b.getText())));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Некорректный ввод!");
            }
        });

        delButton.addActionListener(action -> {
            try {
                if (Double.parseDouble(b.getText())==0)
                    result.setText("Ошибка");
                else
                    result.setText(String.format("%.3f", Double.parseDouble(a.getText()) / Double.parseDouble(b.getText())));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Некорректный ввод!");
            }
        });


    }
}
