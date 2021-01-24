package buch.com.overview;

public class Person extends BseEntitity {
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "Person{" +
                "id='" + super.getId() +'\'' +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
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
}
