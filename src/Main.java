public class Main {
    public static void main(String[] args) {
        QuadratischePyramide quadratischePyramide  = new QuadratischePyramide(4, 6);
        System.out.println("Quadratischepyramide  Volumen: " + quadratischePyramide.volumen());

        KreisPyramide kreisPyramide = new KreisPyramide(3, 6);
        System.out.println("Kreispyramide Volumen: " + kreisPyramide.volumen());

        DreieckPyramide dreieckPyramide = new DreieckPyramide(5, 3, 6);
        System.out.println("Dreieckpyramide Volumen: " + dreieckPyramide.volumen());
    }
}

