package Questões;
import javax.swing.*;
public class Q4 {
    public static int[] power(int a){
        int[] pow = {(a*a),(a*a*a)};
        return pow;
    }
    public static void main(String[] args){
        int input = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite um número"));
        JOptionPane.showMessageDialog(null,
                input+"² = "+power(input)[0]+"\n" +
                        input+"³ = "+power(input)[1]);
    }
}
