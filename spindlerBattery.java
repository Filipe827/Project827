import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class spindlerBattery extends Battery {

    private LocalDate lastServiceDate;
    private LocalDate currentDate;

    public spindlerBattery(LocalDate lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }

    public boolean needs_service() {
        currentDate = LocalDate.now();

        long yearsSinceLastService = ChronoUnit.YEARS.between(lastServiceDate, currentDate);

        return yearsSinceLastService >= 2;
    }

    public static void main(String[] args) {
        // Example usage:
        LocalDate lastServiceDate = LocalDate.of(2021, 7, 19); // Replace this with the actual last service date
        spindlerBattery battery = new spindlerBattery(lastServiceDate);
        boolean needsService = battery.needs_service();
        System.out.println("Needs service: " + needsService);
    }
}
