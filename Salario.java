import javax.swing.JOptionPane;

public class Salario {
    public static void main (String [] args){
        //Declaração
        double salario, percentual, nSalario;

        //Entrada
        salario = Double.parseDouble(JOptionPane.showInputDialog
        (null, "Digite o salario mensal atual : "));

        percentual = Double.parseDouble(JOptionPane.showInputDialog
        (null, "Digite o percentual de reajuste : "));

        //Processamento
        nSalario = salario + ((percentual * salario) / 100);


        /*
         * 100% == salario
         * perc == x
         * 
         * 100 * X == perc * salario
         * 
         * X == valor / 100
         * 
         * nSalario = salario + X
         * 
         */

        //Saida
        JOptionPane.showMessageDialog
        (null,"$f2 O salario : R$"+ nSalario);

    }
    
}
