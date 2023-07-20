import java.time.LocalDate;

public class carFactory {

    public carFactory (){

    }

    public Car createCalliope(LocalDate lastServiceDate, int currentMileage, int lastServiceMileage, double[] tireWear){
        return new Car(new spindlerBattery(lastServiceDate), new capuletEngine(lastServiceMileage, currentMileage), new carriganTire(tireWear));
    }

    public Car createGlissade(LocalDate lastServiceDate, int currentMileage, int lastServiceMileage, double[] tireWear){
        return new Car(new spindlerBattery(lastServiceDate), new willoughbyEngine(lastServiceMileage, currentMileage), new octoprimeTire(tireWear));
    }

    public Car createPalindrome(LocalDate lastServiceDate, Boolean warningLightOn, double[] tireWear){
        return new Car(new spindlerBattery(lastServiceDate), new sternmanEngine(warningLightOn), new carriganTire(tireWear));
    }

    public Car createRorschach(LocalDate lastServiceDate, int currentMileage, int lastServiceMileage, double[] tireWear){
        return new Car(new nubbinBattery(lastServiceDate), new willoughbyEngine(lastServiceMileage,currentMileage), new octoprimeTire(tireWear));
    }

    public Car createThovex(LocalDate lastServiceDate, int currentMileage, int lastServiceMileage, double[] tireWear){
        return new Car(new nubbinBattery(lastServiceDate), new capuletEngine(lastServiceMileage, currentMileage), new carriganTire(tireWear));
    }
