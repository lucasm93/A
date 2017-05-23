package testeheranca;

public class GerenteVendas extends Vendedor{
    private String senha;
    private int numVendedores;
    
    public GerenteVendas(String n, String c, int r, double s, double h){
        super(n, c, r, s, h);
    }
    
    public void contabilizarVendedor(){
        this.numVendedores = this.numVendedores + 1;
    }
    
    public boolean darAumento(Vendedor vend, double aumento, String senha){
        if (vend.getRegistroGerente() == this.registro){
            if (senha.equals(this.senha)){
                if (aumento > 0){
                    vend.setSalario(vend.getSalario()*aumento/100 + vend.getSalario());
                    return true;
                }
                else{
                   return false;
                }
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}
