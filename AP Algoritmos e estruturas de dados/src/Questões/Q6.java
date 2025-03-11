package Questões;
import javax.swing.*;
public class Q6 {
    public static double[] converting (String[] input){
        double[] convert = new double[input.length];
        for(int i=0;i<input.length;i++){
            convert[i] = Double.parseDouble(input[i]);
        }
        return convert;
    }
    public static void main(String[] args){
        String[] input = JOptionPane.showInputDialog(null,
                "Digite os valores de a, b e c respectivamente").split(" ");
        double[] converts = converting(input);
        double a = converts[0], b= converts[1], c = converts[2], delta = ((b*b)-4*(a*c));
        double delta2 = Math.sqrt(delta);
        double x1 = ((-b+delta2)/(2*a)), x2 = ((-b-delta2)/(2*a));

        JOptionPane.showMessageDialog(null,
                String.format("%,.0f",a)+"x² + "+String.format("%,.0f",b)+
                        "x "+String.format("%,.0f",c)+" = 0\nDelta = "+String.format("%,.0f",delta)+
                        "\nX₁ = "+x1+" X₂ = "+x2);
    }
}
