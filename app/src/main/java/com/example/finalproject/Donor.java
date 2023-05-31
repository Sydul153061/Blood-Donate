package com.example.finalproject;

public class Donor {

    private String name;
    private String age;
    private String city;
    private String phone;
    private String gender;
    private String bloodgroup;

    public Donor()
    {

    }


    public Donor(String name, String age, String city, String phone, String gender, String bloodgroup) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.phone = phone;
        this.gender = gender;
        this.bloodgroup = bloodgroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }
}
