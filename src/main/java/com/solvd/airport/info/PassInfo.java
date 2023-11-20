package com.solvd.airport.info;

public class PassInfo
{
    private String FirstName;
    private String LastName;
    private int Age;

    private String Gender;

    public String getFirstName() {
        return this.FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }
    public String getLastName() {
        return this.LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }

    public int getAge() {
        return this.Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }
    public String getGender() {
        return Gender;
    }

    @Override
    public String toString() {
        return "PassInfo{"+FirstName+ ":" +LastName+ ":" +Gender+ ":" +Age+"}";
    }
}
