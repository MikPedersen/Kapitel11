package Opgave2;

import java.util.Date;

public class Employee extends Person {
    private int office;
    private double salary;
    private Date hireDate;


    public Employee(String name, String address, String email, long phoneNumber, int office, double salary) {
        super(name, address, email, phoneNumber);
        this.office = office;
        this.salary = salary;
        this.hireDate = new Date();
    }
    @Override
    public String toString(){
        return getClass() + " " + getName();
    }


    public String getHireDate() {
        return hireDate.getMonth() + "/" + hireDate.getDay() + "/" + hireDate.getYear();
    }

    public void setHireDate() {
       hireDate = new Date();
    }
    public int getOffice() {
        return office;
    }

    public void setOffice(int office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
