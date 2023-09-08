import javax.swing.JOptionPane;

public class Antecessor{
    public static void main (String [] args){
        //Declaração
        int valor;

        //Entrada
        valor = Integer.parseInt(JOptionPane.showInputDialog
        (null,"Digite um valor :"));

        //Processamento
        valor--;

        //Saida
        JOptionPane.showMessageDialog(null,valor);
    }
}