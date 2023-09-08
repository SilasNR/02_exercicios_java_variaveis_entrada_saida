import javax.swing.JOptionPane;

public class Dolar{
    public static void main (String [] args){
        // Declaração de variaveis
        double cotacao;
        double quantDolar;
        double resultado;

        //Entrada
        cotacao = Double.parseDouble(JOptionPane.showInputDialog
        (null,"Digite a cotação do Dolar :"));

        quantDolar = Double.parseDouble(JOptionPane.showInputDialog
        (null,"Digite a cotação do Dolar :"));


        //Processamento 
        resultado = cotacao * quantDolar;

        //Saida 
        JOptionPane.showMessageDialog(null,resultado);


    }
}