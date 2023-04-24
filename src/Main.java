import org.example.herenciamultiple.AlumnoDeportistaArtista;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\n");

        System.out.println("Primer ejercicio\n".toUpperCase());
        System.out.println("Area del cuadrado".toUpperCase());
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(5);
        System.out.println("Area = " + cuadrado.calcularArea());

        System.out.println("\nArea del circulo".toUpperCase());
        Circulo circulo = new Circulo();
        circulo.setRadio(2.4);
        System.out.println("Area = " + circulo.calcularArea());

        System.out.println("\nSegundo ejercicio\n".toUpperCase());
        AlumnoDeportistaArtista ada = new AlumnoDeportistaArtista();
        ada.setNombre("Juan");
        ada.setArte("Pintura");
        ada.setDeporte("Basquetball");
        System.out.println(ada);
        ada.ensayar("oleo");
        ada.entrenar();
        ada.presentarCompetencia("Naucali");


    }
}