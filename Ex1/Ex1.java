import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Produto> lista = new ArrayList<>();
        lista.add(new Eletronico("Ventilador",320,3));
        lista.add(new Eletronico("Computador",3999,2));
        lista.add(new Movel("Mesa",270,2));
        lista.add(new Produto("Caderno",10.50,10));
        lista.add(new Movel("Cadeira",234.25,2));
        lista.add(new Produto("Caneta",0.7,15));
        Caixa caixa = new Caixa();
        caixa.calcularTotal(lista);
    }
    
}
