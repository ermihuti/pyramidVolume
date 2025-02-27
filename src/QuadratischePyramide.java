class QuadratischePyramide extends Pyramide {
    private double seitenlaenge;
    private double seitenkante;

    public QuadratischePyramide(double seitenlaenge, double hohe, double seitenkante) {
        super(hohe);
        this.seitenlaenge = seitenlaenge;
        this.seitenkante = seitenkante;
    }

    @Override
    public double volumen() {
        double grundflache = seitenlaenge * seitenlaenge;
        return (1.0 / 3) * grundflache * getHohe();
    }

    @Override
    public double oberflache() {
        double grundflache = seitenlaenge * seitenlaenge;
        double seitendreieck = 0.5 * seitenlaenge * seitenkante;
        return grundflache + 4 * seitendreieck;
    }
}