public class Students {
    private  String firstname ;
    private String lastName ;
    private String nationality ;
    private  String dateOfbirth ;
    private  int phoneNumber ;
    private String email ;
    private String typeOfperiod ;

    public Students(String firstname, String lastName, String nationality, String dateOfbirth,
                    int phoneNumber, String email) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.nationality = nationality;
        this.dateOfbirth = dateOfbirth;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Students(String typeOfperiod) {
        this.typeOfperiod = typeOfperiod;
    }

    public String getFirstname() {
        return firstname;
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
        return "Students{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", dateOfbirth='" + dateOfbirth + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", typeOfperiod='" + typeOfperiod + '\'' +
                '}';
    }
}
