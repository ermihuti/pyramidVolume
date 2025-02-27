abstract class Pyramide {
    private double hohe;

    public Pyramide(double hohe) {
        this.hohe = hohe;
    }

    public double getHohe() {
        return hohe;
    }

    public abstract double volumen();
    public abstract double oberflache();
}