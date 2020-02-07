public class Contact {
    //min 2, max 50
    private String lastName;
    //min 1  , max 50
    private String firstName;
    //min 0 , max 50 , optional
    private String middleName;
    //min 10  , max 12 ,
    private String phone;
    private String email;

    public Contact (String firstName, String lastName, String phone, String email){

        this.firstName=firstName;
        this.lastName=lastName;
        this.phone = phone;
        this.email = email;
    }
//20 character
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
