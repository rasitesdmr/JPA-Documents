package Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Personnel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personnelId;

    private String firstName;

    private String lastName;
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthOfDate;

    // KUllanıcı ikinci bir telefon numarasını girmek istediğinde ayrı bir tabloda Id ile eklenir
    @ElementCollection

    //Personnel_personnelId default değişkenimiz , değiştirmek için joincolumns kullanabiliriz.
    @CollectionTable(name = "PersonnelNumber", joinColumns = @JoinColumn(name = "PersonnelId"))
    private List<String> phoneNumber = new ArrayList<>();

    public Personnel() {
    }

    public Personnel(String firstName, String lastName, Date birthOfDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfDate = birthOfDate;
    }

    public void addPhoneNumber(String phoneNumber) {
        this.phoneNumber.add(phoneNumber);
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

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "personnelId=" + personnelId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthOfDate=" + birthOfDate +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
