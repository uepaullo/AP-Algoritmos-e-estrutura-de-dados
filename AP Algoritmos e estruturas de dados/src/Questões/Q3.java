package Questões;
import javax.swing.*;
public class Q3 {
    public static void main(String[] args) {
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite sua altura em m"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite seu peso em Kg"));
        JOptionPane.showMessageDialog(null,
                "IMC = "+((peso)/(altura*altura)));
    }
}
