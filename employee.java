package bha;
class emp {

    private String firstName;
    private String lastName;
    private int phoneNumber;

    // Default constructor
    public emp() {
    }

    // Parameterized constructor (not used in main, but good to have)
    public emp(String firstName, String lastName, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee [firstname=" + getFirstName()
                + ", lastname=" + getLastName()
                + ", phonenumber=" + getPhoneNumber() + "]";
    }
}

public class employee {
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.setFirstName("Jay");
        emp.setLastName("Kumar");
        emp.setPhoneNumber(77777);

        // Printing the object will automatically call toString()
        System.out.println(emp);
    }
}