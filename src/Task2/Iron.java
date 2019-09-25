package Task2;

public class Iron implements Substance {
    double temperature;

    public Iron(double temperature) {
        this.temperature = temperature;
    }


    @Override
    public void heatUp(double t) {
        temperature+=t;
    }



    @Override
    public double getTemperature() {
        return temperature;
    }

}
