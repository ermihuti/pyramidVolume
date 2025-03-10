public class Main {
    public static void main(String[] args) {
        QuadratischePyramide quadratischePyramide = new QuadratischePyramide(4, 6, 5);
        System.out.println("Quadratpyramide Volumen: " + quadratischePyramide.volumen());
        System.out.println("Quadratpyramide Oberfläche: " + quadratischePyramide.oberflache());

        KreisPyramide kreisPyramide = new KreisPyramide(3, 6, 5);
        System.out.println("Kreispyramide Volumen: " + kreisPyramide.volumen());
        System.out.println("Kreispyramide Oberfläche: " + kreisPyramide.oberflache());

        DreieckPyramide dreieckPyramide = new DreieckPyramide(4, 3, 6, 5);
        System.out.println("Dreieckpyramide Volumen: " + dreieckPyramide.volumen());
        System.out.println("Dreieckpyramide Oberfläche: " + dreieckPyramide.oberflache());
    }
}