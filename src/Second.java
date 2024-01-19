public class Second {
    double d;
    double e;
    double f;

    public Second(double d, double e, double f) {
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double Calculate() {
        double sum = d + e + f;
        return sum / 3;
    }
}


