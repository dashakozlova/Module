package com.Kr;
import com.Kr.Manager;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private double salary;
    private Manager manager;
    public Employee(){
        this.id=1;
        this.name="unknown";
        this.surname="_";
        this.salary=1000;
    }
    public Employee(int id, String name, String surname){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.salary=1000;
    }
    public Employee(int id, String name, String surname,double salary){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.salary=salary;
    }
    public Employee(int id, String name, String surname,double salary, Manager manager){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.salary=salary;
        this.manager=manager;
    }

    public final int getId() {
        return id;
    }
    public final void setId(int id) {
        this.id = id;
    }
    public final String getName() {
        return name;
    }
    public final void setName(String name) {
        this.name = name;
    }
    public final String getSurname() {
        return surname;
    }
    public final void setSurname(String surname) {
        this.surname = surname;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public final Manager getManager() {
        return this.manager;
    }
    public final void setManager(Manager manager) {
        this.manager = manager;
    }
    public void raiseSalary(int n){
        this.salary= this.salary*n/100+ this.salary;
    }
    @Override
    public String toString() {
        return " id= " + getId() + ", name= " + getName() + ", surname= " + getSurname()  + ", salary= " + getSalary() +", manager= {"+getManager()+" } "+" ";
    }
    public String getNameManager(){
        if(getManager()!=null)
        {return getManager().getName()+" "+ getManager().getSurname();}
        else
        {return "No manager";}
    }
}


