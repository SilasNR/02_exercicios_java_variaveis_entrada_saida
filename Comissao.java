import javax.swing.JOptionPane;

public class Comissao{
    public static void main (String [] args){
        //Declaração
        double comissao;
        double quantidade;
        double preco;

        //Entrada
        preco = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o preço do produto :"));

        quantidade = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quantidade :"));

        //Processamento

        comissao = (preco * quantidade) * 0.05;

        //Saida
        JOptionPane.showMessageDialog(null,comissao);
    }
}