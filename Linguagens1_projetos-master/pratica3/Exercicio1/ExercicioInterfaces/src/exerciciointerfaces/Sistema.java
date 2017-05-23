package exerciciointerfaces;

public class Sistema {
    
    public boolean login(IAutenticavel objeto, String senhaAcesso){
        return objeto.autenticar(senhaAcesso);        
    }
}
