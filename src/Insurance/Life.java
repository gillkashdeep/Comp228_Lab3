package Insurance;

public class Life  extends  Insurance{
    public Life(String insuranceType)
    {
        super(insuranceType);
        setInsuranceCost();
    }

    @Override
    public void setInsuranceCost()
    {
        this.costMonthly = 500;
    }
    @Override
    public void displayInfo()
    {
        System.out.printf("---------------HERE IS YOUR INSURANCE DETAILS-------------------\n");
        System.out.printf("Insurance.Insurance Type : %s\n", typeInsurance);
        System.out.printf("Monthly Amount = $%.2f\n",costMonthly);
    }
}
