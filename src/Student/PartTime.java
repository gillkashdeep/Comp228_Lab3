package Student;

public   class PartTime extends StudentClass
{
    double fees = 100;
    public PartTime(String stuName, boolean status,int credits)

    {
        super(stuName,status);
    }
    public void calFees()
    {
        System.out.println("Student Information :");
        System.out.println("Student Name : " + super.getstuName());
        System.out.println("Status: " + super.getStatus());
        System.out.println("Part Time Fees"+super.getCredit()*fees );
    }
}
