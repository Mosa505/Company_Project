
package com.mycompany.companyproject;

enum Gender  { Male , Female };
public abstract class Employee 
{
    String Name;
    String Address;
    int SSN;
    Gender Sex ;
    
    public void setName (String Name)
    {
    this.Name = Name;
    }
    
    public String getName()
    {
        return Name ;
    }
    
    public void setAddress (String Address)
    {
    this.Address =Address;
    }
    
    public String getAddress()
    {
        return Address;
    }

    public int getSSN() 
    {
        return SSN;
    }

    public void setSSN(int SSN)
    {
        this.SSN = SSN;
    }

    public Gender getSex()
    {
        return Sex;
    }

    public void setSex(Gender Sex)
    {
        this.Sex = Sex;
    }
    
    public Employee()
    {
    
    }
    
    public Employee (String Name , String Address , int SSN , Gender Sex )
    {
    this.Name=Name; 
    this.Address=Address;
    this.SSN=SSN;
    this.Sex=Sex;
    
    }
    
    public abstract double Earnings();

    @Override
    public String toString() 
    {
        return " Employee \n"+"{"+"\n"+ " Name = " + Name + "\n Address = " + Address +" \n SSN = " + SSN + "\n Sex = " + Sex + "\n}";
    }
    
    
    
}
