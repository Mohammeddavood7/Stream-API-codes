package com.stream.mcqs;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private String gender;

    // Constructor
    public Employee(String name, int age, double salary, String gender) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    // Getters and setters for each variable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    // Override toString() method for easy printing
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }
    public Employee getHiked()
    {
    	if(this.getAge()>30)
    	{
    		this.setSalary(this.getSalary()+this.getSalary()*0.1);
    	}
    	return this;
    }
    
    public boolean getPrime()
    {
    	if(this.getAge()==1)return false;
    	for(int i=2;i<=this.getAge()/2;i++)
    	{
    		if(this.getAge()%i==0)return false;
    	}
    	return true;
    }
}
