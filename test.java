import java.time.LocalDate;

class test {
    public static void main(String[] args) {
        //Capulet test case 1: Does need service
        int currentMileage = 140000;
        int lastServiceMileage = 100000;
        Engine capuletEngine = new capuletEngine(lastServiceMileage, currentMileage);
        System.out.println("Does this Capulet engine need service?(True): " + capuletEngine.needs_service());

        //Capulet test case 2: Doesn't need service
        int currentMileage1 = 110000;
        int lastServiceMileage1 = 100000;
        Engine capuletEngine1 = new capuletEngine(lastServiceMileage1, currentMileage1);
        System.out.println("Does this Capulet engine need service?(False): " + capuletEngine1.needs_service());
        System.out.println(" ");

        //Sternman test case 1: Does need service
        boolean warninglightOn = true;
        Engine sternmanEngine = new sternmanEngine(warninglightOn);
        System.out.println("Does this Sternman engine need service?(True): " + sternmanEngine.needs_service());

        //Sternman test case 2: Doesn't need service
        boolean warninglightOn1 = false;
        Engine sternmanEngine1 = new sternmanEngine(warninglightOn1);
        System.out.println("Does this Sternman engine need service?(False): " + sternmanEngine1.needs_service());
        System.out.println(" ");

        //Willoughby test case 1: Does need service
        int lastServiceMileage2 = 100000;
        int currentMileage2 = 170000;
        Engine willoughbyEngine = new willoughbyEngine(lastServiceMileage2,currentMileage2);
        System.out.println("Does this Willougby engine need service?(True): " + willoughbyEngine.needs_service());

        //Willoughby test case 2: Doesn't need service
        int lastServiceMileage3 = 100000;
        int currentMileage3 = 130000;
        Engine willoughbyEngine1 = new willoughbyEngine(lastServiceMileage3,currentMileage3);
        System.out.println("Does this Willougby engine need service?(False): " + willoughbyEngine1.needs_service());
        System.out.println(" ");

        //Nubbin test case 1: Does need service
        LocalDate lastServiceDate = LocalDate.of(2019, 7, 20);
        Battery nubbinBattery = new nubbinBattery(lastServiceDate);
        System.out.println("Does this Nubbin battery need service?(True): " + nubbinBattery.needs_service());

        //Nubbin test case 2: Doesn't need service
        LocalDate lastServiceDate1 = LocalDate.of(2023, 7, 20);
        Battery nubbinBattery1 = new nubbinBattery(lastServiceDate1);
        System.out.println("Does this Nubbin battery need service?(False): " + nubbinBattery1.needs_service());
        System.out.println(" ");

        //Spindler test case 1: Does need service
        LocalDate lastServiceDate2 = LocalDate.of(2019, 7, 20);
        Battery spindlerBattery = new spindlerBattery(lastServiceDate2);
        System.out.println("Does this Spindler Battery need service?(True): " + spindlerBattery.needs_service());


        //Spindler test case 2: Doesn't need service
        LocalDate lastServiceDate3 = LocalDate.of(2023, 7, 20);
        Battery spindlerBattery1 = new spindlerBattery(lastServiceDate3);
        System.out.println("Does this Spindler Battery need service?(False): " + spindlerBattery1.needs_service());
        System.out.println(" ");

        //Carrigan test case 1: Does need service
        double[] tireWear = {0.2, 0.5, 0.1, 0.9};
        Tire carriganTire = new carriganTire(tireWear);
        System.out.println("Does this Carrigan Tire need service?(True): " + carriganTire.needs_service());

        //Carrigan test case 2: Doesn't need service
        double[] tireWear1 = {0.2, 0.5, 0.1, 0.4};
        Tire carriganTire1 = new carriganTire(tireWear1);
        System.out.println("Does this Carrigan Tire need service?(False): " + carriganTire1.needs_service());
        System.out.println(" ");

        //Octoprime test case 1: Does need service
        double[] tireWear2 = {0.9, 0.9, 0.8, 0.7};
        Tire octoTire = new octoprimeTire(tireWear2);
        System.out.println("Does this Octoprime Tire need service?(True): " + octoTire.needs_service());

        //Octoprime test case 2: Doesn't need service
        double[] tireWear3 = {0.5, 0.4, 0.3, 0.3};
        Tire octoTire1 = new octoprimeTire(tireWear3);
        System.out.println("Does this Octoprime Tire need service?(False): " + octoTire1.needs_service());
        System.out.println(" ");
    }
}
