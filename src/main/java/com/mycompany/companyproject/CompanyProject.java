
package com.mycompany.companyproject;




public class CompanyProject {

    public static void main(String[] args) {
       
      Department D1 = new Department(1,"QMB");
      
      SalariedEmployee e1 =new SalariedEmployee(15000,300,200,"mohamed", "cairo",220426,Gender.Male);
      D1.Add_Employee(e1);
      
     HourlyEmployee he = new HourlyEmployee(100, 6, "Mohamed","Kharj", 1500, Gender.Male);
        D1.Add_Employee(he);
        
     Commission_Employee ce = new Commission_Employee("Fatema", "Riyadh", 1200, Gender.Female,15000, 0.25);
       D1.Add_Employee(ce);
       
        System.out.println(D1.Get_Employee_Count());
       
        
    }
}
