class DreieckPyramide extends Pyramide {
    private double grundseite;
    private double grundhohe;
    private double seitenkante;

    public DreieckPyramide(double grundseite, double grundhohe, double hohe, double seitenkante) {
        super(hohe);
        this.grundseite = grundseite;
        this.grundhohe = grundhohe;
        this.seitenkante = seitenkante;
    }

    @Override
    public double volumen() {
        double grundflache = 0.5 * grundseite * grundhohe;
        return (1.0 / 3) * grundflache * getHohe();
    }

    @Override
    public double oberflache() {
        double grundflache = 0.5 * grundseite * grundhohe;
        double seitendreieck = 0.5 * grundseite * seitenkante;
        return grundflache + 3 * seitendreieck;
    }
}