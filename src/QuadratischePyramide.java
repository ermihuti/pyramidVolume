class QuadratischePyramide extends Pyramide {
    private double grundseite;

    public QuadratischePyramide(double grundseite, double hohe) {
        super(hohe);
        this.grundseite = grundseite;
    }

    @Override
    public double volumen() {
        double grundflache = grundseite * grundseite;
        return (1.0 / 3) * grundflache * getHohe();
    }
}