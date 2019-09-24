package Task1;

public class ContractStudent extends Student {
    double priceContract;

    public ContractStudent(String name, int age, double priceContract) {
        super(name, age);
        this.priceContract = priceContract;
    }

    public double getPriceContract() {
        return priceContract;
    }

    public void setPriceContract(double priceContract) {
        this.priceContract = priceContract;
    }
}
