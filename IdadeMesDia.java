import javax.swing.JOptionPane;

public class IdadeMesDia {
    public static void main (String [] args){
        //Declaração
        int ano, mes, dia, total;

        //Entrada
        ano = Integer.parseInt(JOptionPane.showInputDialog
        (null,"Digite seu ano de nascimento:"));

        mes = Integer.parseInt(JOptionPane.showInputDialog
        (null,"Digite a o mes em que nasceu (em numeros) :"));

        dia = Integer.parseInt(JOptionPane.showInputDialog
        (null,"Digite o dia em que nasceu :"));

        //Processamento
        ano = 2023 - ano;
        mes = 9 - mes;
        dia = 8 - dia;

        total = (ano * 365) + (mes * 30) + dia;

        //Saida
        JOptionPane.showMessageDialog
        (null,"O total de dias vividos : "+ total);
    }
}
