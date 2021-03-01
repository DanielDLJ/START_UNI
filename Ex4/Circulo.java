/**
 *
 * @author Daniel
 */
public class Circulo implements AreaCalculavel{
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    public float getRaio() { return raio; }

    public void setRaio(float raio) { this.raio = raio; }

    @Override
    public void area() {
        System.out.format("Area do circulo = %.2f\n", Math.PI*Math.pow(raio, 2));
    }
    
    
}
