package Mortgage;

public class PersonalMortgage extends  MortgageClass
{
    public PersonalMortgage(long mortgageNumber,String customerName,float amount,float rate,int term)
    {
        super(mortgageNumber,customerName,amount,2+rate,term);
    }

    public void getMortgageInfo(){
        System.out.println("Customer Information for Personal Mortgage : ");
        System.out.println("Mortgage Number : " + super.getMortgageNumber() );
        System.out.println("Customer Name : " +super.getCustomerName());

        double interest = super.getAmount()*Math.pow((1+(super.getRate()/100)),super.getTerm());
        double totalAmount = super.getAmount()+interest;
        System.out.println("Amount : "+totalAmount);
        System.out.println(" Rate : " +super.getRate());
        System.out.println("Term : "+ super.getTerm());

    }
}
