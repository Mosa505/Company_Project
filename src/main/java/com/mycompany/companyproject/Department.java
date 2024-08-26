
package com.mycompany.companyproject;
import java.util.ArrayList;

public class Department
{
    int Department_Number;
    String Department_Name;
    ArrayList<Employee> EmpList;
    
    public Department()
    {
    
    }
    
    public Department(int Department_Number, String Department_Name)
    {
        this.Department_Number = Department_Number;
        this.Department_Name = Department_Name;
        EmpList = new ArrayList<Employee>();
    }


    public int getDepartment_Number() {
        return Department_Number;
    }

    public void setDepartment_Number(int Department_Number) {
        this.Department_Number = Department_Number;
    }

    public String getDepartment_Name() {
        return Department_Name;
    }

    public void setDepartment_Name(String Department_Name) {
        this.Department_Name = Department_Name;
    }
    
    public void Add_Employee(Employee e)
    {
    EmpList.add(e);
    }
    
    public void Remove_Employee(Employee idx)
    {
    EmpList.remove(idx);
    }
    
    
    public int Get_Employee_Count()
    {
     return EmpList.size();
    }
    
    public void Brint_basic_data()
    {
    for (int i = 0 ; i<EmpList.size();i++)
    {
     System.out.println(EmpList.get(i).SSN +" "+EmpList.get(i).Name+" "+EmpList.get(i).getSex());
    
    }
    
    }
    
    public void Brint_All_Details()
    {
    for (int i = 0 ; i<EmpList.size();i++)
    {
        
    if (EmpList.get(i) instanceof SalariedEmployee)
    {
         ((SalariedEmployee) EmpList.get(i)).DisplayAllDetails();
    }
    
     if (EmpList.get(i) instanceof HourlyEmployee)
    {
         ((HourlyEmployee) EmpList.get(i)).DisplayAllDetails();
    }
     
      if (EmpList.get(i) instanceof Commission_Employee)
    {
         ((Commission_Employee) EmpList.get(i)).DisplayAllDetails();
    }
      
        if (EmpList.get(i) instanceof BasePlusCommissionEmployee)
    {
         ((BasePlusCommissionEmployee) EmpList.get(i)).DisplayAllDetails();
    }
    
    }
    
    }
        
    
    
    
}
