public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMassIndex = service.calculate(75,170);
        System.out.println(bodyMassIndex);
    }
}
