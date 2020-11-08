public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double w = 64;
        double h = 1.74;
        double bodyMassIndex = service.calculate(w,h);
        System.out.println(bodyMassIndex);
    }
}
