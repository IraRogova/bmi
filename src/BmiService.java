public class BmiService {
    public double calculate(double w, double h) {
        double bodyMassIndex = w / (h * h);
        return bodyMassIndex;
    }
}
