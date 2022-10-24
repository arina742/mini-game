import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Windows {
    public static void showBox()
    {

        JFrame window = new JFrame("Узнай свою совместимость!!!");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setSize(300,200);
        window.getContentPane().setLayout(null);
        JButton button1 = new JButton();
        button1.setText("Результат");
        button1.setSize(125,50);
        button1.setLocation(80, 100);
        window.add(button1); //процесс добавления кнопки

        window.setLayout(new BorderLayout());
        window.add(new JLabel("               Узнай свою совместимость"), BorderLayout.CENTER);
        window.setVisible(true);
        window.setLocationRelativeTo(null);

        /*ActionListener AListener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int min = 50;
                int max = 101;
                double percents = Math.random() * (max - min) + min;
                JOptionPane.showMessageDialog(null, "       Результат совместимости: " + Math.round(percents) + "%", "Совместимость", JOptionPane.PLAIN_MESSAGE );
            }
        };
        button1.addActionListener(AListener1);*/
    }

    public static void showResult(JFrame window)
    {
        JLabel label = new JLabel("Хочешь узнать свою совместимость?", JLabel.CENTER);
        label.setAlignmentX(0);
        label.setAlignmentY(0);
        window.add(label);
    }
}

