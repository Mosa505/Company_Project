
package com.mycompany.companyproject;


public class Commission_Employee extends Employee implements Displayable
{
    
    private double Gross_sales;
    private double Commission_rate;

    public double getGross_sales() {
        return Gross_sales;
    }

    public void setGross_sales(double Gross_sales) {
        this.Gross_sales = Gross_sales;
    }

    public double getCommission_rate() {
        return Commission_rate;
    }

    public void setCommission_rate(double Commission_rate) {
        this.Commission_rate = Commission_rate;
    }
    
   
  @Override
 public double Earnings()
 {
 return Commission_rate*Gross_sales;
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
    public String toString() {
        return "Commission_Employee "+"\n{" + "\nGross_sales = " + Gross_sales + "\nCommission_rate = " + Commission_rate + "\n}";
    }

    public Commission_Employee() {
    }

    public Commission_Employee(String Name, String Address, int SSN, Gender Sex , double Commission_Employee , double Gross_sales ) 
    {
        super(Name, Address, SSN, Sex);
        this.Commission_rate = Commission_Employee;
        this.Gross_sales = Gross_sales;
    }
 
 
 

    
}
