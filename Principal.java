
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa de Figuras Geométricas");
        System.out.println("===============================");

        System.out.println("Elija el tipo de figura:");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        System.out.print("Selección: ");
        int tipoFigura = scanner.nextInt();

        FigurasGeometricas figuras = null;

        switch (tipoFigura) {
            case 1:
                figuras = crearCirculo();
                break;
            case 2:
                figuras = crearRectangulo();
                break;
            case 3:
                figuras = crearTriangulo();
                break;
            default:
                System.out.println("Tipo de figura no válido.");
                return;
        }

        calcularYMostrarAreaYPerimetro(figura);
    }

    public static Circulo crearCirculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        return new Circulo(radio);
    }

    public static Rectangulo crearRectangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor del lado 1 del rectángulo: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Ingrese el valor del lado 2 del rectángulo: ");
        double lado2 = scanner.nextDouble();
        return new Rectangulo(lado1, lado2);
    }

    public static Triangulo crearTriangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor del lado 1 del triángulo: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Ingrese el valor del lado 2 del triángulo: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Ingrese el valor del lado 3 del triángulo: ");
        double lado3 = scanner.nextDouble();
        return new Triangulo(lado1, lado2, lado3);
    }

    public static void calcularYMostrarAreaYPerimetro(FiguraGeometrica figura) {
        System.out.println("Área de la figura: " + figura.obtenerArea());
        System.out.println("Perímetro de la figura: " + figura.obtenerPerimetro());
    }
}