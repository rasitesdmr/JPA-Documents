package Model;

import javax.persistence.*;
import java.util.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String userName;
    private String firstName;
    private Date birthOfDate;

     @ElementCollection
     @CollectionTable(name = "userAddress" , joinColumns = @JoinColumn(name = "userId"))
    private List<Address> addresses = new ArrayList<>();
     

    public User() {
    }

    public User( String userName, String firstName, Date birthOfDate) {
        this.userName = userName;
        this.firstName = firstName;
        this.birthOfDate = birthOfDate;

    }
    public void addAddress(Address address){
        this.addresses.add(address);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(Date birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birthOfDate=" + birthOfDate +
                ", addresses=" + addresses +
                '}';
    }
}
