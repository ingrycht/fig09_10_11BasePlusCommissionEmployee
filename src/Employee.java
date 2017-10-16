/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    
    public Employee(){}

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setSocialSecurityNumber(socialSecurityNumber);
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    public String toString(){
        return String.format("Name: %s %s\nSocial Security Number: %s", getFirstName(), 
                getLastName(), getSocialSecurityNumber());
    
    }
    
}
