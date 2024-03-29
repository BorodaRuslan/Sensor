package app;

public class WeightSensor extends Sensor {

    public WeightSensor() {
        this.substance.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Weight (g): "
                + Indicator.indicateWeight(substance.getState()));
    }
}
