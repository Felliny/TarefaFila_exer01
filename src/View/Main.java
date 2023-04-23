package View;

import Biblioteca.FilaObject.Fila;
import Controller.ControleSenha;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Fila filaprioritaria= new Fila();
        Fila filanormal= new Fila();

        for (int i=1; i<=8; i++){ //gerador de senha inicial
            filanormal.insert(i);
            filaprioritaria.insert(i);
        }
        ControleSenha p= new ControleSenha(filanormal, filaprioritaria);

        //menu11
        int opc= 0;
        while (opc != 9){
            opc= Integer.parseInt(JOptionPane.showInputDialog("MENU \n 1 - Atender cliente \n 2 - Gerar senha \n 9 - Sair"));
            switch (opc){
                case 1: p.AtenderCliente();
                    break;
                case 2: p.GerarSenha();
                    break;
                case 9: JOptionPane.showMessageDialog(null, "Programa Finalizado");
                    break;
                default: JOptionPane.showMessageDialog(null, "Opção Inválida!");
            }
        }

    }
}
