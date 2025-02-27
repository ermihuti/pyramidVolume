class KreisPyramide extends Pyramide {
    private double radius;
    private double seitenkante;

    public KreisPyramide(double radius, double hohe, double seitenkante) {
        super(hohe);
        this.radius = radius;
        this.seitenkante = seitenkante;
    }

    @Override
    public double volumen() {
        double grundflache = Math.PI * radius * radius;
        return (1.0 / 3) * grundflache * getHohe();
    }

    @Override
    public double oberflache() {
        double grundflache = Math.PI * radius * radius;
        double mantelflache = Math.PI * radius * seitenkante;
        return grundflache + mantelflache;
    }
}