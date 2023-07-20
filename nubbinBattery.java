import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class nubbinBattery extends Battery{
    private LocalDate lastServiceDate;
    private LocalDate currentDate;

    public nubbinBattery(LocalDate lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }

    public boolean needs_service() {
        currentDate = LocalDate.now();

        long yearsSinceLastService = ChronoUnit.YEARS.between(lastServiceDate, currentDate);

        if(yearsSinceLastService >= 4){
            return true;
        }else return false;
    }
    public static void main(String[] args) {
        LocalDate lastServiceDate = LocalDate.of(2021, 7, 19);
        nubbinBattery battery = new nubbinBattery(lastServiceDate);
        boolean needsService = battery.needs_service();
        System.out.println("Needs service: " + needsService);
    }

}
