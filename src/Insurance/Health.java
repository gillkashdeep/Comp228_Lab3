package Insurance;

public class Health extends  Insurance
{
    public Health(String typeInsurance)
    {
        super(typeInsurance);
        setInsuranceCost();
    }
    @Override
    public void setInsuranceCost()
    {
        this.costMonthly = 250;
    }
    @Override
    public void displayInfo()
    {
        System.out.printf("---------------HERE IS YOUR INSURANCE DETAILS-------------------\n");
        System.out.printf("Insurance.Insurance Type : %s\n", typeInsurance);
        System.out.printf("Monthly Amount = $%.2f\n",costMonthly);
    }
}
