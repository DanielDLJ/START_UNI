
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valorInicial, valorFinal, intervalo;
        Scanner in = new Scanner(System.in); 
        do{
            System.out.println("Intervalo Inicial:");
            valorInicial = in.nextInt();
            System.out.println("Intervalo Final:");
            valorFinal = in.nextInt();
            intervalo = valorFinal-valorInicial;
            String resposta = "Intervalo Inicial: "+ valorInicial + " | Intervalo Final: " + valorFinal + " (intervalo = " + intervalo;
            if(valorFinal-valorInicial > 15){
                System.out.println(resposta + ", invalido)");
                break;
            }
            System.out.println(resposta + ", valido)");
            for(int i = valorInicial; i <= valorFinal ; i++)
                System.out.format("o cubo do numero %d = %.0f\n",i,Math.pow(i, 3));
        }while(true);
    }
    
}
