public class Car implements Serviceable {
    private Battery battery;
    private Engine engine;

    private Tire tire;

    public Car (Battery battery, Engine engine, Tire tire){
        this.battery = battery;
        this.engine = engine;
        this.tire = tire;
    }

    public boolean needs_service(){
        return true;
    }
}
