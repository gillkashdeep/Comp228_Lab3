package Mortgage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProcessMortgage {
    static int number=0;

    public static void main(String[] args)throws Exception
    {
        MortgageClass[] mortgage= new MortgageClass[3];
        MortgageClass mort = null;
        boolean isValid=true;

        int i=0;
        int val=0;
        try{
            while(i<3&&isValid==true){

                System.out.println(++val+". Please Enter Current Interest Rate  : ");
                InputStreamReader isr= new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                Float rate= Float.parseFloat(br.readLine());
                System.out.println("Enter mortgage type : Business or Personal?");
                String type = br.readLine();
                System.out.println("Enter Customer name:");
                String name = br.readLine();
                System.out.println("enter Amount that is less than 300001 ");
                Float amount = Float.parseFloat(br.readLine());
                if(amount>MortgageConstants.MAX_AMOUNT)
                {
                    System.out.println("Amount should not be more than 300000");
                    return;
                }
                System.out.println("Enter Term Press 1 for Short term 3 for medium term 5 for long term:");
                Integer termDemo = Integer.parseInt(br.readLine());
                int term= MortgageConstants.SHORT_TERM;
                if(termDemo==MortgageConstants.SHORT_TERM||termDemo==MortgageConstants.MEDIUM_TERM ||termDemo==MortgageConstants.LONG_TERM){
                    term=termDemo;
                }
                if(type.equalsIgnoreCase("business"))
                {
                    mort = new BussinessMortgage(++number,name,amount,rate,term);
                }else if(type.equalsIgnoreCase("Personal"))
                {
                    mort = new PersonalMortgage(++number,name,amount,rate,term);
                }
                else{
                    System.out.println("Invalid Value of Type!!");
                    isValid = false;
                }
                if(isValid){
                    mortgage[i]=mort;
                    i++;
                }
                System.out.println("------------------------------------");
            }
            for(int j=0;j<3;j++)
            {
                mortgage[j].getMortgageInfo();
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid Value!!Please enter numerical value");
        }
        catch(Exception e)
        {
            System.out.println("Please enter valid value");
        }
    }
}
