package forma;

public class CalculaArea {

    public static void main(String[] args) {
        Circulo c1 = new Circulo(2);
        Retangulo r1 = new Retangulo(2, 3);
        Quadrado q1 = new Quadrado(2);
        Triangulo t1 = new Triangulo(2, 3);

        System.out.println(calculaArea(c1));
        System.out.println(calculaArea(r1));
        System.out.println(calculaArea(q1));
        System.out.println(calculaArea(t1));
    }

    static double calculaArea(Forma forma){
        return forma.area();
    }
}