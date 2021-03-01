/**
 *
 * @author Daniel
 */
public class Movel extends Produto{

    public Movel(String nome, double valor, int quantidade) {
        super(nome, valor, quantidade);
    }
    
    @Override
    public double calcularValorFinal(){
        if(quantidade < 10)
            return valor * quantidade  + valor * quantidade * 0.11;
        else
            return valor * quantidade  + valor * quantidade * 0.05;
    } 
}
