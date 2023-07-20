public class Car implements Serviceable {
    private Battery battery;
    private Engine engine;

    public Car (Battery battery, Engine engine){
        this.battery = battery;
        this.engine = engine;
    }

    public boolean needs_service(){
        return true;
    }
}
