package solucao.forma;

public class Quadrado extends Retangulo implements Forma {

	public Quadrado(double lado) {
		super(lado, lado);
	}

	@Override
	public double area(){
		return altura * altura;
	}
}
