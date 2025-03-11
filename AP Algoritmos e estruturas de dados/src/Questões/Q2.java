package Questões;
import javax.swing.*;
public class Q2 {
    public static void main(String[]args){
        double graus = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Digite a temperatura em Celcius"));
        double fahrenheit = (graus*1.8)+32;
        JOptionPane.showMessageDialog(null, "a temperatura em celsius será: "+
                String.format("%,.1f",fahrenheit)+"F");
    }
}