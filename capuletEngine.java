public class capuletEngine extends Engine {
    private int lastServiceMileage;
    private int currentMileage;

    public capuletEngine (int lastServiceMileage, int currentMileage){
        this.lastServiceMileage = lastServiceMileage;
        this.currentMileage = currentMileage;
    }

    public boolean needs_service(){
        return (currentMileage - lastServiceMileage) > 30000;
    }
}
