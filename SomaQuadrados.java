import javax.swing.JOptionPane;

public class SomaQuadrados{
    public static void main (String [] args){
        //Declaração de Variaveis
        int num1, num2, num3, num4, resultado;

        //Entrada
        num1 = Integer.parseInt(JOptionPane.showInputDialog
        (null,"Digite o primeiro numero :"));

        num2 = Integer.parseInt(JOptionPane.showInputDialog
        (null,"Digite o segundo numero :"));

        num3 = Integer.parseInt(JOptionPane.showInputDialog
        (null,"Digite o terceiro numero :"));
        
        num4 = Integer.parseInt(JOptionPane.showInputDialog
        (null,"Digite o quarto numero :"));

        //processamento
        num1 = num1 * num1;
        num2 = num2 * num2;
        num3 = num3 * num3;
        num4 = num4 * num4;

        resultado = num1 + num2 + num3 + num4;

        //Saida
        JOptionPane.showMessageDialog(null,"resultado : " + resultado);

    }
}