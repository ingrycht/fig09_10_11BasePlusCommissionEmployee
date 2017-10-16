/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;

    public HourlyEmployee() {
        
    }

    public HourlyEmployee(double hours, double wage, String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
        setHours(hours);
        setWage(wage);
    }

    
    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
       if (hours < 0.0|| hours > 168) 
         throw new IllegalArgumentException(
            "Hours must be greater than 0 and less than 168"); 
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0.0) 
         throw new IllegalArgumentException(
            "Wage must be greater than 0 ");
        this.wage = wage;
    }
    public double earnings()
   {
       double salary = 0;
       if (hours > 40)
           salary = (getWage()*40) + ((getHours()- 40)*getWage() * 1.5);
           
       else
           salary = getWage() * getHours();
       
      return salary;
   }
    
    public String toString(){
        return String.format("\n%s\nHours worked: %.2f\nWage: € %.2f\nWeekly Salary: € %.2f", 
                super.toString(), getHours(), getWage(), earnings());
    
    }
    
    
}
