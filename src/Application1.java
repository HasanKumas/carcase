import com.capgemini.carcase.model.Car;

public class Application1 {
    public static void main(String[] args) {
        Car car2 = new Car();
        double mileage = car2.drive();
        System.out.println(mileage);
    }
}
