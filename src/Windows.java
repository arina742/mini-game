import javax.swing.*;
import java.awt.*;


public class Windows {
    public static void showBox()
    {

        JFrame window = new JFrame("Узнай свою совместимость!");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setSize(300,300);
        window.getContentPane().setLayout(null);
        JButton button1 = new JButton();
        button1.setText("Результат");
        button1.setSize(125,50);
        button1.setLocation(80, 200);
        window.add(button1); //процесс добавления кнопки

        window.setLayout(new BorderLayout());
        window.add(new JLabel("Узнай свою совместимость"), BorderLayout.CENTER);
        window.setVisible(true);
        window.setLocationRelativeTo(null);



    }

    public static void showResult(JFrame window)
    {
        JLabel label = new JLabel("Хочешь узнать свою совместимость?", JLabel.CENTER);
        label.setAlignmentX(0);
        label.setAlignmentY(0);
        window.add(label);
    }
}

