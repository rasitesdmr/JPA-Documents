package Model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Entity
public class  Personnel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personnelId;

    private String firstName;

    private String lastName;

    @Temporal(TemporalType.TIME)
    private Date birthOfDate;

    @ElementCollection
    @CollectionTable(name = "phoneNumber", joinColumns = @JoinColumn(name = "personnelId"))
    @MapKeyColumn(name = "phoneType")
    @Column(name = "phoneNumber")
     private Map<String,String> phoneNumbers = new HashMap<>();

    public Personnel() {
    }

    public Personnel(String firstName, String lastName, Date birthOfDate ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfDate = birthOfDate;

    }
    public void addPhoneNumber(String key,String value  ){
        this.phoneNumbers.put(key, value);
    }

    public int getPersonnelId() {
        return personnelId;
    }

    public void setPersonnelId(int personnelId) {
        this.personnelId = personnelId;
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

    public Date getBirthOfDate() {
        return birthOfDate;
    }

    public void setBirthOfDate(Date birthOfDate) {
        this.birthOfDate = birthOfDate;
    }

    public Map<String, String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Map<String, String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "personnelId=" + personnelId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthOfDate=" + birthOfDate +
                '}';
    }
}
