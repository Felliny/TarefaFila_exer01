package Controller;

import Biblioteca.FilaObject.Fila;

import javax.swing.*;

public class ControleSenha {

    private Fila filaprioritaria;
    private Fila filanormal;
    private static int i;
    private static int senha= 9;
    private static int senhap= 9;

    public ControleSenha(Fila filanormal, Fila filaprioritaria){
        this.filanormal= filanormal;
        this.filaprioritaria= filaprioritaria;
    }
    public void AtenderCliente() {
        i++;
        if (i % 4 != 0){
            try {
                System.out.println("Um cliente da fila prioritária com a senha "+ filaprioritaria.remove() + "P foi atendido  \n Quantidade de senhas na fila prioritária: "+ filaprioritaria.size());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        else {
            try {
                System.out.println("Um cliente da fila normal com a senha "+ filanormal.remove() + "N foi atendido \n Quantidade de senhas na fila normal: "+ filanormal.size());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        if (filaprioritaria.isEmpty() && filanormal.isEmpty()){
            JOptionPane.showMessageDialog(null, "As filas estão vazias!! Por favor gerar senhas.");
        }
    }

    public void GerarSenha() {
        int opc= 0;
        while (opc != 9){
            opc= Integer.parseInt(JOptionPane.showInputDialog("Escolha a Fila \n 1 - Fila Normal \n 2 - Fila Prioritária \n 9 - Cancelar"));
            switch (opc){
                case 1: filanormal.insert(senha);
                    System.out.println("Senha gerada com Sucesso!");
                    System.out.println("Quantidade de senhas na fila normal: "+ filanormal.size());
                    senha++;
                    break;
                case 2: filaprioritaria.insert(senhap);
                    System.out.println("Senha gerada com Sucesso!");
                    System.out.println("Quantidade de senhas na fila prioritária: "+ filaprioritaria.size());
                    senhap++;
                    break;
                case 9:
                    break;
                default:JOptionPane.showMessageDialog(null, "Opção Inválida!");
            }
        }
    }
}
