
package com.mycompany.companyproject;


public class HourlyEmployee extends Employee implements Displayable
{
    private double Hour_rate;
    private int Number_of_hour;
    
    public void setHour_rate(double Hour_rate )
    {
    this.Hour_rate=Hour_rate;
    }
    
    public double getHour_rate()
    {
    return Hour_rate;
    }

    public int getNumber_of_hour() {
        return Number_of_hour;
    }

    public void setNumber_of_hour(int Number_of_hour) {
        this.Number_of_hour = Number_of_hour;
    }
    
    @Override
    public double Earnings()
    {
    return Number_of_hour * Hour_rate;
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
        return "HourlyEmployee\n"+"{ " + "\nHour_rate = " + Hour_rate + "\nNumber_of_hour = " + Number_of_hour + "\n}";
    }

    public HourlyEmployee() 
    {
        
    }

    public HourlyEmployee(double Hour_rate, int Number_of_hour, String Name, String Address, int SSN, Gender Sex) 
    {
        super(Name, Address, SSN, Sex);
        this.Hour_rate = Hour_rate;
        this.Number_of_hour = Number_of_hour;
    }

    
    
    
    
    
}
