package Student;

public class FullTime extends  StudentClass
{
    double fees = 2000;
    public FullTime(String stuName, boolean status,int credits)

    {
        super(stuName,status,credits);
    }
    public  void calFees()
    {
        System.out.println("Student Information :");
        System.out.println("Student Name : " + super.getstuName());
        System.out.println("Status: " + super.getStatus());
        System.out.println("Full Time Fees"+ fees);
    }
}

