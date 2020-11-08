public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMassIndex = service.calculate(64,174);
        System.out.println(bodyMassIndex);
    }
}
