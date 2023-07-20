import java.time.LocalDate;

public class carFactory {

    public carFactory (){

    }

    public Car createCalliope(LocalDate lastServiceDate, int currentMileage, int lastServiceMileage){
        return new Car(new spindlerBattery(lastServiceDate), new capuletEngine(lastServiceMileage, currentMileage));
    }

    public Car createGlissade(LocalDate lastServiceDate, int currentMileage, int lastServiceMileage){
        return new Car(new spindlerBattery(lastServiceDate), new willoughbyEngine(lastServiceMileage, currentMileage));
    }

    public Car createPalindrome(LocalDate lastServiceDate, Boolean warningLightOn){
        return new Car(new spindlerBattery(lastServiceDate), new sternmanEngine(warningLightOn));
    }

    public Car createRorschach(LocalDate lastServiceDate, int currentMileage, int lastServiceMileage){
        return new Car(new nubbinBattery(lastServiceDate), new willoughbyEngine(lastServiceMileage,currentMileage));
    }

    public Car createThovex(LocalDate lastServiceDate, int currentMileage, int lastServiceMileage){
        return new Car(new nubbinBattery(lastServiceDate), new capuletEngine(lastServiceMileage, currentMileage));
    }
}