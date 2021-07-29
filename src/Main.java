public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double BMI = service.calculate(90.0, 1.86);
        System.out.printf("Ваш ИМТ = " + "%.2f",BMI);
    }
}
