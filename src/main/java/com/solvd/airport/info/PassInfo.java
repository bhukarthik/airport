package com.solvd.airport.info;

public class PassInfo
{
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "PassInfo{"+firstName+ ":" +lastName+ ":" +gender+ ":" +age+"}";
    }
}
