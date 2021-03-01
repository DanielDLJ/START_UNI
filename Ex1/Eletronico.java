/**
 *
 * @author Daniel
 */
public class Eletronico extends Produto{

    public Eletronico(String nome, double valor, int quantidade) {
        super(nome, valor, quantidade);
    }
    
    @Override
    public double calcularValorFinal(){
        return valor * quantidade  + valor * quantidade * 0.15;
    }
}
