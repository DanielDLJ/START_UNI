import java.util.List;

/**
 *
 * @author Daniel
 */
public class Caixa {
    
    public void calcularTotal(List<Produto> lista){
        for( Produto produto : lista ) {
            System.out.format("%s || valor = %.2f || quantidade = %d || valor final = %.2f\n",
                    produto.getNome(),
                    produto.getValor(),
                    produto.getQuantidade(),
                    produto.calcularValorFinal());
        }
    }
}
