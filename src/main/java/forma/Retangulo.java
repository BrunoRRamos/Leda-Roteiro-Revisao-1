package forma;

public class Retangulo implements Forma{
    protected double altura;
    protected double largura;

    public Retangulo(double altura, double largura) {
        super();
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double area() {
        return largura * altura;
    }
}
