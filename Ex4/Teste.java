import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in); 
        float raio;
        float largura;
        float altura;
        float lado;
        
        //Circulo
        System.out.println("Raio do circulo:");
        raio = in.nextFloat();
        Circulo circulo = new Circulo(raio);
        //Quadrado
        System.out.println("Lado do Quadrado:");
        lado = in.nextFloat();
        Quadrado quadrado = new Quadrado(lado);
        //Retangulo
        System.out.println("largura do Retangulo:");
        largura = in.nextFloat();
        System.out.println("altura do Retangulo:");
        altura = in.nextFloat();
        Retangulo retangulo = new Retangulo(largura, altura);
        
        //Calculo
        circulo.area();
        quadrado.area();
        retangulo.area();
    }
    
}
