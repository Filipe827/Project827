public class willoughbyEngine extends Engine {
    private int lastServiceMileage;
    private int currentMileage;

    public willoughbyEngine (int lastServiceMileage, int currentMileage){
        this.lastServiceMileage = lastServiceMileage;
        this.currentMileage = currentMileage;
    }

    public boolean needs_service(){
        return currentMileage - lastServiceMileage > 60000;
    }
}
