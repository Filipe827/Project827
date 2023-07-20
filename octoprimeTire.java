public class octoprimeTire extends Tire{
    public double[] tireWear;

    public octoprimeTire(double[] tireWear){
        this.tireWear = tireWear;
    }
    double totalWear;

    public boolean needs_service() {
        for (int i = 0; i < tireWear.length; i++) {
            totalWear += tireWear[i];
            if (totalWear >= 3) {
                return true;
            }
        }
        return false;
    }
}
