import javax.swing.JOptionPane;

public class Retangulo{
    public static void main (String [] args){
        //Declaração
        double base, altura, area;

        //Entrada
        base = Double.parseDouble(JOptionPane.showInputDialog
        (null,"Digite a base :"));

        altura = Double.parseDouble(JOptionPane.showInputDialog
        (null,"Digite a altura :"));

        //Processamento
        area = base * altura;

        //Saida
        JOptionPane.showMessageDialog(null, "A área é de "+ area);

    }
}