/**
 *
 * @author Daniel
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 10 ; i<= 215; i++){
            if(i % 3 == 0 && i % 7 == 0)
                System.out.format("Numero %d e divisivel por 3 e por 7\n",i);
        }
    }
    
}
