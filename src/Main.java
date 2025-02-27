public class Main {
    public static void main(String[] args) {
        DreieckPyramide dreieckPyramide = new DreieckPyramide(4, 3, 6);
        System.out.println("Dreieckpyramide Volumen: " + dreieckPyramide.volumen());

        QuadratischePyramide quadratischePyramide  = new QuadratischePyramide(4, 6);
        System.out.println("Quadratischepyramide  Volumen: " + quadratischePyramide.volumen());
    }
}

