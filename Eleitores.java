import javax.swing.JOptionPane;

public class Eleitores {
    public static void main (String [] args){
        //Declaração
        int eleitores, brancos, nulos, validos;

        //Entrada
        eleitores = Integer.parseInt(JOptionPane.showInputDialog
        (null,"Digite a quantidade de eleitores : "));
        
        brancos = Integer.parseInt(JOptionPane.showInputDialog
        (null,"Digite a quantidade de votos em branco : "));

        nulos = Integer.parseInt(JOptionPane.showInputDialog
        (null,"Digite a quantidade de votos nulos : "));

        validos = Integer.parseInt(JOptionPane.showInputDialog
        (null,"Digite a quantidade de votos validos : "));

        //Processamento
        brancos = (brancos * 100) / eleitores;

        nulos = (nulos * 100) / eleitores;

        validos = (validos * 100) / eleitores;

        /*
         * 100% == eleitores
         *   X  == votos
         * 
         * 100  ==  50
         *   X  ==  50
         * 
         * 100. 50 == 50 . x
         * 
         * X == 5000 / 50
         * 
         * X == 100
         */

        //Saida
        JOptionPane.showMessageDialog
        (null,"Eleitors " + eleitores 
        + "\nVotos brancos : " + brancos
        + "%\nVotos nulos : " + nulos
        + "%\nVotos validos : " + validos + "%");

    }
}
