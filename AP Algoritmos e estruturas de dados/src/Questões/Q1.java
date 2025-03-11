package Questões;
import javax.swing.*;
public class Q1 {
    public static void main(String[]args){
    double graus = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Digite a temperatura em Fahrenheit"));
    double celcius = (graus-32)/1.8;
    JOptionPane.showMessageDialog(null, "a temperatura em celsius será: "+
            String.format("%,.1f",celcius)+"°");
    }
}