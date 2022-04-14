public class Customer {
    private String ID;
    private String firstName;
    private String lastName;
    private String phone;
    
    //constructor
    public Customer(String ID, String firstName, String lastName, String phone) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }
    
    //constructor
    public Customer() {}
    
    //create setter & getter
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    //print out
    @Override
    public String toString() {
        return "ID = " + ID + ", firstName = " + firstName + ", lastName = " + lastName +
                ", phone = " + phone;
    }
}
