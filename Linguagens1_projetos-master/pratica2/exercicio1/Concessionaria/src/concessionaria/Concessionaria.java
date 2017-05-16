/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria;

/**
 *
 * @author thomazerlach
 */
public class Concessionaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionarios f1 = new Funcionarios("Alberto Roberto", "111.111.111-11", 1, 1000, 200);
        f1.exibirResumo();
        f1.contabilizarVenda(3000);
        f1.exibirResumo();
    }
    
}
