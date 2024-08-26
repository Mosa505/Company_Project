
package com.mycompany.companyproject;


public class SalariedEmployee extends Employee  implements Displayable 
{
    double Salary ;
    double Bonus ;
    double Deductions ;
    
    public void setSalary (double Salary)
    {
        this.Salary = Salary ;
    }
    
    public double getSalary ()
    {
        return Salary ;
    }

    public double getBonus() 
    {
        return Bonus;
    }

    public void setBonus(double Bonus)
    {
        this.Bonus = Bonus;
    }

    public double getDeductions() 
    {
        return Deductions;
    }

    public void setDeductions(double Deductions)
    {
        this.Deductions = Deductions;
    }

    public SalariedEmployee()
    {
        
    }

    public SalariedEmployee(double Salary, double Bonus, double Deductions, String Name, String Address, int SSN, Gender Sex)
    {
        super(Name, Address, SSN, Sex);
        this.Salary = Salary;
        this.Bonus = Bonus;
        this.Deductions = Deductions;
    }
    
     @Override
    public double Earnings()
    {
    return (Salary + Bonus)-Deductions;
    
    }
    
    @Override
    public void DisplayAllDetails()
    {
        System.out.println(super.toString());
        System.out.println(toString());
    }
   
    @Override
    public void DisplayEarning()
    {
        System.out.println(Earnings()); 
    }

    @Override
    public String toString() 
    {
        return "SalariedEmployee \n"+"{ " + " \n Salary = " + Salary + "\n Bonus = " + Bonus + "\n Deductions = " + Deductions + "\n}";
    }

    
    
}
