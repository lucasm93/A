/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciointerface;

/**
 *
 * @author thomazerlach
 */
public class Cliente implements IAutenticavel, IImprimivel {
    
    @Override
    public boolean autenticar(double senha) {
        return true;
    }
    
    @Override
    public void exibirResumo() {
        System.out.println("Resumo aqui");
    }
    
    @Override
    public void imprimirResumo() {
        System.out.println("Resumo impresso");
    }
    
}
