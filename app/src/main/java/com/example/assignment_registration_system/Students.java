package com.example.assignment_registration_system;
public class Students {
    private  String firstName;
    private String lastName ;
    private String nationality ;
    private  String dateOfbirth ;
    private  int phoneNumber ;
    private String email ;
    private String typeOfperiod ;

    public Students(String firstname, String lastName, String nationality, String dateOfbirth,
                    int phoneNumber, String email,String typeOfperiod) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.nationality = nationality;
        this.dateOfbirth = dateOfbirth;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeOfperiod = typeOfperiod;
    }

    public Students() {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public String getDateOfbirth() {
        return dateOfbirth;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getTypeOfperiod() {
        return typeOfperiod;
    }

    @Override
    public String toString() {
        return
                "firstname=" + firstName + "\n" +
                "lastName=" + lastName + "\n" +
                " nationality=" + nationality + "\n" +
                " dateOfbirth=" + dateOfbirth + "\n" +
                "phoneNumber=" + phoneNumber + "\n"+
                "email=" + email + "\n" +
                "typeOfperiod=" + typeOfperiod + "\n" ;

    }
}
