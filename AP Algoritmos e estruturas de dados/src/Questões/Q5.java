package Questões;
import javax.swing.*;
public class Q5 {
    public static double[] area(String[] input) {
        double[] convert = new double[input.length];
        for (int i = 0; i < convert.length; i++) {
            convert[i] = Double.parseDouble(input[i]);
        }
        return convert;
    }
    public static void main(String[] args) {
        String[] input = (JOptionPane.showInputDialog(null,
                "Digite a base e a altura do triângulo em cm").split(" "));
        double[] anwser = area(input);
        JOptionPane.showMessageDialog(null,
                "O valor da área será: " +
                        (anwser[0] * anwser[1])/2+"cm²","Area",1);
    }
}