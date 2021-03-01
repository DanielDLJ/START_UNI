/**
 *
 * @author Daniel
 */
public class Quadrado implements AreaCalculavel{
    private float lado;

    public Quadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {return lado;}

    public void setLado(float lado) {this.lado = lado;}

    @Override
    public void area() {
        System.out.format("Area do Quadrado = %.2f\n", Math.pow(lado, 2));
    }
    
}
