import javax.swing.JOptionPane;

public class Idade{
    public static void main(String [] args){
        //Declaração
        int idade, dias;

        //Entrada
        idade = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Digite sua idade :"));

        //Processamento
        dias = idade * 365;

        //Saida
        JOptionPane.showMessageDialog
        (null,"A quantidade de dias é : " + dias);
    }
}