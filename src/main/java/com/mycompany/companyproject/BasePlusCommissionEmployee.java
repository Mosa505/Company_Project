
package com.mycompany.companyproject;


public class BasePlusCommissionEmployee extends Commission_Employee
{
    private double Base ;

    public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }
    @Override
 public double Earnings()
 {
 return Base + super.Earnings();
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
        return "BasePlusCommissionEmployee "+"\n{" + " \nBase = " + Base + "\n}";
    }

    public BasePlusCommissionEmployee()
    {
        
    }

    public BasePlusCommissionEmployee(double Base, String Name, String Address, int SSN, Gender Sex, double Commission_Employee, double Gross_sales) 
    {
        super(Name, Address, SSN, Sex, Commission_Employee, Gross_sales);
        this.Base = Base;
    }
 
    
    
}
