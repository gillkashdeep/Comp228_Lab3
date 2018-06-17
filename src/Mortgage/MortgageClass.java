package Mortgage;

public abstract  class MortgageClass {
    private long mortgageNumber;
    private String customerName;
    private float amount;
    private float rate;
    private int  term;

    public MortgageClass(long mortgageNumber,String customerName,float amount,float rate,int term)
    {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        this.amount = amount;
        this.rate = rate;
        this.term = term;

    }

    public long getMortgageNumber()
    {
        return mortgageNumber;
    }
    public String getCustomerName()
    {
        return customerName;
    }
    public float getAmount()
    {
        return amount;
    }
    public float getRate()
    {
        return rate;
    }
    public int getTerm()
    {
        return term;
    }
    abstract public void getMortgageInfo();
}
