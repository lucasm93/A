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
public abstract class Funcionario {
    protected String nome;
    protected int registro;
    protected double salario;
    
    public String getNome () {
        return this.nome;
    }
    
    public void setNome (String nomeNovo) {
        this.nome = nomeNovo;
    }
    
    public int getRegistro () {
        return this.registro;
    }
    
    public void setRegistro (int registroNovo) {
        this.registro = registroNovo;
    }
    
    public double getSalarioBase () {
        return this.salario;
    }
    
    public void setSalarioBase (double salarioNovo) {
        this.salario = salarioNovo;
    }
    
}
