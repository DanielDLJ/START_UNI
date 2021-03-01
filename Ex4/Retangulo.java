/**
 *
 * @author Daniel
 */
public class Retangulo implements AreaCalculavel{
    private float largura;
    private float altura;

    public Retangulo(float largura, float altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public float getLargura() { return largura;}

    public void setLargura(float largura) { this.largura = largura;}

    public float getAltura() { return altura; }

    public void setAltura(float altura) { this.altura = altura; }

    @Override
    public void area() {
        System.out.format("Area do Retangulo = %.2f\n", largura * altura);
    }
    
}
