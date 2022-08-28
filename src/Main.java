import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Windows.showBox();
        String firstName, secondName;
        firstName = JOptionPane.showInputDialog("Введите своё имя");
        secondName = JOptionPane.showInputDialog("Введите имя для проверки совместимости");
    }
}