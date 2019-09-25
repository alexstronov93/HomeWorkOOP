package Task2;

public class Water implements Substance {
    double temperature;

    public Water(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public void heatUp(double t) {
        temperature+=t;
    }

    public double getTemperature() {
        return temperature;
    }
}
