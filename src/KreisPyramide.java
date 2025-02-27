class KreisPyramide extends Pyramide {
    private double radius;

    public KreisPyramide(double radius, double hohe) {
        super(hohe);
        this.radius = radius;
    }

    @Override
    public double volumen() {
        double grundflache = Math.PI * radius * radius;
        return (1.0 / 3) * grundflache * getHohe();
    }
}