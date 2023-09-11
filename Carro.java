import javax.swing.JOptionPane;

public class Carro {
    public static void main (String [] args){
        //Declaração
        double custoConsumidor, custoFabrica, porcenDistribuidora, imposto;

        //Entrada
        porcenDistribuidora = 28;
        imposto = 45;

        custoFabrica = Double.parseDouble(JOptionPane.showInputDialog
        (null,"Digite o custo de fabrica : "));

        //Processamento
        porcenDistribuidora = (porcenDistribuidora * custoFabrica) / 100;
        imposto = (imposto * custoFabrica) / 100;

        custoConsumidor = custoFabrica + porcenDistribuidora + imposto;

        //Saida
        JOptionPane.showMessageDialog(null,"Valor do carro : "+ custoConsumidor);

    }
    
}
