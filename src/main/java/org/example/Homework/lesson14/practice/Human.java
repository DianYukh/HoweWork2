package org.example.Homework.lesson14.practice;

public class Human {
    // Завдання 1: Реалізуйте клас «Людина». Збережіть в полях класу:
    // ПІБ, дату народження, контактний телефон, місто, країну, домашню адресу.
    // Реалізуйте методи класу для введення даних, виведення даних.
    // Реалізуйте доступ до окремих полів через методи класу.

String name;
String dateofbirth;
String phonenumber;
String city;
String country;
String homeadress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHomeadress() {
        return homeadress;
    }

    public void setHomeadress(String homeadress) {
        this.homeadress = homeadress;
    }
}
