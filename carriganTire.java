public class carriganTire extends Tire {
    public double[] tireWear;

    public carriganTire (double[] tireWear){
        this.tireWear = tireWear;
    }

    public boolean needs_service() {
        for (int i = 0; i < tireWear.length; i++) {
            double wear = tireWear[i];
            if (wear >= 0.9) {
                return true;
            }
        }
        return false;
    }
}
