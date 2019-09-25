package Task2;

public class Oxygen  implements Substance {
    double temperature;


    public Oxygen(double temperature) {
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
