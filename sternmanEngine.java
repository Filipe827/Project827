public class sternmanEngine extends Engine {
    private boolean warningLightOn;

    public sternmanEngine (boolean warningLightOn){
        this.warningLightOn = warningLightOn;
    }


    public boolean needs_service(){
        return warningLightOn;
    }
}
