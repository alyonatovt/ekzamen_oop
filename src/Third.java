public class Third {
    double g;
    double h;
    double i;

    public Third(double g, double h, double i) {
        this.g = g;
        this.h = h;
        this.i = i;
    }

    public double Calculate() {
        double sum = g + h + i;
        return sum / 3;
    }
}
