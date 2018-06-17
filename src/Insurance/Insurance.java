package Insurance;

abstract class Insurance
    {
    public String typeInsurance;
    public double costMonthly;
    public Insurance(String typeInsurance)
    {
        this.typeInsurance = typeInsurance;
    }
    public abstract void displayInfo();
    public abstract void setInsuranceCost();
    }



