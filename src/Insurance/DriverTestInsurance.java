package Insurance;

import java.util.Scanner;

public class DriverTestInsurance {

    public static void main(String[] args) {
        System.out.println("PLEASE SELECT ANY INSURANCE TYPE FOR  DETAILED INFORMATION ");
        System.out.println("H. Health Insurance   L.Life Insurance ");
        Insurance insurance;
        Scanner input = new Scanner(System.in);
        String str = input.next();
        if(str.equals("H"))
        {
            insurance = new Health("Health Insurance");
            insurance.displayInfo();
        }
        else if(str.equals("L"))
        {
            insurance = new Life("Life Insurance");
            insurance.displayInfo();
        }
            else
            {
            System.out.println("PLEASE SELECT PROVIDED OPTIONS FOR INSURANCE INFORMATION");
            }
    }
}
