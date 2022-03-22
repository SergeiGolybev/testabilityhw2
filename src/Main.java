public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        double bmi = service.calculate(1.82, 85);
        System.out.println("Ваш индекс массы тела (BMI) составляет " + bmi + " kg/м²");
    }
}
