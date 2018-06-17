package Student;

import java.util.Scanner;

public abstract class StudentClass
{
    private String stuName;
    private boolean status;
    private  int credit;

    public StudentClass(String stuName, boolean status,int credit)
    {
        this.stuName = stuName;
        this.status=status;
        this.credit=credit;
    }
    public String getstuName()
    {
        return stuName;
    }
    public boolean getStatus()
    {
        return status;
    }

    public int getCredit() {
        return credit;
    }
    abstract public void calFees();
}
