package Student;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StudentTest {

    public static void main(String[] args) throws  Exception {
        try
        {

            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.println("Enter Student Name");
            String name = br.readLine();
            System.out.println("Enter Status Press F for Full Time Or P for Part Time:");
            String status = br.readLine();
            int creditInt=0;
            if(status.equals("F"))
            {
                FullTime f= new FullTime(name,true,creditInt);
                f.calFees();
            }
            if(status.equals("P"))
                {
                    System.out.println("Enter credits:");
                    String credit = br.readLine();
                    creditInt = Integer.parseInt(credit);
                    PartTime p = new PartTime(name,true,creditInt);
                    p.calFees();
                }

        }
        catch(Exception e)
        {
        System.out.println("Please enter valid value");}
    }
}