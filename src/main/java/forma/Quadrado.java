package forma;

public class Quadrado extends Retangulo implements Forma {
    public Quadrado(double altura) {
        super(altura, altura);
    }

    @Override
    public double area() {
        return altura * altura;
    }
}
