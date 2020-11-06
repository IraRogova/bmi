public class BmiService {
    public double calculate(double w, double h) {
        w = 64;
        h = 1.74;
        double bodyMassIndex;
        bodyMassIndex = w / (h * h);
        return bodyMassIndex;
    }
}
