class DreieckPyramide extends Pyramide {
    private double grundseite;
    private double grundhohe;

    public DreieckPyramide(double grundseite, double grundhohe, double hohe) {
        super(hohe);
        this.grundseite = grundseite;
        this.grundhohe = grundhohe;
    }

    @Override
    public double volumen() {
        double grundflache = 0.5 * grundseite * grundhohe;
        return (1.0 / 3) * grundflache * getHohe();
    }
}